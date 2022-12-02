
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author Iván M
 */
public class JavaApplication16 {

public static void main(String[] args) 
    {
        int cantReservada;
        String aId, aNom;
        char aSx;
        float aP1, aP2, aP3, aS1, aS2;
        Alumno alumno;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Digíte la cantidad de posiciones a reservar: ");
        cantReservada=lector.nextInt();
        lector.nextLine();
        
        Arreglo objArregloAlumnos=new Arreglo(cantReservada);
        
        System.out.println("Ingrese los datos de cada alumno: \n");
        System.out.print("identificacion: ");
        aId=lector.nextLine();
        
        while(!aId.equals("/*"))
        {
            System.out.print("Nombre: ");
            aNom=lector.nextLine();
            System.out.print("Sexo(f o m): ");
            aSx=lector.next().charAt(0);
            System.out.print("Parcial 1: ");
            aP1=lector.nextFloat();
            System.out.print("Parcial 2: ");
            aP2=lector.nextFloat();
            System.out.print("Parcial 3: ");
            aP3=lector.nextFloat();
            System.out.print("Seguimiento 1: ");
            aS1=lector.nextFloat();
            System.out.print("Seguimiento 2: ");
            aS2=lector.nextFloat();
            
            lector.nextLine();
            objArregloAlumnos.ingresarObjetoAlumno(aId, aNom, aSx, aP1, aP2, aP3, aS1, aS2);
            
            System.out.print("identificacion: ");
            aId=lector.nextLine();
        }
        System.out.println("Identificación\t "+"Nombre\t "+"Nota definitiva");
        alumno = objArregloAlumnos.regresarObjetoAlumno();
        
        while(alumno != null)
        {
            System.out.println(alumno.getIdentificacion()+"\t\t "+alumno.getNombre()+"\t\t " + 
                    String.format("%.2f",alumno.calcularNotaDefinitiva()));
            alumno = objArregloAlumnos.regresarObjetoAlumno();
        }
        
        System.out.println("La mayor nota del curso es: " + String.format("% .2f",objArregloAlumnos.mayorNotaDefinitva()));
        System.out.println("La menor nota del curso es: " + String.format("% .2f",objArregloAlumnos.menorNotaDefinitva()));
        System.out.println("La cantidad de mujeres que aprobaron son: "+ objArregloAlumnos.contarmujeresAprovaron());
        
        System.out.println();
    }
}
    

