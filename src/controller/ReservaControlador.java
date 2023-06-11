package controller;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import dao.Reserva_Dao;
import factory.ConnectionFactory;
import modelo.reserva;

public class ReservaControlador {
	private Reserva_Dao reservas;
	
	public ReservaControlador() {
		Connection con = new ConnectionFactory().recuperarConexion();
		this.reservas = new Reserva_Dao(con);	
	}
	
	public void guardar (reserva res) {
		this.reservas.guardar(res);
	}
	
	public List<reserva> buscar(){
		return this.reservas.buscar();
	}
	public List<reserva> buscarId(String id){
		return this.reservas.buscarId(id);
	}
		
	public void actualizar(Date fechaEntrada, Date fechaSalida, String valor, String formaPago, Integer id) {
		this.reservas.Actualizar(fechaEntrada, fechaSalida, valor,formaPago, id);
	}
	
	public void Eliminar(Integer id) {
		this.reservas.Eliminar(id);
	}
}
