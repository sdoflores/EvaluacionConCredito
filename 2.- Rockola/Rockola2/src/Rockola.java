import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Rockola {

	public static void main (String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		String genero;
		String exito;
		String autor;
		int id;
		int numero_canciones;
		int anio;
		int duracion;
		int cantidad;
		int opcion=0;
		List<Disco> discos = new ArrayList<Disco>();
		
		
		while(opcion!=44) {
		System.out.println("\n  Selecione la opcion que desea: \n"
				+ "1 = Agregar disco \n"
				+ "2 = Eliminar disco \n"
				+ "3 = Tocar disco\n"
				+ "4 = Salir");
		opcion = entrada.nextInt();
		
		
		switch(opcion) {
			case 1:
			System.out.println("Ingrese el numero de discos que desea agregar");
			cantidad = entrada.nextInt();
			
			 	for(int i=0; i < cantidad ; i++) {
					System.out.println("Ingrese los datos del disco "+i+1);
					System.out.println("Ingresar numero identificador");
					id = entrada.nextInt();
					System.out.println("Ingresar nombre");
					nombre = entrada.next();
					System.out.println("Ingrese el genero");
					genero = entrada.next();
					System.out.println("Ingrese el exito del disco");
					exito = entrada.next();
					System.out.println("Ingrese su autor");
					autor = entrada.next();
					System.out.println("Ingrese el numero de canciones que contiene el disco");
					numero_canciones = entrada.nextInt();
					System.out.println("Ingrese el año de lanzamiento");
					anio = entrada.nextInt();
					Disco disc = new Disco(id, nombre, genero, numero_canciones,anio,exito,autor);
					discos.add(disc);
					System.out.println(disc.mostrarDiscoAgregado());
				}
			break;
			case 2:
				  if(discos.isEmpty()) {
					  System.out.print("La lista de disco está vacia\n");
					  break;
				  } else  {
					  System.out.println("Ingresar identificador del disco a eliminar");
					  int idTemp = entrada.nextInt();
					  List<Disco> discTemp = discos.stream().filter(disc -> disc.getId() == idTemp).collect(Collectors.toList());
					  if(discTemp.isEmpty() ) {
						  System.err.println("No existe el disco");
					  } else {
						  discos = discos.stream().filter(disc -> disc.getId() != idTemp).collect(Collectors.toList());
						  System.out.println("El disco ha sido eliminado");
					  }
				   }
			 break;
			case 3 :
				  if(discos.isEmpty()) {
					  System.out.print("La lista de disco está vacia\n");
					  break;
				  } else  {
					  System.out.println("Ingresar identificador del disco a escuchar");
					  int idTemp = entrada.nextInt();
					  List<Disco> discTemp = discos.stream().filter(disc -> disc.getId() == idTemp).collect(Collectors.toList());
					  if(discTemp.isEmpty() ) {
						  System.err.println("No existe el disco");
					  } else {
						  System.out.println("El disco " + discTemp.get(0).getNombre() + " se está reproduciendo");
					  }
				   }
			break;
			
			case 4:
				System.out.println("Saliendo del programa");
				break;
			}
	    }
	}
 }
