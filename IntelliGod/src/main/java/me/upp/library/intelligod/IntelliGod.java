package me.upp.library.intelligod;

import com.google.gson.Gson;
import com.zaxxer.hikari.HikariConfig;

import java.util.concurrent.atomic.AtomicReference;

public final class IntelliGod {

    private static final Gson GSON = new Gson();

    public static IntelliGod init(final HikariConfig hikariConfig) {
        Model.getInstance().setHikariConfig(hikariConfig);
        return new IntelliGod();
    }

    private IntelliGod() { }

    public String create(final String name, final String user, int password) {
        Model.getInstance().create(name, user, password);
        return "OK!";
    }

    public String read(final int id) {
        final AtomicReference<String> atomicResponse = new AtomicReference<>();
        Model.getInstance().read(id).whenCompleteAsync((user, throwable) -> {
            if (throwable != null) {
                atomicResponse.updateAndGet(t -> throwable.getMessage());
                return;
            }
            atomicResponse.updateAndGet(t -> GSON.toJson(user));
        });

        // Keep alive
        while(true) if (atomicResponse.get() != null) return atomicResponse.get();
    }

    public String update(final int id, final String value, final String valueToUpdate) {
        Model.getInstance().update(id, value, valueToUpdate);
        return "OK!";
    }

    public String delete(final int id) {
        Model.getInstance().delete(id);
        return "OK!";
    }
}
