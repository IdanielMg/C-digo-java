/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import javax.swing.JOptionPane;
/**
 *
 * @author Iván M
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null,"Bebé, hoy me levanté con ganas de volverte a enamorar ","Monalisa",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Amor, mi corazón destaparé y aunque suene muy cursi ","Monalisa",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Para que nunca lo olvides, hoy voy a recordarte que ","Monalisa",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Me encanta tu sonrisa, Monalisa ","Monalisa",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Tiene algo que hipnotiza, me hechiza ","Monalisa",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Me encanta tu mirada, tu cara enamorada ","Monalisa",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Y el sabor de tu boca cuando te beso, cuando te beso ","Monalisa",JOptionPane.PLAIN_MESSAGE);   
    
        int i,j,k;
		
		for(i=0;i<2;i++) {
		
			for(j=0;j<=2-i;j++) {
				System.out.print(" ");
			}
			for(k=0;k<2*i+4;k++) {
				System.out.print("*");
			}
    
			
			for(j=4;j>2*i;j--) {
				System.out.print(" ");
			}
			for(k=0;k<2*i+4;k++) {
				System.out.print("*");
			}
			// Realizar salto de línea
			System.out.println();
		}
		
		for(i=0;i<8;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(k=0;k<16-i*2;k++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		

	
    }
    
}
