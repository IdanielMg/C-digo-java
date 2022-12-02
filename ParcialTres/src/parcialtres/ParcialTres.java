
package parcialtres;

import java.util.Scanner;

/**
 *
 * @author Iván Daniel Mejía Gaspar  CC: 1065372075
 */
public class ParcialTres 
{

    public static void main(String[] args) 
    {
        char opc;
        int numero, aNumero, i;
        
        Scanner lector = new Scanner(System.in);
        
        Lista objLista = new Lista();
        Lista listaOriginal = new Lista();
        do
        {
            System.out.println("Ingrese un numero entero positivo");
            System.out.print("Primer numero: ");
            numero = lector.nextInt();
            if(numero <= 0)
            {
                System.out.println("\nNo es un numero positivo\n");
            }
        }
        while(numero <= 0);
        
        while(numero != 999)
        {
            objLista.crearLista(numero);
            listaOriginal.crearLista(numero);
            do
            {
                System.out.print("Siguiente numero(999 para finalizar): ");
                numero = lector.nextInt();
                if(numero <= 0)
                {
                    System.out.println("\nNo es un numero positivo\n");
                }
            }
            while(numero <=0);
        }
        
        do
        {
            System.out.println();
            opc = Menu();
            System.out.println();
            switch(opc)
            {
                case '1':
                    numero = listaOriginal.Mostrarlista();
                    while(numero != 0)
                    {
                        System.out.print("\t"+numero);
                        numero = listaOriginal.Mostrarlista();
                    }
                    System.out.println();
                    break;
                    
                case '2':

                    i = objLista.Mostrarlista();
                    aNumero = objLista.mayorDato();
                    while(i != 0)
                    {
                        objLista.EliminarMayor(aNumero);
                        i = objLista.Mostrarlista();
                    }
                    System.out.println("Mayor dato eliminado correctamente...("+aNumero+")");
                  
                    break;
                    
                case '3':
                    objLista.CambiarImparesEntre20Y30();
                    System.out.println("Impares cambiados");
                

                    break;
                    
                case '4':
                    System.out.println("El promedio es: "+objLista.PromedioPares());

                    break;
                case '5':
                    
                    numero = objLista.Mostrarlista();
                    while(numero != 0)
                    {
                        System.out.print("\t"+numero);
                        numero = objLista.Mostrarlista();
                    }
                    System.out.println();
                    
                    break;  
                case '6':
                    System.out.println("Fin del programa");
                    break;
                    
                default:                   
                    break;
            }
        }
        while(opc != '6');        
        System.out.println();
    
    }
    
        static char Menu()
    {
        Scanner lector = new Scanner(System.in);
        char opcion;
        System.out.println("\t\t MENU DE OPCIONES\n ");
        System.out.println("\t\t1. Mostrar la lista original");
        System.out.println("\t\t2. Eliminar todas las apariciones del mayor");
        System.out.println("\t\t3. Cambiar todos los impares que están entre 20 y 30 por un 500");
        System.out.println("\t\t4. Calcular el promedio de los pares");
        System.out.println("\t\t5. Mostrar la lista final");
        System.out.println("\t\t6. Salir");
        do
        {
            System.out.print("\t\t    Opción: ");
            opcion = lector.next().charAt(0);
        }
        while(opcion < '1' || opcion> '6');
        return opcion;
    } 
}
