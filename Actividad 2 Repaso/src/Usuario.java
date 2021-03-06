import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Usuario {

	public static void main(String[] args) {
		
		ArrayList<Peliculas> listaPeliculas = new ArrayList<Peliculas>();
		//-------Crear-Peliculas------
		Peliculas Peli1,Peli2,Peli3;
		int Boton=0;
	
		Peli1 = new Peliculas("P1", "BlackHat, Amenaza en la red", "Michael Mann", "Thriller|Crimen", 2015);
		Peli2 = new Peliculas("P2", "The Imitation Game(Descifrando Enigma)","Morten Tyldum", "Thriller|Biogr�fico", 2014);
		Peli3 = new Peliculas("P3", "Avengers Endgame", "Anthony Russo, Joe Russo (Hrmns Russo)", "Ciencia Ficci�n|Superheroes", 2019);
		listaPeliculas.add(Peli1);
		listaPeliculas.add(Peli2);
		listaPeliculas.add(Peli3);
		//-----Funciones-Botones-------
		String Texto = "";
		do {
			//--------Menu--------
			System.out.println(
					"Selecciona :\r\n"+
					"1- Alta de pelicula\r\n" + 
					"2- Listar Pelicula\r\n" + 
					"3- Buscar Pelicula por id\r\n" + 
					"4- Buscar pelicula por titulo\r\n" + 
					"5- Buscar Peliculas por genero\r\n" + 
					"6- Borrar pelicula por id\r\n" + 
					"7- Salir de la aplicaci�n");
			//-----Interaccion-Usuario-----
			Scanner teclado = new Scanner(System.in);
			Boton = teclado.nextInt();
		
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
				
				System.out.println("Introduzca un a�o: ");
				int a�oEstrenou = teclado.nextInt();
				
				PeliUser = new Peliculas(IDu , titulou , Directoru , Generou , a�oEstrenou);
				listaPeliculas.add(PeliUser);
				break;
			case 2:
				for (Peliculas films : listaPeliculas) {
					System.out.println(films.toString());
				}
				break;
			case 3:
				System.out.println("Introduce el Id a buscar:");
				String idABuscar = teclado.next();
				for(Peliculas i : listaPeliculas) {
					if(idABuscar.equals(i.getID())) {
						System.out.println(i.toString());}}
				break;
			case 4:
				System.out.println("Introduce el Titulo a buscar:");
				String TituloABuscar = teclado.next();
				for(Peliculas e : listaPeliculas) {
					if(TituloABuscar.equals(e.getTitulo())) {
						System.out.println(e.toString());}}
				break;
			case 5:
				System.out.println("Introduce el Genero a buscar:");
				String GeneroABuscar = teclado.next();
				for(Peliculas a : listaPeliculas) {
					if(GeneroABuscar.equals(a.getGenero())) {
						System.out.println(a.toString());}}
				break;
			case 6:
				Peliculas peliBorrar;
				System.out.println("Introduce el ID a borrar:");
				String IDABorrar = teclado.next();
				
				Iterator<Peliculas> iteradorPelis = listaPeliculas.iterator(); 
				while(iteradorPelis.hasNext()) {
					Peliculas peliBorra = iteradorPelis.next();
					if(peliBorra.getID().equals(IDABorrar)) {
						iteradorPelis.remove();
					}
				}
				break;
			case 7:
				Texto = "Has pulsado 7";
				break;
			default:
				System.out.println("Numero no valido(entre 1 y 7)");
		}
			System.out.println(Texto);
		}while (Boton != 7); 	
		System.out.println("Has salido del programa");
		
	}
	
	

}
