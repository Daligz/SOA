package me.upp.daligz.restserver;

import me.upp.daligz.p3.backend.modelo.SimpleSourceBuilder;
import me.upp.library.intelligod.IntelliGod;
import spark.Spark;

public class Server {
    
    private static final IntelliGod ROOT = IntelliGod.init(
        new SimpleSourceBuilder()
            .setUlr("jdbc:mysql://localhost:3306/bddatos?useSSL=false")
            .setUser("root")
            .setPassword("")
            .build()
    );
    
    //http://localhost:6969/create/yoana/yobiz/123
    public static void main(final String[] args) {
        Spark.port(6969);
        Spark.get("/create/:name/:user/:password", (request, response) -> {
            ROOT.create(
                    request.params(":name"),
                    request.params(":user"),
                    Integer.parseInt(request.params(":password"))
            );
            return "OK!";
        });
        Spark.get("/read/:id", (request, response) -> {
            return ROOT.read(Integer.valueOf(request.params(":id")));
        });
    }
}
