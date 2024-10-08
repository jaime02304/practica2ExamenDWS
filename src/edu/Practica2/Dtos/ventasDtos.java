package edu.Practica2.Dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Clase DTOs donde se encuentra los atributos de las ventas
 */
public class ventasDtos {
	
	long id;
	double precio=0;
	LocalDateTime fechaDateInstanteDate = LocalDateTime.now();
	
	public ventasDtos(long id, double precio, LocalDateTime fechaDateInstanteDate) {
		super();
		this.id = id;
		this.precio = precio;
		this.fechaDateInstanteDate = fechaDateInstanteDate;
	}

	public ventasDtos() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public LocalDateTime getFechaDateInstanteDate() {
		return fechaDateInstanteDate;
	}

	public void setFechaDateInstanteDate(LocalDateTime fechaDateInstanteDate) {
		this.fechaDateInstanteDate = fechaDateInstanteDate;
	}
	
	

}
