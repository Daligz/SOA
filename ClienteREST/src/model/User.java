package model;

public class User {
    
    private int id;
    private String nombre;
    private String usuario;
    private int psw;
    
    public User(int id, String nombre, String usuario, int psw) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.psw = psw;
    }
    
    public User(String nombre, String usuario, int psw) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.psw = psw;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getPsw() {
        return psw;
    }
}
