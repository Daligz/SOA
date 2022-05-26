package me.upp.daligz.restclient.model;

import java.util.concurrent.CompletableFuture;
import me.upp.library.intelligod.IData;
import me.upp.library.intelligod.commons.User;

public class Model implements IData<User> {

    private final Model model = new Model();
    
    @Override
    public void create(final String name, final String user, int password) {
        this.model.create(name, user, password);
    }

    @Override
    public CompletableFuture<User> read(final int id) {
        return this.model.read(id);
    }

    @Override
    public void update(final int id, final String value, final String valueToUpdate) {
        this.model.update(id, value, valueToUpdate);
    }

    @Override
    public void delete(final int id) {
        this.model.delete(id);
    }
}
