
package practica2;
import java.util.Scanner;
/**
 * 
 * @author Jorge Mauricio Ortiz Murrillo. CC 71724093
 * @author Iván Daniel Mejía Gaspar. CC 1065372075.
 */
public class Practica2 
{

    public static void main(String[] args) 
    {
        String codigo, nombre, pregunta;
        char sexo,opc;
        double totalVentas;
        Vendedor vendedor;
        
        ListaDoble listaVendedor = new ListaDoble();
        Scanner lector = new Scanner(System.in);
      
        listaVendedor.registrar("1111", "Carlos", 'm', 50000);
        listaVendedor.registrar("2222", "Ana   ", 'f', 90000);
        listaVendedor.registrar("3333", "Pedro ", 'm', 30000);
        listaVendedor.registrar("4444", "Sofia ", 'f', 70000);
        listaVendedor.registrar("5555", "Miguel", 'm', 80000);
        listaVendedor.registrar("6666", "Andrea", 'f', 60000);
        
        System.out.println("\n\t...La lista ya contiene 6 vendedores registrados...\n");
        System.out.print("\n\t\tDesea ingresar mas vendedores? (si/no): ");
        pregunta = lector.nextLine();
        if(pregunta.equals("si"))
        {
            System.out.println("\nIngreso de datos de los vendedores\n");
            System.out.print("Nombre del nuevo vendedor (+ para salir) ....: ");
            nombre = lector.nextLine();
            while(!nombre.equals("+"))
            {  
                System.out.print("Codigo..........................: ");
                codigo = lector.nextLine(); 
                System.out.print("Sexo (f/m)......................: ");
                sexo = lector.next().charAt(0);
                lector.nextLine(); 
                System.out.print("Total de ventas ................: ");
                totalVentas = lector.nextDouble();
                lector.nextLine();
                listaVendedor.registrar(codigo, nombre, sexo, totalVentas);
                System.out.print("\nNombre del siguiente vendedor (+ para salir): ");
                nombre = lector.nextLine();
            }
        } 
        do
        {
            System.out.println();
            opc = Menu();
            System.out.println();
            switch(opc)
            {
                case '1':
                    System.out.println("El codigo del mejor de los 3 primeros es: "+listaVendedor.codigoMejorTresPrimeros());
               
                    break;
                case '2':
                    System.out.println("El acumulado de ventas de los 3 ultimos es: "+listaVendedor.acumuladoVentasTresUltimos());

                    break;
                case '3':
                    System.out.println("El mejor vendedor hombre es: "+listaVendedor.mejorVendedorHombre());
                    break;
                case '4':
                    System.out.println("El promedio de ventas de las mujeres es: "+listaVendedor.promedioVentasMujeres());
                  
                    break;
                case '5':
                    vendedor = listaVendedor.MostrarlistaVendedores();
                    while(!vendedor.getNombre().equals(""))
                    {
                        System.out.print("\n--------------------------------------\n"
                                +"\n"+vendedor.getNombre()+"\n"+vendedor.getCodigo()
                                +"\n"+vendedor.getSexo()+"\n"+vendedor.getTotalVentas()
                                +"\n--------------------------------------");
                        vendedor = listaVendedor.MostrarlistaVendedores();
                    }
                    System.out.println();
                    break;
                case '6':
                    System.out.println("Ejecución finalizada...");
                    break;
            
                default:                   
                    break;
            }
        }
        while(opc != '6');        
        System.out.println();
    }
        static char Menu()
    {
        Scanner lector = new Scanner(System.in);
        char opcion;
        System.out.println("\t\t... MENU DE OPCIONES ...");
        System.out.println("\t\t1. Mostrar el codigo del mejor vendedor de los 3 primeros");
        System.out.println("\t\t2. Mostrar el acumulado de ventas de los 3 ultimos");
        System.out.println("\t\t3. Mostrar el nombre del mejor vendedor hombre de la lista");
        System.out.println("\t\t4. Mostrar el promedio de ventas de todas las mujeres de la lista");
        System.out.println("\t\t5. Mostrar toda la lista");
        System.out.println("\t\t6. Terminar");
        do
        {
            System.out.print("\t\t    Opción: ");
            opcion = lector.next().charAt(0);
        }
        while(opcion < '1' || opcion> '6');
        return opcion;
    } 
}
