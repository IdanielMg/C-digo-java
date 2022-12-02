
package adivinanumero;

import javax.swing.JOptionPane;

/**
 *
 * @author Iván M
 */
public class AdivinaNumero 
{

    public static void main(String[] args) 
    {
        int aleatorio, numeroIngresado, contador = 0;
        aleatorio = (int)( Math.random()*10);
        JOptionPane.showMessageDialog(null, "\tHola!\nVamos jugar\nAdivina el numero entre 0 y 10");
      //  System.out.println(aleatorio);
         numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        do
        {
            contador++;
            if(numeroIngresado<aleatorio)
            {
                numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Fallaste\nEl numero es MAYOR al ingresado\nIngresa otro numero:"));
               
            }
            else
            {
                numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Fallaste\nEl numero es MENOR al ingresado\nIngresa otro numero:"));
                
            }
            
        }
        while(numeroIngresado != aleatorio);
        JOptionPane.showMessageDialog(null, "Felicidades has adivinado el numero\n"+"El numero es: "+aleatorio+"\nNumero de intentos: "+contador);
    }
    
}
