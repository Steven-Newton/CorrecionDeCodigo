import java.util.Scanner;

/**
 * 
 */

/**
 * @author Steven
 *
 */
public class Codigo4 {
	//agregar main
	public static void main(String[] args) {
		//importar Scanner y definir tipo de inpunt (System.in)
		Scanner s = new Scanner(System.in);
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    //jugador 2
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    String j2 = s.nextLine();
	    // no hay necesidad de 2 scanners 
	    if (j1.equals(j2)) {
	    	//comparamos strings con equals
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) {
	            g = 1;
	          }

	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;}
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	}
    
}
