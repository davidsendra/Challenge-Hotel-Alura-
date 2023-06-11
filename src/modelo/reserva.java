package modelo;

import java.sql.Date;

public class reserva {
private Integer id;
private Date fechaEntrada;
private Date fechaSalida;
private String valor;
private String formaPago;


public reserva(Date fechaEntrada, Date fechaSalida, String valor, String formaPago) {
	super();
	this.fechaEntrada = fechaEntrada;
	this.fechaSalida = fechaSalida;
	this.valor = valor;
	this.formaPago = formaPago;
}


public reserva(Integer id,Date fechaEntrada, Date fechaSalida, String valor, String formaPago) {
	super();
	this.id = id;
	this.fechaEntrada = fechaEntrada;
	this.fechaSalida = fechaSalida;
	this.valor = valor;
	this.formaPago = formaPago;
}
 


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Date getfechaEntrada() {
	return fechaEntrada;
}
public void setfechaEntrada(Date fechaEntrada) {
	this.fechaEntrada = fechaEntrada;
}
public Date getfechaSalida() {
	return fechaSalida;
}
public void setfechaSalida(Date fechaSalida) {
	this.fechaSalida = fechaSalida;
}
public String getValor() {
	return valor;
}
public void setValor(String valor) {
	this.valor = valor;
}
public String getFormaPago() {
	return formaPago;
}
public void setFormaPago(String formaPago) {
	this.formaPago = formaPago;
}


}

