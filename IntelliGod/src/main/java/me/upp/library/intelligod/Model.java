package me.upp.library.intelligod;

import com.zaxxer.hikari.HikariConfig;
import java.sql.ResultSet;
import java.util.concurrent.CompletableFuture;
import me.upp.daligz.p3.backend.modelo.SimpleSourceBuilder;
import me.upp.library.intelligod.commons.User;
import me.upp.library.intelligod.tables.TblUsers;
import net.royalmind.library.lightquery.HikariPool;
import net.royalmind.library.lightquery.queries.LDelete;
import net.royalmind.library.lightquery.queries.LInsert;
import net.royalmind.library.lightquery.queries.LSelect;
import net.royalmind.library.lightquery.queries.LUpdate;

public class Model implements IData<User> {

    private static HikariPool HIKARI_POOL;
    
    private static Model instance;

    private Model() { }

    public static Model getInstance() {
        if (instance == null) instance = new Model();
        return instance;
    }

    @Override
    public void create(final String name, final String user, final int password) {
        final String query = new LInsert()
                .table(TblUsers.TBL_NAME.getValue())
                .values(null, name, user, password)
                .getQuery();
        HIKARI_POOL.execute(conn -> conn.prepareStatement(query).execute());
    }

    @Override
    public CompletableFuture<User> read(final int id) {
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
    public void update(final int id, final String value, final String valueToUpdate) {
        final String query = new LUpdate()
                .table(TblUsers.TBL_NAME.getValue())
                .update(value, valueToUpdate)
                .where(TblUsers.ID.getValue(), "=", id)
                .getQuery();
        HIKARI_POOL.execute(conn -> conn.prepareStatement(query).execute());
    }

    @Override
    public void delete(final int id) {
        final String query = new LDelete()
                .from(TblUsers.TBL_NAME.getValue())
                .where(TblUsers.ID.getValue(), "=", id)
                .getQuery();
        HIKARI_POOL.execute(conn -> conn.prepareStatement(query).execute());
    }

    public void setHikariConfig(final HikariConfig hikariConfig) {
        hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        HIKARI_POOL = new HikariPool(hikariConfig);
    }
}