package actors.edu.dycode.com.actors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.Collection;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.list_actors)
    RecyclerView listActors;

    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        adapter = new MainAdapter();
        listActors.setLayoutManager(new LinearLayoutManager(this));
        listActors.setAdapter(adapter);
        listActors.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
        RestClient.getActorsService().getActors().enqueue(new Callback<ActorsService>() {

            @Override
            public void onResponse(Call<ActorsService> call, Response<ActorsService> response) {
                adapter.listActors.addAll((Collection<? extends ActorsItem>) response.body().getActors());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ActorsService> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}