/*
Con el fin de apoyar una campaña sobre los hábitos
alimenticios de la población estudiantil, se le pide a usted
que elabore una aplicación para clasificar a cada
estudiante de acuerdo con el estado de su índice de masa
corporal.

El Índice de Masa Corporal (IMC) de una persona se
calcula como el peso (medido en Kilos) dividido por la
estatura al cuadrado (medida en metros). IMC = peso /
estatura2. Si el IMC está entre 18 y 24, se dice que la
persona es normal, si es menor que 18 es delgada y si es
mayor que 24 es obesa.
*/
package imcpersona;
import java.util.Scanner;
/**
 *
 * @author Iván M
*/
public class ImcPersona {

    public static void main(String[] args) 
    {
        String aNom;
        float aAlt,aImc;
        int aPes;
        char des;
        Scanner lector = new Scanner(System.in);
        
        do{
//        lector.nextLine();    
        System.out.print("Ingrese el nombre............: ");
        aNom = lector.nextLine();
        System.out.print("Ingrese la altura en metros..: ");
        aAlt = lector.nextFloat();
        System.out.print("Ingrese el peso en kilos.....: ");
        aPes = lector.nextInt();
        lector.nextLine();
        System.out.println();
        
        Imc persona = new Imc(aNom,aAlt,aPes);
        aImc = persona.calaculoImc(aAlt, aPes);
        
        System.out.print(persona.getNombre()+"\t"+persona.getAltura()+" Metros "+persona.getPeso()+" Kilos");
        System.out.println();
        System.out.print("El IMC de "+aNom+" es: "+persona.calaculoImc(aAlt, aPes));
        System.out.println();
        System.out.println("Su condición es  : "+persona.estadoImc(aImc));
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();
        System.out.println("¿Desea ingresear otra?");
        System.out.println("Digite '0' para NO y '1' para SI ");
        des = lector.next().charAt(0);
        lector.nextLine();
        }
        while(des != '0');
        
    }
    
}
