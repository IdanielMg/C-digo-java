
package listadoble;

import java.util.Scanner;

/**
 *
 * @author Iván M
 */
public class ListaDoble 
{

    public static void main(String[] args) 
    {
        char opc;
        int numero;
        Scanner lector = new Scanner(System.in);
        Lista objLista = new Lista();
        
        System.out.print("Ingrese primer numero: ");
        numero = lector.nextInt();
         
        while (numero != 999) 
        {
            objLista.crearLista(numero);
            System.out.print("Siguiente numero(999 para finalizar): ");
            numero = lector.nextInt();
        }
        
        do
        {
            System.out.println();
            opc = Menu();
            System.out.println();
            switch(opc)
            {
                case '1':
                    numero = objLista.Mostrarlista();
                    while(numero != 0)
                    {
                        System.out.print("["+numero+"]⇆");
                        numero = objLista.Mostrarlista();
                    }
                    System.out.println();
                    break;
                    
                case '2':
                    System.out.println("El mayor dato es: "+objLista.mayorDato());
                    break;
                    
                case '3':
                    System.out.println("El promedio es: "+objLista.promDato());
                    break;

                case '4':
//                    int aNum;
//                    System.out.print("Ingrese el dato a eliminar: ");
//                    aNum = lector.nextInt();
//                    objLista.eliminar(aNum);
                    objLista.eliminarUltimo();
                    
                    break;
                    
                case '5':
                    System.out.println("Fin del programa");
                    break;
                default:                   
                    break;
            }
        }
        while(opc != '5');        
        System.out.println();
    }
    
    static char Menu()
    {
        Scanner lector = new Scanner(System.in);
        char opcion;
        System.out.println("\t\t MENU DE OPCIONES\n ");
        System.out.println("\t\t1. Mostrar datos");
        System.out.println("\t\t2. Buscar el mayor dato");
        System.out.println("\t\t3. Calcular promedio de los datos");
        System.out.println("\t\t4. Eliminar");
        System.out.println("\t\t5. Salir");
        do
        {
            System.out.print("\t\t    Opción: ");
            opcion = lector.next().charAt(0);
        }
        while(opcion < '1' || opcion> '5');
        return opcion;
    } 
}
