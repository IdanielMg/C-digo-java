package poocuentabancaria;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @
 */
public class POOCuentaBancaria 
{
    public static void main(String[] args) 
            
    {    
      
        String aIdent, aNom, cadNum;
        char opc;
        double aCantidad;
        
        aIdent = JOptionPane.showInputDialog("Identificación");
        aNom = JOptionPane.showInputDialog("Nombre");
        Cuenta cliente1 = new Cuenta(aIdent, aNom);
        do
        {
            opc = Menu();
            switch(opc)
            {
                case '1':
                    cadNum = JOptionPane.showInputDialog("Cantidad a depositar");
                    //aCantidad = Integer.parseInt(cadNum);
                    aCantidad = Double.parseDouble(cadNum);
                    cliente1.Depositar(aCantidad);
                    break;
                case '2':
                    cadNum = JOptionPane.showInputDialog("Cantidad a retirar");
                    //aCantidad = Integer.parseInt(cadNum);
                    aCantidad = Double.parseDouble(cadNum);
                    if(cliente1.Retirar(aCantidad))
                    {                     
                        JOptionPane.showMessageDialog(null, "¡Transacción exitosa!", 
                                "Mensaje", JOptionPane.INFORMATION_MESSAGE);                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "¡Saldo insuficiente!", 
                                "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case '3':
                    JOptionPane.showMessageDialog(null, "Saldo: " + cliente1.ConsultarSaldo());
                    break;
                case '4':
                    /*JOptionPane.showMessageDialog(null, "*** Resultados Finales ***\nNombre: "+
                            cliente1.GetNombre()+"\nIdent.: "+cliente1.GetIdentificacion()+
                            "\nSaldo: "+cliente1.ConsultarSaldo()+"\nMovimientos: "+
                            cliente1.GetContMovimientos());
                    break;*/
                    System.out.print("\n\nResultados Finales");  //impresión por consola
                    System.out.print("\nNombre:         " + cliente1.GetNombre());
                    System.out.print("\nIdentificación: " + cliente1.GetIdentificacion());
                    System.out.print("\nSaldo:          " + cliente1.ConsultarSaldo());
                    System.out.print("\nMovimientos:    " + cliente1.GetContMovimientos());
                    System.out.println();
                    break;
                default: break;
            }
            
        }
        while(opc != '4');
    }
    
    static char Menu()
    {
        char opcion;       
        do
        {
            opcion = JOptionPane.showInputDialog("*** Movimientos de la Cuenta ***"+
                    "\n1. Deposito\n2. Retiro\n3. Consulta saldo\n4. Salir").charAt(0);
        }
        while(opcion < '1' || opcion > '4');
        return opcion;
    }
}
