/*
 * @autor: Edgar Falcó, Raúl Garrido, Abel Jornet
 * Fecha modificación: 08/02/2021
 */
package main;

import clases.*;

public class T18_Act3App {

	public static void main(String[] args) {
		
		Mysql.openConnection();
		Mysql.createDB("LosAlmacenes");

		Mysql.createTable("LosAlmacenes", "Almacenes", Inserciones.tablaAlmacenes);
		Mysql.createTable("LosAlmacenes", "Cajas", Inserciones.tablaCajas);
		
		Mysql.insertData("LosAlmacenes", "Almacenes", Inserciones.insercionTablaAlmacenes);
		Mysql.insertData("LosAlmacenes", "Cajas", Inserciones.insercionTablaCajas);
		
		Mysql.getValues("LosAlmacenes", "Almacenes");
		Mysql.deleteRecord("LosAlmacenes", "Almacenes", 1);
		Mysql.getValues("LosAlmacenes", "Almacenes");
		
		Mysql.closeConnection();
	}
}
