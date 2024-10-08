package edu.Practica2.servicios;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import edu.Practica2.Dtos.ventasDtos;
import edu.Practica2.controladores.inicioApp;

public class empleadoImplementacion implements empleadoInterfaz {

	@Override
	public void aniadirVentas() {
		ventasDtos ventas = new ventasDtos();
		ventas.setId(idAutonumerico());
		System.out.println("Por favor, introduzca la cantidad en del precio.");
		ventas.setPrecio(inicioApp.sc.nextDouble());
		inicioApp.listaVentas.add(ventas);

	}

	/**
	 * Metodo privado que añade 1 a la ultima posicion del elemento de la lista en el identtificador(que lo hace autonumerico)
	 * @return
	 */
	private long idAutonumerico() {
		int tamaniLista = inicioApp.listaVentas.size();
		long idAutomatico;
		if (tamaniLista <= 0) {
			idAutomatico = 1;
		} else {
			idAutomatico = inicioApp.listaVentas.get(tamaniLista - 1).getId() + 1;
		}
		return idAutomatico;
	}

	
	
	public void mostrarVentasDelDia() {
		String fecha = verificarFecha();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		List<LocalDateTime> arrayFechas = new ArrayList<LocalDateTime>();
		double ventasTotales=0.0;
		
		for(ventasDtos ventas : inicioApp.listaVentas) {
			if (ventas.getFechaDateInstanteDate().format(formato).equals(fecha)) {
				ventasTotales+=ventas.getPrecio();
				arrayFechas.add(ventas.getFechaDateInstanteDate());
			}
		} 
		Duration diferencia = Duration.between(arrayFechas.get(0), arrayFechas.get(arrayFechas.size() - 1));
		
		if(diferencia.toMinutes()>1) {
			System.out.println("Las ventas totales del dias son: " + ventasTotales + "\n" + "La diferencia en minutos es menor de 1 minuto");
		}else {
			System.out.println("las ventas totales del dias son: " + ventasTotales + "\n" + "La diferencia en minutos es: " + diferencia.toMinutes());
		}
	}
	
	/**
	 * Metodo que verifica si el formato de la fecha introducida es el correcto
	 * @return
	 */
	private String verificarFecha() {
		String[] arrayFecha;
		String fechaString ;
		do {
			System.out.println("Por favor, Introduzca la fecha con el siguiente formato dd-MM-yyyy");
			 fechaString =inicioApp.sc.next();
			arrayFecha = fechaString.split("-");
		} while (arrayFecha.length<=0);
		return fechaString;
	}

}
