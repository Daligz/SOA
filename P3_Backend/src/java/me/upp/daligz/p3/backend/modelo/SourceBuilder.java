package me.upp.daligz.p3.backend.modelo;

import com.zaxxer.hikari.HikariConfig;

public class SourceBuilder {
    
    private String url = "", user = "", password = "";
    
    private final HikariConfig hikariConfig = new HikariConfig();
    
    public SourceBuilder setUlr(final String url) {
        this.url = url;
        return this;
    }
    
    public SourceBuilder setUser(final String user) {
        this.user = user;
        return this;
    }
    
    public SourceBuilder setPassword(final String password) {
        this.password = password;
        return this;
    }
    
    public HikariConfig build() {
        if (this.url.isEmpty() || this.user.isEmpty() || this.password.isEmpty()) return null;
        this.hikariConfig.setJdbcUrl(this.url);
        this.hikariConfig.setUsername(this.user);
        this.hikariConfig.setPassword(this.password);
        this.hikariConfig.addDataSourceProperty("cachePrepStmts", true);
        this.hikariConfig.addDataSourceProperty("prepStmtCacheSize", 250);
        this.hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", 2048);
        return this.hikariConfig;
    }
}
