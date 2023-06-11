package controller;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import dao.Huespedes_Dao;
import factory.ConnectionFactory;
import modelo.Huespedes;

public class huespedesControlador {
	private Huespedes_Dao Huespedes_Dao;
	
	
	public huespedesControlador() {
		Connection connection = new ConnectionFactory().recuperarConexion();
		this.Huespedes_Dao = new Huespedes_Dao(connection);
	}
	
	public void guardar(Huespedes huespedes) {
		this.Huespedes_Dao.guardar(huespedes);
	}
	
	public  List<Huespedes> buscarHuespedes(){
		return this.Huespedes_Dao.buscar();
	}
	
	public  List<Huespedes> buscarHuespedesId(String id){
		return this.Huespedes_Dao.buscarId(id);
	}
	
	public void actualizar(String nombre, String apellido, Date fechaNacimiento, String nacionalidad, String telefono,Integer id_reserva) {
		this.Huespedes_Dao.Actualizar(nombre, apellido, fechaNacimiento, nacionalidad, telefono, id_reserva, id_reserva);
	}
	 
	public void Eliminar(Integer idReserva) {
		this.Huespedes_Dao.Eliminar(idReserva);
	}
	
	
}
