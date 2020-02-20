package myPackage;
	
import java.util.Scanner;

public class CalcoloArea {

	public static void main(String args[]) {   
			      
		Scanner readInput = new Scanner(System.in);
		
		int base = 0;
		int altezza = 0;
		int lato = 0;

		System.out.println("Scriviamo la base del triangolo:");
		base = s.nextInt();
     
		System.out.println("Scriviamo l'altezza del triangolo:");
        altezza = s.nextInt();
        s.close();
 
        Triangolo myTriangle = new Triangolo(base, altezza);
      	System.out.println("L'area è " + myTriangle.area);
	}
}