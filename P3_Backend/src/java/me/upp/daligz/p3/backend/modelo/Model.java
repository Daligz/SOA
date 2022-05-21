package me.upp.daligz.p3.backend.modelo;

import net.royalmind.library.lightquery.HikariPool;
import net.royalmind.library.lightquery.queries.LInsert;

public class Model {

    private static final HikariPool HIKARI_POOL = new HikariPool(
            new SimpleSourceBuilder()
                    .setUlr("jdbc:mysql://localhost:3306/bddatos?useSSL=false")
                    .setUser("root")
                    .setPassword("")
                    .build()
    );
    
    public static void main(final String args[]) {
        final String query = new LInsert()
                .table("tbusuarios")
                .values(null, "Jhon", "usuarioJhon", 1234)
                .getQuery();
        HIKARI_POOL.execute(conn -> conn.prepareStatement(query).execute());
    }
}