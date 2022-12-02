/*
Elabore una aplicación en JAVA que permita operar con un número
entero positivo (validar), con el número ya ingresado y 
mediante la utilización de un menú ejecutar las siguientes opciones:

1. Mostrar el número
2. Ingresar un nuevo número (validar)
3. Averiguar si el número es par o impar
4. Calcular la sumatoria de todos los números desde uno hasta dicho número
5. Averiguar si es o no primo
6. Salir
 */
package trabajo1poo;

import java.util.Scanner;

public class Trabajo1POO {

    public static void main(String[] args) 
    {
        int aNum;
        char opc;
        
        Scanner lector = new Scanner(System.in);

        do 
        {
            System.out.print("\nIngrese un numero entero positivo: ");
            aNum = lector.nextInt();
            
        } while (aNum <= 0);
        
        ClaseNumero objNumero = new ClaseNumero(aNum);
        
        do 
        { 
            System.out.println("\n");
            opc = Menu();

            switch (opc) 
            {
                case '1':

                   System.out.print("El numero es: "+objNumero.getNumero());

                    break;
                case '2':
                    do 
                    {
                        System.out.print("\nIngrese un numero entero positivo: ");
                        aNum = lector.nextInt();

                    } while (aNum <= 0);
                   
                    objNumero.setNumero(aNum);

                    break;
                case '3':
                    
                    System.out.print("El numero es: "+objNumero.parImpar());
                    break;
                case '4':
                   
                     System.out.print("La sumatoria es: "+objNumero.sumatoria());
                     
                    break;
                case '5':
                    
                     System.out.print("El numero es: "+objNumero.numPrimo());

                    break;
                case '6':
                    
                    System.out.println("Programa finalizado");
                    
                default:
                    break;
            }
        
        } while (opc != '6');

        System.out.println();
    }
    
    static char Menu() 
    {
        Scanner lector = new Scanner(System.in);
        char opcion;
        System.out.println("MENU DE OPCIONES");
        System.out.println("  1. Mostrar el Numero");
        System.out.println("  2. Ingresar un nuevo numero");
        System.out.println("  3. Averiguar si el numero es par o impar");
        System.out.println("  4. Calculo Sumatoria");
        System.out.println("  5. el numero es primo o no es primo");
        System.out.println("  6. Salir");

        do 
        {
            System.out.print("Ingrese la opción: ");
            opcion = lector.next().charAt(0);
        } while (opcion < '1' || opcion > '6');
        return opcion;
    }
}
