package me.upp.daligz.p3.client.model;

public interface IData<T> {
    void create(final String name, final String user, final int password);
    T read(final int id);
    void update(final int id, final String value, final String valueToUpdate);
    void delete(final int id);
}
