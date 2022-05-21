package me.upp.daligz.p3.backend.model;

import me.upp.daligz.p3.backend.model.commons.User;
import me.upp.daligz.p3.backend.modelo.SimpleSourceBuilder;
import net.royalmind.library.lightquery.HikariPool;

public class Model implements IData<User> {

    private static final HikariPool HIKARI_POOL = new HikariPool(
            new SimpleSourceBuilder()
                    .setUlr("jdbc:mysql://localhost:3306/bddatos?useSSL=false")
                    .setUser("root")
                    .setPassword("")
                    .build()
    );

    @Override
    public void create(String name, String user, String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public User read(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(String value, String valueToUpdate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}