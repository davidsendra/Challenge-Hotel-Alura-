package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class usuario {
	private String nombre;
	private String password;
	
	public usuario(String nombre, String password) {
		this.nombre = nombre;
		this.password = password;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public static boolean validarUsuario(String nombre, String password) {
		ConnectionFactory conexion = new ConnectionFactory();
		Connection connection = null;
		PreparedStatement state = null;
		ResultSet result = null;
		try {
			connection = conexion.recuperarConexion();
			state = connection.prepareStatement("SELECT * FROM usuarios WHERE nombre = ? AND contrasena = ?");
			state.setString(1, nombre);
			state.setString(2, password);
			result = state.executeQuery();
			return result.next();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			try {
				if (result !=null)
					result.close();
				if (state !=null)
					state.close();
				if (connection !=null)
					connection.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}

}
