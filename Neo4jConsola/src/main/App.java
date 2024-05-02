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
		try ( EmbeddedNeo4j db = new EmbeddedNeo4j( "bolt://3.231.25.113:7687", "neo4j", "wax-pitches-grove" ) )
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
		
		try ( EmbeddedNeo4j db = new EmbeddedNeo4j( "bolt://3.231.25.113:7687", "neo4j", "wax-pitches-grove" ) )
        {
		 	LinkedList<String> movies = db.getMoviesByActor(myActor);
		 	
		 	for (int i = 0; i < movies.size(); i++) {
		 		System.out.println(movies.get(i));
		 		
		 	}
        	
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
