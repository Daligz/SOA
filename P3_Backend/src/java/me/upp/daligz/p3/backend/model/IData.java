package me.upp.daligz.p3.backend.model;

import java.util.concurrent.CompletableFuture;

public interface IData<T> {
    void create(final String name, final String user, final String password);
    CompletableFuture<T> read(final String id);
    void update(final String id, final String value, final String valueToUpdate);
    void delete(final String id);
}
