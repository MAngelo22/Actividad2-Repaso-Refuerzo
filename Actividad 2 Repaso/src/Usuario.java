import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		
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
		Peliculas Peli1,Peli2,Peli3;
	
		Peli1 = new Peliculas("P1", "BlackHat, Amenaza en la red", "Michael Mann", "Thriller, Acción|Crimen", 2015);
		Peli1 = new Peliculas("P2", "The Imitation Game(Descifrando Enigma)","Morten Tyldum", "Thriller, Drama|Biográfico", 2014);
		Peli1 = new Peliculas("P3", "Avengers Endgame", "Anthony Russo, Joe Russo (Hrmns Russo)", "Ciencia Ficción, Acción|Superheroes", 2019);
	
		//-----Interaccion-Usuario-----
		Scanner teclado = new Scanner(System.in);
		int Boton = teclado.nextInt();
	
		//-----Funciones-Botones-------
		String Texto = null;
		switch (Boton) {
			case 1:
				Texto = "Has pulsado 1";
				break;
			case 2:
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
	
	
	
	
	}

}
