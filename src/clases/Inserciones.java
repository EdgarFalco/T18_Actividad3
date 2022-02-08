/*
 * @autor: Edgar Falcó, Raúl Garrido, Abel Jornet
 * Fecha modificación: 08/02/2021
 */
package clases;

public class Inserciones {

	public static String tablaAlmacenes = "(Codigo int unsigned NOT NULL AUTO_INCREMENT, "
			  + "Lugar varchar(100) DEFAULT NULL, "
			  + "Capacidad int DEFAULT NULL, "
			  + "PRIMARY KEY (Codigo));";

	public static String tablaCajas = "(NumReferencia char(5) NOT NULL, "
			  + "Contenido varchar(100) DEFAULT NULL, "
			  + "Valor int DEFAULT NULL, "
			  + "Almacen int unsigned DEFAULT NULL, "
			  + "PRIMARY KEY (NumReferencia), "
			  + "KEY Almacen (Almacen), "
			  + "CONSTRAINT Cajas_ibfk_1 FOREIGN KEY (Almacen) REFERENCES Almacenes (Codigo) "
			  + "ON DELETE CASCADE);";
				
	public static String insercionTablaAlmacenes = "(Lugar, Capacidad) values "
			+ "('Madrid', 5),"
			+ "('Barcelona', 3),"
			+ "('Reus', 10),"
			+ "('Tarragona', 7),"
			+ "('Valencia', 8);";
	
	public static String insercionTablaCajas = "(NumReferencia, Contenido, Valor, Almacen) values "
			+ "(1, 'Papeles', 5, 1),"
			+ "(2, 'Papeles', 5, 1),"
			+ "(3, 'Tijeras', 10, 3),"
			+ "(4, 'Lapices', 6, 3),"
			+ "(5, 'Tijeras', 5, 2);";	
}
