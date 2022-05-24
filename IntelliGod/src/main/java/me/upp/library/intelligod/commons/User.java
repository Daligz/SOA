package me.upp.library.intelligod.commons;

public class User {
    
    private final String name, user;
    private final int id, password;

    public User(final String name, final String user, final int id, final int password) {
        this.name = name;
        this.user = user;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

    public int getId() {
        return id;
    }

    public int getPassword() {
        return password;
    }
}
