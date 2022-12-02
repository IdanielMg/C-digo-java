
package programanotas;
import java.util.Scanner;
/**
 * No logré comprender bien el enunciado.
 * @author Iván Daniel Mejía Gaspar
 */
public class ProgramaNotas {

    public static void main(String[] args) 
    {
        int n;
        String aNumCar,aNom;
        char aSexo;
        float aPar1,aPar2,aTrab1,aTrab2;
        objEstudiante[] vEstudiante;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de estudiante: ");
        n = lector.nextInt();
        vEstudiante = new objEstudiante[n];
        
        for(int i = 0;i<n;i++)
        { 
        System.out.print("Ingrese numero de carnet: ");
        aNumCar = lector.nextLine();
        System.out.print("nombre: ");
        aNom = lector.nextLine();
        System.out.print("sexo: ");
        aSexo = lector.next().charAt(0);
        System.out.print("Nota parcial 1: ");
        aPar1 = lector.nextFloat();
        System.out.print("Nota parcial : ");
        aPar2 = lector.nextFloat();
        System.out.print("Nota trabajo 1: ");
        aTrab1 = lector.nextFloat();
        System.out.print("Nota trabajo 2: ");
        aTrab2 = lector.nextFloat();
        
        Estudiante unEstudiante = new Estudiante(aNumCar,aNom,aSexo,aPar1,aPar2,aTrab1,aTrab2);
        objEstudiante[i] = unEstudiante;
        
       
          
        }

    }

  
    
}
