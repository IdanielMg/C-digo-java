package primerejercicioconsubprogramas;
import java.util.Scanner;
/**
 * @author Usuario
 */
public class PrimerEjercicioConSubprogramas 
{
    public static void main(String[] args) 
    { //acá empieza main
        char aCar;
        int aNum;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Digite un carater: ");
        aCar=lector.next().charAt(0); //LEA aCar
        System.out.print("Digite un número entero: ");
        aNum=lector.nextInt(); //LEA 
        
        MostrarCaracteres(aCar, aNum);
        System.out.println("\n--------------------------------------------");
        MostrarCaracteres(aCar, 15);
        System.out.println("\n--------------------------------------------");
        MostrarCaracteres('@', aNum);
        System.out.println("\n--------------------------------------------");
        MostrarCaracteres('*', 50);
        System.out.println();
    } //acá es el fin de main
    
    static void MostrarCaracteres(char pCar, int pNum)
    {
        int i;
        for(i=1;i<=pNum;i=i+1)
        {
            System.out.print(pCar+" ");
        }
    }
}
