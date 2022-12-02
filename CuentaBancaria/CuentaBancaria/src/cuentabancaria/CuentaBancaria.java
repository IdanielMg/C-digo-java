/*

 */
package cuentabancaria;
import java.util.Scanner;
public class CuentaBancaria 
{


    public static void main(String[] args) 
    {
        String aIdent, aNom;
        char opc;
        float aCantidad;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        aNom = lector.nextLine();
        
        System.out.print("Ingrese su identificación: ");
        aIdent = lector.nextLine();
     
        System.out.println("");
        Cuenta cliente1 = new Cuenta(aIdent, aNom);
       
      do
      {
       opc = Menu();
       switch(opc)
       {
           case '1':
                System.out.print("Ingrese la cantidad: ");
                aCantidad = lector.nextFloat();
                cliente1.Depositar(aCantidad);
               break;
               
           case '2':
               System.out.print("Ingrese la cantidad: ");
                aCantidad = lector.nextFloat();
                if (cliente1.Retirar(aCantidad))
                {
                       System.out.println("Transacción exitosa ");
                       System.out.println();
                }
                else
                {
                      System.out.print("Saldo insuficiente");
                }
               break;
               
           case '3':
                 System.out.println("Su saldo es: "+cliente1.ConsultarSaldo());
                 System.out.println("");
               break;  
               
           case '4':
                 System.out.println("Resultados finales");
                 System.out.println("");
                 System.out.println("Nombre: "+cliente1.GetNombre());
                 System.out.println("Identificación: "+cliente1.GetIdentificacion());
                 System.out.println("Su saldo es: "+cliente1.ConsultarSaldo());
                 System.out.println("Sus movimientos: "+cliente1.GetCotMovimientos());
               break; 
               
           default:
               
       }
       
      }while(opc!='4'); 
    }
       
    static char Menu()
    {
        char opcion;
        
         System.out.println("\nMovimientos a la cuenta ");
         System.out.println("1. Depósito ");
         System.out.println("2. Retiro ");
         System.out.println("3. Consulatar saldo ");
         System.out.println("4. Salir");
              
         Scanner lector = new Scanner(System.in);
         do
           {
                System.out.println("");
                System.out.print("Ingrese la opción ");
                opcion = lector.next().charAt(0);
                
           }while(opcion < '1' || opcion > '4');
         
        return opcion;
    }
}
