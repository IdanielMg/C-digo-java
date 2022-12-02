
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Iván M
 */
public class Ejercicio3 {

    public static void main(String[] args) 
    {
        String nombre;
        char sexo, opc;
        double salario;
        Empleado unEmpleado;
        Nodo mostrarObjeto;
        Scanner lector = new Scanner(System.in);
        Lista objLista = new Lista();
        
        
        System.out.print("Nombre de la 1ra. persona (/* para salir) ....: ");
        nombre = lector.nextLine();
        while(!nombre.equals("*"))
        {  

            System.out.print("Sexo ..........................: ");
            sexo = lector.next().charAt(0);
            System.out.print("Salario........................: ");
            salario = lector.nextDouble();
            objLista.crearLista(nombre, sexo, salario);
            lector.nextLine();
            System.out.println("\n");
            System.out.print("Nombre del siguiente...........: ");
            nombre = lector.nextLine();
        }
        
        
        do
        {
            System.out.println();
            opc = Menu();
            System.out.println();
            switch(opc)
            {
                case '1':
                    unEmpleado = objLista.Mostrarlista();

                    while(unEmpleado.getSalario()!=0)
                    {
                        System.out.print("-------------------------\n" +
                                "Nombre: "+unEmpleado.getNombre()+"\nSexo:"+unEmpleado.getSexo()+
                                "\nSalario: "+unEmpleado.getSalario()+"\n");
                        unEmpleado= objLista.Mostrarlista();
                    }
                    System.out.println();
                    break;

                case '2':
                    System.out.println("Eligió salir ...");
                    break;
                default:
                    break;
            }
        }
        while(opc != '2');        
        System.out.println();
    }
        static char Menu()
    {
        Scanner lector = new Scanner(System.in);
        char opcion;
        System.out.println("\t... MENU DE OPCIONES (GRUPO DE PERSONAS) ...");
        System.out.println("\t\t1. Mostrar listado");
        System.out.println("\t\t2. Salir");
        
        do
        {
            System.out.print("\t\t    Opción: ");
            opcion = lector.next().charAt(0);
        }
        while(opcion < '1' || opcion> '2');
        return opcion;
    } 
}
