import java.util.ArrayList;
import java.util.Scanner;


public class Usuario {

	public static void main(String[] args) {
		
		ArrayList<Peliculas> listaPeliculas = new ArrayList<Peliculas>();
		//--------Menu--------
		System.out.println(
				"Selecciona :\r\n"+
				"1- Alta de pelicula\r\n" + 
				"2- Listar Pelicula\r\n" + 
				"3- Buscar Pelicula por id\r\n" + 
				"4- Buscar pelicula por titulo\r\n" + 
				"5- Buscar Peliculas por genero\r\n" + 
				"6- Borrar pelicula por id\r\n" + 
				"7- Salir de la aplicación");
		//-------Crear-Peliculas------
		Peliculas Peli1,Peli2 = null,Peli3 = null;
	
		Peli1 = new Peliculas("P1", "BlackHat, Amenaza en la red", "Michael Mann", "Thriller, Acción|Crimen", 2015);
		Peli1 = new Peliculas("P2", "The Imitation Game(Descifrando Enigma)","Morten Tyldum", "Thriller, Drama|Biográfico", 2014);
		Peli1 = new Peliculas("P3", "Avengers Endgame", "Anthony Russo, Joe Russo (Hrmns Russo)", "Ciencia Ficción, Acción|Superheroes", 2019);
		listaPeliculas.add(Peli1);
		listaPeliculas.add(Peli2);
		listaPeliculas.add(Peli3);
		//-----Interaccion-Usuario-----
		Scanner teclado = new Scanner(System.in);
		int Boton = teclado.nextInt();
	
		//-----Funciones-Botones-------
		String Texto = null;
		if (Boton >=1 && Boton<=7) {
		switch (Boton) {
			case 1:
				Peliculas PeliUser;
				System.out.println("Creando pelicula:\r\n"+"Introduzca un ID: ");
				String IDu = teclado.next();

				System.out.println("Introduzca un Titulo: ");
				String titulou = teclado.next();

				System.out.println("Introduzca uno o varios Director/es: ");
				String Directoru = teclado.next();

				System.out.println("Introduzca genero: ");
				String Generou = teclado.next();
				
				System.out.println("Introduzca un año: ");
				int añoEstrenou = teclado.nextInt();
				
				PeliUser = new Peliculas(IDu , titulou , Directoru , Generou , añoEstrenou);
				break;
			case 2:
				System.out.println(listaPeliculas);
				Texto = "Has pulsado 2";
				break;
			case 3:
				Texto = "Has pulsado 3";
				break;
			case 4:
				Texto = "Has pulsado 4";
				break;
			case 5:
				Texto = "Has pulsado 5";
				break;
			case 6:
				Texto = "Has pulsado 6";
				break;
			case 7:
				Texto = "Has pulsado 7";
				break;
		}System.out.println(Texto);
		}else {
			System.out.println("Has salido del programa");
		}
		
	}

}
