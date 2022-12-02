//Representar una colección de números enteros diferentes de cero (validar) en una lista
//ligada, se pide, además:

//a) Mostrar el menor de los números
//b) Mostrar el mayor de los números
//c) Convertir todos los negativos a positivos
//d) Calcular el promedio de los impares
//e) Calcular el promedio de los pares
//f) Imprimir la lista antes y después de la conversión
package listaligada;

import java.util.Scanner;

public class ListaLigada 
{

 
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {
        int numero;
        Scanner sc = new Scanner(System.in);
        Lista cola = new Lista();
        
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        
        while(numero!=0)
        {
            cola.add(numero);
            System.out.println("Ingrese otro numero: ");
            numero = sc.nextInt();
            
        }
        
        int n = cola.output();
        while(n!=0)
        {
            System.out.println(n);
            n = cola.output();
        }
    }
    
}
