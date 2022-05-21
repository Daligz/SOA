package me.upp.daligz.p3.backend.model;

public interface IData<T> {
    void create(final String name, final String user, final String password);
    T read(final String id);
    void update(final String value, final String valueToUpdate);
    void delete(final String id);
}
