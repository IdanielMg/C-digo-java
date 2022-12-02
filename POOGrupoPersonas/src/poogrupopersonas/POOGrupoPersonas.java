package poogrupopersonas;
import java.util.Scanner;
/**
 * @author Usuario
 */
public class POOGrupoPersonas //esta es la clase Programa
{
    public static void main(String[] args) 
    {
        String aNom,aIdent;
        char aSexo, aEstCiv, opc;
        int aEdad, aCantAReservar, aPos;
        
        Persona unaPersona;
        Scanner lector = new Scanner(System.in);        
        
        System.out.print("Ingrese la cantidad de posiciones a reservar ...: ");
        aCantAReservar = lector.nextInt();
        lector.nextLine(); 
        
        ArregloPersonas objArregloPersonas = new ArregloPersonas(aCantAReservar);        
        
        System.out.println("\nIngreso de datos de las personas:\n");
        System.out.print("Nombre de la 1ra. persona (/* para salir) ....: ");
        aNom = lector.nextLine();
        while(!aNom.equals("/*"))
        {  
            System.out.print("Identificación .................: ");
            aIdent = lector.nextLine(); 
           
            System.out.print("Sexo ...........................: ");
            aSexo = lector.next().charAt(0);
            lector.nextLine(); 
            System.out.print("Edad ...........................: ");
            aEdad = lector.nextInt();
            lector.nextLine(); 
            System.out.print("Estado civil (s, c, d, v, o) ...: "); 
            aEstCiv = lector.next().charAt(0);
            lector.nextLine();
            objArregloPersonas.ingresarPersona(aNom, aIdent, aSexo, aEdad, aEstCiv);
            System.out.print("\nNombre de la siguiente persona (/* para salir): ");
            aNom = lector.nextLine();
        }
        
        do
        {
            System.out.println();
            opc = Menu();
            System.out.println();
            switch(opc)
            {
                case '1':
                    unaPersona = objArregloPersonas.mostrarListado();
                    while(unaPersona != null)
                    {
                        System.out.println(unaPersona.getNombre()+"\t"+unaPersona.getIdentificacion()+"\t"+unaPersona.getEdad()+"\t"+unaPersona.nombreEstadoCivil());
                        unaPersona = objArregloPersonas.mostrarListado();
                    }
                    break;
                case '2':
                    System.out.println("Ingreso de datos de la persona:");
                    System.out.print("Nombre .........................: ");
                    aNom = lector.nextLine();
                    System.out.print("Identificación .................: ");
                    aIdent = lector.nextLine(); 
                    System.out.print("Sexo ...........................: ");
                    aSexo = lector.next().charAt(0);
                    System.out.print("Edad ...........................: ");
                    aEdad = lector.nextInt();
                    System.out.print("Estado civil (s, c, d, v, o) ...: ");
                    aEstCiv = lector.next().charAt(0);
                    lector.nextLine();
                    objArregloPersonas.ingresarPersona(aNom, aIdent, aSexo, aEdad, aEstCiv);
                    break;
                case '3':
                    System.out.println("La cantidad de mujeres es: "+objArregloPersonas.contarMujeres());
                    break;
                case '4':
                    System.out.println("La cantidad de hombres casados es: "+objArregloPersonas.contarHombresCasados());
                    break;
                case '5':
                    System.out.println("El promedio de edad de los hombres es: "+objArregloPersonas.calcularPromedioEdadHombres());
                    break;
                case '6':
                    System.out.println("El hombre más joven se llama: "+objArregloPersonas.nombreHombreMasJoven());
                    break;
                case'7':
                    System.out.print("Ingrese la identificación: ");
                    aIdent = lector.nextLine(); 
                    aPos = objArregloPersonas.buscarPersona(aIdent);
                    
                    if(aPos != -1)
                    {
                        objArregloPersonas.eliminarPersona(aPos);
                        
                        System.out.println("Eliminado Exitosamente: ");
                    }
                    else
                    {
                         System.out.println("La identificación "+aIdent+" no existe ");
                    }
                    break;
                case '8':
                    System.out.println("Eligió salir ...");
                    break;
                default:                   
                    break;
            }
        }
        while(opc != '8');        
        System.out.println();
    }
    
    static char Menu()
    {
        Scanner lector = new Scanner(System.in);
        char opcion;
        System.out.println("\t... MENU DE OPCIONES (GRUPO DE PERSONAS) ...");
        System.out.println("\t\t1. Mostrar listado");
        System.out.println("\t\t2. Ingresar una persona");
        System.out.println("\t\t3. Contar las mujeres");
        System.out.println("\t\t4. Contar lo hombres casados");
        System.out.println("\t\t5. Calcular promedio edad hombres");
        System.out.println("\t\t6. Nombre del hombre más joven");
        System.out.println("\t\t7. Eliminar persona");
        System.out.println("\t\t8. Salir");
        do
        {
            System.out.print("\t\t    Opción: ");
            opcion = lector.next().charAt(0);
        }
        while(opcion < '1' || opcion> '8');
        return opcion;
    }    
}
