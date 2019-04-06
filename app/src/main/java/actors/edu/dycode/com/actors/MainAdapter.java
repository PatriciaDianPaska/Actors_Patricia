package actors.edu.dycode.com.actors;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    public ArrayList<ActorsItem> listActors = new ArrayList<>();

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_actors, parent, false);
        return new MainViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final MainViewHolder holder, final int position) {
        holder.textName.setText(listActors.get(position).getChildren());
        holder.textChildren.setText(listActors.get(position).getName());

        Glide.with(holder.itemView.getContext())
                .load(listActors.get(position).getImage())
                .into(holder.imgProfile);
    }

    @Override
    public int getItemCount() {
        return listActors.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.txt_name)
        TextView textName;
        @BindView(R.id.img_profile)
        CircleImageView imgProfile;
        @BindView(R.id.txt_children)
        TextView textChildren;

        public MainViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}