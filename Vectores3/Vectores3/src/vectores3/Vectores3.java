
package vectores3;

import java.util.Scanner;

/**
 *
 * @author Iván M
 */
public class Vectores3 {

    public static void main(String[] args)
    {
        int n, i, dato, cont;
        int [] vec; 
        cont = 0;
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector ");
        n = lector.nextInt();
          
        vec = new int[n];
          
        System.out.print("Ingrese el dato ");
        dato = lector.nextInt();
           
        for(i=0;i<n;i++)
        {
            System.out.println("Ingrese el valor de la posicion "+i+":");
            vec[i]= lector.nextInt();
        }
          
        for(i=0;i<n;i++)
        {
            if(vec[i] == dato)
               {
                  cont = cont +1;
               }
        }
           System.out.print("Las veces que aparece es: "+cont);
           System.out.println();
        
         for(i=0;i<n;i++)
         {
            System.out.print(vec[i]+" "); 
         } 
         
    }
    
}
