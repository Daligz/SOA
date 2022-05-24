package me.upp.library.intelligod;

import java.util.concurrent.CompletableFuture;

public interface IData<T> {
    void create(final String name, final String user, final int password);
    CompletableFuture<T> read(final int id);
    void update(final int id, final String value, final String valueToUpdate);
    void delete(final int id);
}
