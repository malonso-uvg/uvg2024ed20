/**
 * 
 */
package main;

import java.util.LinkedList;
import java.util.Scanner;


/**
 * @author MAAG
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String username = "neo4j";
		String password = "densities-feelings-tubes";
		String boltURL = "bolt://44.192.99.82:7687";
		
		try ( EmbeddedNeo4j db = new EmbeddedNeo4j( boltURL, username, password ) )
        {
		 	LinkedList<String> myactors = db.getActors();
		 	
		 	for (int i = 0; i < myactors.size(); i++) {
		 		System.out.println(myactors.get(i));
		 	}
        	
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ingrese el nombre de un actor");
		Scanner in = new Scanner(System.in);
		String myActor = in.nextLine();
		
		try ( EmbeddedNeo4j db = new EmbeddedNeo4j( boltURL, username, password ) )
        {
		 	LinkedList<String> movies = db.getMoviesByActor(myActor);
		 	
		 	for (int i = 0; i < movies.size(); i++) {
		 		System.out.println(movies.get(i));
		 		
		 	}
        	
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ingrese una nueva Pelicula");
		System.out.println("Ingrese Nombre de la pelicula");
		String movieTitle = in.nextLine();
		System.out.println("Ingrese Año Lanzamiento");
		int movieReleaseYear = Integer.parseInt(in.nextLine());
		System.out.println("Ingrese Descripcion");
		String movieTagLine = in.nextLine();
		
		try ( EmbeddedNeo4j db = new EmbeddedNeo4j( boltURL, username, password ) )
        {
		 	String result = db.insertMovie(movieTitle, movieReleaseYear, movieTagLine);
		 	
		 	if (result.equalsIgnoreCase("OK")) {
		 		System.out.println("Pelicula insertada correctamente");
		 	}
        	
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
