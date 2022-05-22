package me.upp.daligz.p3.client.model;

import com.google.gson.Gson;
import me.upp.daligz.p3.backend.model.WSDatabase;
import me.upp.daligz.p3.backend.model.WSDatabase_Service;
import me.upp.daligz.p3.client.model.commons.User;

public class Model implements IData<User>{
    
    private final WSDatabase wsd;
    private static final Gson GSON = new Gson();

    public Model() {
        this.wsd = new WSDatabase_Service().getWSDatabasePort();
    }
    
    @Override
    public void create(final String name, final String user, final int password) {
        this.wsd.create(name, user, password);
    }

    @Override
    public User read(final int id) {
        return GSON.fromJson(this.wsd.read(id), User.class);
    }
    
    @Override
    public void update(final int id, final String value, final String valueToUpdate) {
        this.wsd.update(id, value, valueToUpdate);
    }

    @Override
    public void delete(final int id) {
        this.wsd.delete(id);
    }
}
