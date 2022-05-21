package me.upp.daligz.p3.backend.model;

import java.sql.ResultSet;
import java.util.concurrent.CompletableFuture;
import me.upp.daligz.p3.backend.model.commons.User;
import me.upp.daligz.p3.backend.model.tables.TblUsers;
import me.upp.daligz.p3.backend.modelo.SimpleSourceBuilder;
import net.royalmind.library.lightquery.HikariPool;
import net.royalmind.library.lightquery.queries.LDelete;
import net.royalmind.library.lightquery.queries.LInsert;
import net.royalmind.library.lightquery.queries.LSelect;
import net.royalmind.library.lightquery.queries.LUpdate;

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
    public CompletableFuture<User> read(final String id) {
        final String query = new LSelect()
                .from(TblUsers.TBL_NAME.getValue())
                .value("*")
                .where(TblUsers.ID.getValue(), "=", id)
                .getQuery();
        final CompletableFuture<User> future = new CompletableFuture<>();
        HIKARI_POOL.execute(conn -> {
            final ResultSet result = conn.prepareStatement(query).executeQuery();
            if (result.first()) {
                future.complete(new User(
                        result.getString(TblUsers.NAME.getValue()),
                        result.getString(TblUsers.USER.getValue()),
                        result.getInt(TblUsers.ID.getValue()),
                        result.getInt(TblUsers.PASSWORD.getValue())
                ));
            } else {
                future.complete(null);
            }
            return null;
        });
        return future;
    }

    @Override
    public void update(final String id, final String value, final String valueToUpdate) {
        final String query = new LUpdate()
                .table(TblUsers.TBL_NAME.getValue())
                .update(value, valueToUpdate)
                .where(TblUsers.ID.getValue(), "=", id)
                .getQuery();
        HIKARI_POOL.execute(conn -> conn.prepareStatement(query).execute());
    }

    @Override
    public void delete(final String id) {
        final String query = new LDelete()
                .from(TblUsers.NAME.getValue())
                .where(TblUsers.ID.getValue(), "=", id)
                .getQuery();
        HIKARI_POOL.execute(conn -> conn.prepareStatement(query).execute());
    }
}