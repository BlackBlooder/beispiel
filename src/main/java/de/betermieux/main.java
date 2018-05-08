package de.betermieux;

/**
 * Hello world!
 *
 */
import java.io.*;

public class main {

	   public static void main(String args[]) throws IOException {
		  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  // Reading from System.in
		  System.out.println("Bitte Zeichenkette eingeben: ");
	      String Zeichenkette = reader.readLine();

	      System.out.print("Ausgabe: " );
	      System.out.println(Zeichenkette.toUpperCase() );
	   }
	}