package me.upp.library.intelligod.tables;

public enum TblUsers {
    
    TBL_NAME("tbusuarios"), ID("id"), NAME("nombre"),
    USER("usuario"), PASSWORD("psw");
    
    private final String value;

    private TblUsers(final String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}