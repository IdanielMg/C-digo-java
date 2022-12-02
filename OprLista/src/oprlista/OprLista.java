
package oprlista;

import java.util.Scanner;

/**
 *
 * @author Iván M
 */
public class OprLista {

    public static void main(String[] args) 
    {
        int aNum;
        char opc;
        Scanner lector = new Scanner(System.in);
        
        Lista objLista = new Lista();
        
        System.out.println("Ingrese un numero: ");
        aNum = lector.nextInt();
        objLista.crearLista(aNum);
        
        while(aNum!= 999)
        {
            objLista.crearLista(aNum);
          
            System.out.print("Siguiente numero(999 para finalizar): ");
            aNum = lector.nextInt();
            
        }
                
                
        do
        {
            System.out.println();
            opc = Menu();
            System.out.println();
            switch(opc)
            {
                case '1':
                    objLista.mostraLista();
                    break;
                case '2':
                  
                     break;
                case '3':
                
                    break;
                    
                        default:                   
                    break;
            }
        }
        while(opc != '3');        
        System.out.println();
    }
          static char Menu()
    {
        Scanner lector = new Scanner(System.in);
        char opcion = 0;
        System.out.println("\t\t MENU DE OPCIONES\n ");
        System.out.println("\t\t1. Mostrar la lista");
        System.out.println("\t\t2. Ingresar un nuevo número (validar)");
        System.out.println("\t\t3. Salir");
        do
        {
            try
            {
                System.out.print("\t\t    Opción: ");
                opcion = lector.next().charAt(0);
            }
            catch(Exception e)
            {
                
            }
        }
        while(opcion < '1' || opcion> '3');
        return opcion;
    } 
}
