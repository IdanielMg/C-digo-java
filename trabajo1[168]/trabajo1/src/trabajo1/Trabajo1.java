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
package trabajo1;

import java.util.Scanner;

/**
 * @author 
 */
public class Trabajo1 
{

    public static void main(String[] args) 
    {
        int i, num;

        char opcion;

        Scanner lector = new Scanner(System.in);

        do 
        {
            System.out.print("Ingrese un numero entero positivo: ");
            num = lector.nextInt();
        } while (num < 0);

        do 
        {
            System.out.println("\n");
            opcion = MenuDeOpciones();

            switch (opcion) 
            {
                case '1':

                    System.out.println("El numero Digitado es " + num);

                    break;
                case '2':
                    do 
                    {
                        System.out.print("Digite un numero nuevo: ");
                        num = lector.nextInt();
                    } while (num < 0);
                    break;
                case '3':

                    if (num % 2 == 0) 
                    {
                        System.out.println("El numero :" + num + "  " + "Es Par");

                    } else 
                    {
                        System.out.println("El numero :" + num + "  " + "Es Impar");
                    }
                    break;
                case '4':
                    int acomNum = 0;
                    for (i = 1; i <= num; i++) 
                    {
                        acomNum = acomNum + i;
                    }
                    System.out.println("La suma de los numeros es: " + acomNum);
                    break;
                case '5':

                    int cant_divisores = 0;

                    int p = 1;

                    while (p <= num) 
                    {
                        if (num % p == 0) 
                        {
                            cant_divisores++;
                        }
                        p++;
                    }
                    if (cant_divisores == 2) 
                    {
                        System.out.printf("El número " + num + " es primo ");
                    } else 
                    {
                        System.out.printf("El número " + num + " no es primo: ");
                    }

                    break;
                case '6':
                    System.out.println("bye");
                default:
                    break;
            }

        } while (opcion != '6');

        System.out.println();

    }

    static char MenuDeOpciones() 
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
            System.out.print("Ingrese la opción (1, 2, 3, 4, 5 ó 6): ");
            opcion = lector.next().charAt(0);
        } while (opcion < '1' || opcion > '6');
        return opcion;
    }
}
