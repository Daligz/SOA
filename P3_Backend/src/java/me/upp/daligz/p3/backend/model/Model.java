package me.upp.daligz.p3.backend.model;

import me.upp.daligz.p3.backend.model.commons.User;
import me.upp.daligz.p3.backend.model.tables.TblUsers;
import me.upp.daligz.p3.backend.modelo.SimpleSourceBuilder;
import net.royalmind.library.lightquery.HikariPool;
import net.royalmind.library.lightquery.queries.LInsert;

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
        final String query = new LInsert()
                .table(TblUsers.TBL_NAME.getValue())
                .values(null, name, user, password)
                .getQuery();
        HIKARI_POOL.execute(conn -> conn.prepareStatement(query).execute());
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