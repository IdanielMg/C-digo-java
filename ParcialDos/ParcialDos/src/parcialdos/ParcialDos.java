/*
Iván Daniel Mejía Gaspar
Enunciado:
Se tienen los datos nombre, sexo y salario de cada una de los n empleados
de una empresa, se debe almacenar dicha información en tres vectores
relacionados y paralelos, se pide, además:
a) Salario promedio de todos los empleados
b) Nombre y salario del empleado que más gana
c) Mostrar los datos de los n empleados

 */
package parcialdos;

import java.util.Scanner;

/**
 *
 * @author Iván Daniel Mejía Gaspar
 */
public class ParcialDos {

    public static void main(String[] args) 
    {
        int n, i;
        String nomMaxGana;
        float promSal, acumSal=0, salMaxGana;
        
        String[] vNombre;
        char[] vSexo;
        int[] vSalario;
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Digite la cantidad de empleados: ");
        n = lector.nextInt();
        System.out.println();
        
        vNombre = new String[n];
        vSexo = new char[n];
        vSalario= new int[n];
        
        for(i=0;i<n;i=i+1)
        {
            lector.nextLine();
            System.out.print((i+1)+"° "+"Nombre: ");
            vNombre[i] = lector.nextLine();
            System.out.println();
            
            System.out.print("sexo: ");
            vSexo[i] = lector.next().charAt(0);
            
            System.out.print("Salario: ");
            vSalario[i] = lector.nextInt();
            
        }
        
         for(i=0;i<n;i=i+1)
         {
           acumSal = acumSal + vSalario[i];
         }
         promSal = acumSal/n;
         
         System.out.println();
         System.out.println("El promedio salario es: "+promSal);
         System.out.println();
         
         nomMaxGana = vNombre[1];
         salMaxGana = vSalario[1];
         
         for(i=0;i<n;i=i+1)
         {
             if(vSalario[i]>salMaxGana)
             {
                salMaxGana = vSalario[i];
                nomMaxGana = vNombre[i];
             }
         }
         
         System.out.println("El empleado que mas gana es "+nomMaxGana+" y gana: "+salMaxGana);
         System.out.println();
         
         for(i=0;i<n;i=i+1)
         {
            System.out.println(i+1+"°: "+vNombre[i]+" sexo: "+ vSexo[i]+" Gana: "+vSalario[i]);
         }
    }
    
}
