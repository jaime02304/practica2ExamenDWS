package edu.Practica2.servicios;

import edu.Practica2.controladores.inicioApp;

/**
 * implementacion de la interfaz de menuInterfaz
 */
public class menuImplementacion implements menuInterfaz {

	
	public byte menuPrincipal() {
		System.out.println("Bienvenido al menu inicial");
		System.out.println("Opcion 0. Cerrar la aplicacion");
		System.out.println("Opcion 1. Version empleado");
		System.out.println("Opcion 2. Version gerente");
		System.out.println("Elija una opcion:");
		byte opcion = inicioApp.sc.nextByte();
		return opcion;
	}

	@Override
	public byte menuEmpleado() {
		System.out.println("Bienvenido al menu de empelados");
		System.out.println("Opcion 0. Volver al menu principal");
		System.out.println("Opcion 1. Añadir venta");
		System.out.println("Opcion 2. Cálculo total de ventas diario");
		System.out.println("Elija una opcion:");
		byte opcion = inicioApp.sc.nextByte();
		return opcion;
	}

	@Override
	public byte menuGerencia() {
		System.out.println("Bienvenido al menu de gerentes");
		System.out.println("Opcion 0. Volver al menu principal");
		System.out.println("Opcion 1. Mostrar ventas del día");
		System.out.println("Opcion 2. Crear pedido para proveedores");
		System.out.println("Elija una opcion:");
		byte opcion = inicioApp.sc.nextByte();
		return opcion;
	}

}
