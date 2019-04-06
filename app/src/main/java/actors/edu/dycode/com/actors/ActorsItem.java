package actors.edu.dycode.com.actors;

import com.google.gson.annotations.SerializedName;

public class ActorsItem {
    @SerializedName("country")
    private String country;
    @SerializedName("image")
    private String image;
    @SerializedName("children")
    private String children;
    @SerializedName("dob")
    private String dob;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("spouse")
    private String spouse;
    @SerializedName("height")
    private String height;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}


