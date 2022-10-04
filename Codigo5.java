import java.util.Scanner;

/**
 * 
 */

/**
 * @author Steven
 *
 */
public class Codigo5 {
	//main
	public static void main(String[] args) {
		//import Scanner y poner el tipo de input(System.in)
	    Scanner s = new Scanner(System.in);
	    System.out.print("Introduzca un número:");
	    
	   int c = s.nextInt();
	    
	    int afo = 0;
	    int noAfo = 0;
	    //c
	    int temp = c;
	    while(temp > 0){
		  int digito =(temp % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      }
	     // agregar un -= para poder llegar a 0 y sacar del else
	      temp-=digito; 
		  temp/=10;
	    };// faltaba corchete
	    if (afo > noAfo) {
	    	//ln 
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	}
	

}
