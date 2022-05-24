package me.upp.daligz.restclient;

import me.upp.library.intelligod.IntelliGod;

public class Client {
    
    private static final IntelliGod ROOT = IntelliGod.init(
        new SimpleSourceBuilder()
                .setUlr("jdbc:mysql://localhost:3306/bddatos?useSSL=false")
                .setUser("root")
                .setPassword("")
                .build()
    );
    
    public static void main(final String[] args) {
        IntelliGod.init(args)
    }
    
}
