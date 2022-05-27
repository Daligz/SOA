package me.upp.daligz.restclient.model;

import java.util.concurrent.CompletableFuture;
import me.upp.library.intelligod.IData;
import me.upp.library.intelligod.commons.User;

public class Model implements IData<User> {
    
    @Override
    public void create(final String name, final String user, int password) {
        
    }

    @Override
    public CompletableFuture<User> read(final int id) {

    }

    @Override
    public void update(final int id, final String value, final String valueToUpdate) {

    }

    @Override
    public void delete(final int id) {

    }
}
