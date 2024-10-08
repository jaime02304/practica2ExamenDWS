package edu.Practica2.servicios;

import java.util.Scanner;

/**
 * interfaz donde se encuentra la cabecera de los metodos menu
 */
public interface menuInterfaz {
	
	/**
	 * Metodo que muestra el menu inicial y recoge el valor del usuario 
	 * @return
	 */
	public byte menuPrincipal();
	
	/**
	 * Metodo que muestra el menu de empleados y recoge el valor del usuario 
	 * @return
	 */
	public byte menuEmpleado();
	
	/**
	 * Metodo que muestra el menu de gerencia y recoge el valor del usuario 
	 * @return
	 */
	public byte menuGerencia();
	

}
