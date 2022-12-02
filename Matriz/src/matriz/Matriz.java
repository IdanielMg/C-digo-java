
package matriz;

import java.util.Random;
import java.util.Scanner;

public class Matriz 
{

    public static void main(String[] args) 
    {
        int nF, nC, j, i, may;
        int [][] mat;
        Scanner lector = new Scanner(System.in);
        Random nroAleatorio = new Random();
        
        System.out.print("Ingrese numero de filas: ");
        nF = lector.nextInt();
        System.out.print("Ingrese numero de columnas: ");
        nC = lector.nextInt();
        
        mat = new int [nF][nC];
        for(i=0;i<nF;i++)
        {
             for(j=0;j<nC;j++)
             {
                 mat [i][j] = nroAleatorio.nextInt((99-10)+1)+10;
            
             }
        }
       
        for(i=0;i<nF;i++)
        {
             for(j=0;j<nC;j++)
             {
                  System.out.print(mat[i][j]+" ");
            
             }
              System.out.println();
        }
         System.out.println();

         may = mat[0][0];
        for(i=0;i<nF;i++)
        {
              for(j=0;j<nC;j++)
              {
                  if(mat[i][j]>may)
                  {
                      may = mat[i][j];
                  }
              }
        }

    }
    
}
