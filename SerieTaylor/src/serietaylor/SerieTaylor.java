
package serietaylor;

import java.util.Scanner;

public class SerieTaylor {

    public static void main(String[] args) 
    {
          
        double sen=0;
        double x;
        int numero;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese el angulo en radianes: ");          
        x = lector.nextDouble();
        
        System.out.print("Ingrese el numero de terminos: ");       
        numero = lector.nextInt();
 
        int i=1; 
        while(i<=numero)
        {
             int fact = 1;
             int j=1;
               while(j<=(1+(2*(i-1))))
               {
                    fact= fact*j;
                    j++;
               }
               if(i%2==0)
                    sen = sen - (Math.pow(x,(1+(2*(i-1)))) /fact);    
               else
                    sen = sen + (Math.pow(x,(1+(2*(i-1)))) /fact); 
             i++;
        }  
        System.out.println("El seno de: " +x+ " es " +sen);

    }
    
}
