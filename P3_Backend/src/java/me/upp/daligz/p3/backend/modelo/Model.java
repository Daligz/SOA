package me.upp.daligz.p3.backend.modelo;

import net.royalmind.library.lightquery.HikariPool;

public class Model {

    private static final HikariPool HIKARI_POOL = new HikariPool(
            new SourceBuilder()
                    .setUlr("jdbc:mysql://localhost:6868/bddatos?useSSL=false")
                    .setUser("root")
                    .setPassword("")
                    .build()
    );
    
    
}
