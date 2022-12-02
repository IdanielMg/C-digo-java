
package matrizasteriscos;

import java.util.Scanner;

/**
 *
 * @author Iván D
 */
public class MatrizAsteriscos {

    public static void main(String[] args) 
    {
       int n, i, j, mit;
       char [][] mat;
       Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese el valor impar de n: ");
        n = lector.nextInt();
        mat = new char [n][n];

        j = n-1;
        mit = (n-1)/2;
       for(i=0;i<n;i++)
       {
           mat[i][i] = '0';
           mat[i][j] = '0';
           --j;
           mat[mit][i] = '0';
           mat[i][mit] = '0';
       }
       System.out.println("\n");
        for(i=0;i<n;i++)
        {
             for(j=0;j<n;j++)
             {
                  System.out.print(" "+mat[i][j]+"  ");
            
             }
              System.out.println();
        }
         System.out.println();
    }
    
}
