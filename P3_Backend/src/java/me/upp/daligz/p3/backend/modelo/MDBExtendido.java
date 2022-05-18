package me.upp.daligz.p3.backend.modelo;

import java.sql.SQLException;

/**
 *
 * @author Jazminrf
 */
public class MDBExtendido extends  MDB{
    public MDBExtendido(){
        MDB mDB = new MDB();

    }
    public  String modificarRegistro(String nombreTabla, String campos, String condicion,int limite){
		String resultado;
		table = nombreTabla;
		try {
			executer = conexion.ObtenerConexion().createStatement();
			sqlQuery = "UPDATE " + table + " SET " + campos + " WHERE " + condicion + " LIMIT "+String.valueOf(limite);
			executer.executeUpdate(sqlQuery);
			resultado =  "Las modificaciones fueron ejecutadas correctamente.";
		}
		catch (SQLException e) {
			resultado = e.toString() + "\n" + sqlQuery;
		}
		finally{
			try {
				//dataSet.close();
				executer.close();
			}
			catch (SQLException e) {
				System.out.print(e.toString());
			}
		}
		return resultado;
	}

   

}
