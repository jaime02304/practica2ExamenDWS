package edu.Practica2.Dtos;

import java.time.LocalDate;

public class pedidoDtos {
	
	long id;
	String nombrePedidoString="aaaaa";
	LocalDate fechaDate;
	int cantidadProducto=0;
	
	public pedidoDtos(long id, String nombrePedidoString, LocalDate fechaDate, int cantidadProducto) {
		super();
		this.id = id;
		this.nombrePedidoString = nombrePedidoString;
		this.fechaDate = fechaDate;
		this.cantidadProducto = cantidadProducto;
	}

	public pedidoDtos() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombrePedidoString() {
		return nombrePedidoString;
	}

	public void setNombrePedidoString(String nombrePedidoString) {
		this.nombrePedidoString = nombrePedidoString;
	}

	public LocalDate getFechaDate() {
		return fechaDate;
	}

	public void setFechaDate(LocalDate fechaDate) {
		this.fechaDate = fechaDate;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	
	
	
	
	
}
