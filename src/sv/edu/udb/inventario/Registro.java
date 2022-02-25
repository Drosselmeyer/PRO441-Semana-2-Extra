package sv.edu.udb.inventario;
import java.util.*;

public class Registro {
	public static void main(String[] args) {
		//Declaracion de variables
		int codigo;
		String nombre;
		int cantidad;
		float precio;
		float costo;
		
		//Instancia para leer la informacion
		Scanner in = new Scanner(System.in);
		
		//Mostramos un mensaje al usuario
		System.out.println("Ingrese el codigo del producto");
		//Leemos la informacion y la almacenamos
		codigo = in.nextInt();
		in.nextLine(); //Limpieza de buffer
		
		//Mostramos un mensaje al usuario
		System.out.println("Ingrese el nombre del producto");
		//Leemos la informacion y la almacenamos
		nombre = in.nextLine();
		
		//Mostramos la informacion
		System.out.println("El codigo del producto es: "+codigo+"\n"
						 + "El nombre del producto es: "+nombre);
	}

}
