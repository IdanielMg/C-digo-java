
package cajero;

import java.util.Scanner;

public class Cajero {


    public static void main(String[] args) 
    {
        int cat;
        int b10 = 0,b20 = 0,b50 = 0,b100 = 0;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad a retirar: ");
        cat = lector.nextInt();
        
        if(cat>=100000 )
        {
            b100 = cat/100000;
            cat = cat%100000;
        }
         if(cat>=50000 )
        {
            b50 = cat/50000;
            cat = cat%50000;
        }
        if(cat>=20000 )
        {
            b20 = cat/20000;
            cat = cat%20000;
        }
        if(cat>=10000 )
        {
            b10 = cat/10000;
        }
        System.out.println("Billetes de 100: "+b100);
        System.out.println("Billetes de 50: "+b50);
        System.out.println("Billetes de 20: "+b20);
        System.out.println("Billetes de 10: "+b10);
    }
    
}
