package me.upp.daligz.p3.backend.modelo;

import java.sql.*;

public class Conexion {
	
	private String driver = null;
	private String password = null;
	private String url = null;
	private String user = null;
	public Connection connection;

	public Conexion(String controlador,  String URL, String usuario,String contrasena) {
		driver = controlador;
		password = contrasena;
		url = URL;
		user = usuario;
	}
	
	public Connection ObtenerConexion(){
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			return connection;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
			return null;		
	}
	
	public void setDriver(String controlador){
		driver = controlador;
	}

	public void setPassword(String contrasena){
		password = contrasena;
	}
	
	public void setURL(String URL){
		url = URL;
	}
	
	public void setUser(String usuario){
		user = usuario;
	}
	
	public String getDriver(){
		return driver;
	}

	public String getPassword(){
		return password;
	}

	public String getURL(){
		return url;
	}

	public String getUser(){
		return user;
	}
}
