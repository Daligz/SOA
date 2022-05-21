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
    public void create(final String name, final String user, final String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public User read(final String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(final String value, final String valueToUpdate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(final String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}