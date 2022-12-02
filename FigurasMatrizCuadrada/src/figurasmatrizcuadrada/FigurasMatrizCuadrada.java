
package figurasmatrizcuadrada;
import java.util.Scanner;

public class FigurasMatrizCuadrada 
{
    public static void main(String[] args) 
    {
        int n;
        char car;
        MatrizCuadrada objMat;
        Scanner lector = new Scanner(System.in);

        do
        {
            System.out.print("Ingrese el valor de n (debe ser impar): ");
            n = lector.nextInt();
        }
        while(n %2 == 0);
        objMat = new MatrizCuadrada(n);
        
        objMat.limpiarMatriz();
        System.out.print("Ingrese el caracter para el asterisco: ");
        car = lector.next().charAt(0);        
        objMat.generarAsterisco(car);
        
        System.out.println();
        objMat.mostrarMatriz();
        System.out.println();
        
        objMat.limpiarMatriz();
        System.out.print("Ingrese el caracter para la equis: ");
        car = lector.next().charAt(0);
        objMat.generarUnaEquiz(car);
        
        System.out.println();
        objMat.mostrarMatriz();
        System.out.println();
    }
}
