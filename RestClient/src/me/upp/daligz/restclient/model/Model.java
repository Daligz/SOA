package me.upp.daligz.restclient.model;

import me.upp.library.intelligod.Request;
import me.upp.library.intelligod.commons.User;

public class Model {
    
    private static final String URL = "http://localhost:6969";
    
    public void create(final String name, final String user, int password) {
        System.out.println(String.format(URL.concat("/create/%s/%s/%s"), name, user, password));
        Request.get(String.format(URL.concat("/create/%s/%s/%s"), name, user, password), String.class);
    }

    public User read(final int id) {
        return (User) Request.get(String.format(URL.concat("/read/%s"), String.valueOf(id)), User.class);
    }

    public void update(final int id, final String value, final String valueToUpdate) {
        Request.get(String.format(URL.concat("/update/%s/%s/%s"), String.valueOf(id), value, valueToUpdate), String.class);
    }

    public void delete(final int id) {
        Request.get(String.format(URL.concat("/delete/%s"), String.valueOf(id)), String.class);
    }
}
