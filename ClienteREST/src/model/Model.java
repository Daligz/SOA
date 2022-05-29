package model;

import com.google.gson.Gson;
import pkgRest.NewJerseyClient;

public class Model {

    private final NewJerseyClient client;
    private static final Gson GSON = new Gson();

    public Model(NewJerseyClient client) {
        this.client = client;
    }
    
    public void create(final User user) {
        this.client.create_JSON(GSON.toJson(user));
    }
    
    public User read(final String id) {
        return GSON.fromJson(this.client.find_JSON(String.class, id), User.class);
    }
    
    public void update(final User user) {
        this.client.edit_JSON(GSON.toJson(user), String.valueOf(user.getId()));
    }
    
    public void delete(final String id) {
        this.client.remove(id);
    }
    
}
