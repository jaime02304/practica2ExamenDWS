package edu.Practica2.servicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import edu.Practica2.Dtos.pedidoDtos;
import edu.Practica2.Dtos.ventasDtos;
import edu.Practica2.controladores.inicioApp;

/**
 * implementacion de la interfaz gerencia
 */
public class gerenciaImplementacion implements gerenciaInterfaz {

	public void mostrarVentasDelDia() {
		System.out.println("Por favor, Introduzca la fecha con el siguiente formato dd-MM-yyyy");
		String fechaString = verificarFecha();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		for (ventasDtos venta : inicioApp.listaVentas) {
			if (venta.getFechaDateInstanteDate().format(formato).equals(fechaString)) {
				System.out.println("Venta número: " + venta.getId() + "\r\n" + "Euros: " + venta.getPrecio()
						+ "euros\r\n" + "Instante de compra:" + venta.getFechaDateInstanteDate());
			}
		}

	}

	/**
	 * Metodo que verifica si el formato de la fecha introducida es el correcto
	 * 
	 * @return
	 */
	private String verificarFecha() {
		String[] arrayFecha;
		String fechaString;
		do {
			fechaString = inicioApp.sc.next();
			arrayFecha = fechaString.split("-");
		} while (arrayFecha.length <= 0);
		return fechaString;
	}

	public void crearPedidos() {
		String afirmacionString;

		do {
			pedidoDtos pedido = new pedidoDtos();
			long id = idAutonumerico();
			System.out.println("Por favor, Introduzca la fecha con el siguiente formato dd-MM-yyyy para el pedido");
			String fecString = verificarFecha();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			pedido.setFechaDate(LocalDate.parse(fecString, formato));
			System.out.println("Dame el nombre del producto:");
			pedido.setNombrePedidoString(inicioApp.sc.next());
			System.out.println("Dame la cantidad del producto");
			pedido.setCantidadProducto(inicioApp.sc.nextInt());
			inicioApp.listaPedidos.add(pedido);

			System.out.println("¿Quieres volver a pedir otro pedido? si/no");
			afirmacionString = inicioApp.sc.next();
		} while (afirmacionString.equals("si"));

		for (pedidoDtos pedido : inicioApp.listaPedidos) {
			System.out.println("Producto: " + pedido.getNombrePedidoString() + "\r\n" + "Cantidad:"
					+ pedido.getCantidadProducto() + " unidades\r\n" + "Fecha entrega: " + pedido.getFechaDate() + "\r\n");
		}
	}

	private long idAutonumerico() {
		int tamaniLista = inicioApp.listaPedidos.size();
		long idAutomatico;
		if (tamaniLista <= 0) {
			idAutomatico = 1;
		} else {
			idAutomatico = inicioApp.listaPedidos.get(tamaniLista - 1).getId() + 1;
		}
		return idAutomatico;
	}

}
