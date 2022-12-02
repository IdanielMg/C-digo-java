
package laberinto;
//import java.util.Scanner;
/**
 *
 * @author Iván M
 */
public class Laberinto {

 
    public static void main(String[] args)
    {
      	Laberinto m = new Laberinto(); 
		m.laberinto[1][1] = 'X'; 
		m.resuelve(8, 1); 
		System.out.println(m); 
		System.out.println("Total de casos recursivos examinados: " + m.contador); 
	}
    private char[][] laberinto;
    private String contador;

    private void resuelve(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
               
    }
    

