import java.util.Scanner;

/**
 * 
 */

/**
 * @author Steven
 *
 */

public class Codigo6 {
	
	
	// added main
	public static void main(String[] args) {
	//added Scanner
	Scanner scan = new Scanner(System.in);
	
	// new int 
		int[] n = new int[20];
		//i++
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      // out 
	      System.out.print(n[i] + " ");
	    }
	    //ln 
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    //con el scanner
	    int opcion = scan.nextInt();
	    scan.close();
	    // ?:
	    int multiplo = ((opcion == 1)? 5:7);
	    //for
	     for(int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");}
	       else {
	        System.out.print(e + " ");
	      }
	  
	    }
	 
	    
	}
}
