package edu.Practica2.controladores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import edu.Practica2.Dtos.pedidoDtos;
import edu.Practica2.Dtos.ventasDtos;
import edu.Practica2.servicios.empleadoImplementacion;
import edu.Practica2.servicios.empleadoInterfaz;
import edu.Practica2.servicios.gerenciaImplementacion;
import edu.Practica2.servicios.gerenciaInterfaz;
import edu.Practica2.servicios.menuImplementacion;
import edu.Practica2.servicios.menuInterfaz;

/**
 * clase donde se encuentra el metodo main y todo el procedimiento
 */
public class inicioApp {

	public static Scanner sc = new Scanner(System.in);
	public static List<ventasDtos> listaVentas = new ArrayList<ventasDtos>();
	public static List<pedidoDtos> listaPedidos = new ArrayList<pedidoDtos>();

	/**
	 * metodo main con su procedimiento
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		menuInterfaz mi = new menuImplementacion();
		empleadoInterfaz em = new empleadoImplementacion();
		gerenciaInterfaz ge = new gerenciaImplementacion();
		byte opcionMenu;
		byte opcionMenusSecundarios;
		boolean cerrarMenu = false;

		try {
			do {
				switch (opcionMenu = mi.menuPrincipal()) {
				case 0:
					System.out.println("A continuacion se cerrara el menu y la aplicacion, vuelva pronto.");
					cerrarMenu = true;
					break;
				case 1:
					System.out.println("Has entrado en la version EMPLEADO");
					switch (opcionMenusSecundarios = mi.menuEmpleado()) {
					case 0:
						System.out.println("A continuacion volveras al menu principal");
						break;
					case 1:
						em.aniadirVentas();
						break;
					case 2:
						em.mostrarVentasDelDia();
						break;
					default:
						System.out
								.println("No ha elegido ninguna opcion correctamente, se le volvera al menu principal");
						break;
					}
					break;
				case 2:
					System.out.println("Has entrado en la version de GERENCIA");
					switch (opcionMenusSecundarios = mi.menuGerencia()) {
					case 0:
						System.out.println("A continuacion volveras al menu principal");
						break;
					case 1:
						ge.mostrarVentasDelDia();
						break;
					case 2:
						ge.crearPedidos();
						break;
					default:
						System.out
								.println("No ha elegido ninguna opcion correctamente, se le volvera al menu principal");
						break;
					}
					break;
				default:
					System.out.println();
					break;
				}
			} while (!cerrarMenu);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
