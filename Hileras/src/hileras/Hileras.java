
package hileras;

import java.util.Scanner;

/**
 *
 * @author Iván M
 */
public class Hileras 
{

    public static void main(String[] args) 
    {
        String text;
        char caracter;
        char opc;
        int i=0;
        Scanner lector = new Scanner(System.in);
        ListaHilera objHilera = new ListaHilera();
        
        System.out.print("Ingrese el texto: ");
        text = lector.nextLine();
        
        while( i<text.length())
        {
            objHilera.crearListaHilera(text.charAt(i));
            i++;
        }
        
        do
        {
            System.out.println();
            opc = Menu();
            System.out.println();
            switch(opc)
            {
                case '1':
                    caracter = objHilera.mostrartext();
                    while (caracter != '*')
                    {
                        System.out.print(caracter);
                        caracter = objHilera.mostrartext();
                    }
                
                    break;
                       
                case '2':
                    int k = 0;
                    
                    System.out.print("Ingrese el texto: ");
                    text = lector.nextLine();
                    
                    objHilera.crearListaHilera(' ');
                    while( k<text.length())
                    {
                        objHilera.crearListaHilera(text.charAt(k));
                        k++;
                    }
                   
                    break;
                       
                case '3':
                    int j = 0;
                    objHilera.eliminartext();
                    System.out.print("Ingrese el texto: ");
                    text = lector.nextLine();

                    while( j<text.length())
                    {
                        objHilera.crearListaHilera(text.charAt(i));
                        j++;
                    }
                 
                    break;
                        
                case '4':
                    
                    break;
                        
                case '5':
                 
                    break;
                case '6':
                    System.out.println("Programa terminado");
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
        System.out.println("\t\t1. Mostrar la texto");
        System.out.println("\t\t2. Insertar nueva hilera");
        System.out.println("\t\t3. Remplazar texto");
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
