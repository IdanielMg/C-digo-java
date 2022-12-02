
package programa;
import javax.swing.JOptionPane;

/**
 * @author Gustavo Ádolfo Davila Colorado.
 * @author Iván Daniel Mejía Gaspar.
 */
public class Programa {

    public static void main(String[] args) 
    {
        String aNom, aCod;
        char aSexo, opt;
        int aCantReservar,aNumHTrab ,aPos,x;
        double aValHora;
       
        Empleado unEmpleado;
        aCantReservar = Integer.parseInt( JOptionPane.showInputDialog(" Ingrese la cantidad de posiciones a reservar:   ")); 

         x = aCantReservar;
         ArregloEmpleado objArregloEmpleado = new ArregloEmpleado(aCantReservar); 

        JOptionPane.showMessageDialog(null,"\nIngrese los datos de los empleados\n");
        aNom = JOptionPane.showInputDialog("Nombre del primer empleado:");
        while(!aNom.equals("/*"))
        {  
            x--;
            aCod = JOptionPane.showInputDialog("Codigo");
            aSexo = JOptionPane.showInputDialog("Sexo").charAt(0);
            aValHora = Double.parseDouble(JOptionPane.showInputDialog("Valor hora"));
            aNumHTrab = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de horas"));

            objArregloEmpleado.ingresarEmpleados(aNom, aCod, aSexo, aValHora ,aNumHTrab );
            aNom = JOptionPane.showInputDialog("Posiciones disponibles: "+x+"\n" 
                    + "\nNombre del siguiente empleado\n(/* para salir): ");

        }
        
        do
        {

            opt = Menu();

            switch(opt)
            {
                case '1':
                    String lista = "";
                    int k = 1;
                    unEmpleado = objArregloEmpleado.mostrarListado();
                    while(unEmpleado != null)
                    {

                        lista += k+"°. "+unEmpleado.getNombre()+"   "+unEmpleado.getCodigo()+"\n";
                        unEmpleado = objArregloEmpleado.mostrarListado();
                        k++;
                    }
                     JOptionPane.showMessageDialog(null,lista);
                    break;
                case '2':

                    JOptionPane.showMessageDialog(null,"\nIngrese los datos del nuevo empleado\n");
                    aNom = JOptionPane.showInputDialog("Nombre");
                    aCod = JOptionPane.showInputDialog("Codigo");
                    aSexo = JOptionPane.showInputDialog("Sexo").charAt(0);
                    aValHora = Double.parseDouble(JOptionPane.showInputDialog("Valor hora"));
                    aNumHTrab = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de horas"));
                    objArregloEmpleado.ingresarEmpleados(aNom, aCod, aSexo, aValHora ,aNumHTrab);
                    break;
                case '3':

                     String listaEli = "";
                     int C = 1;
                    unEmpleado = objArregloEmpleado.mostrarListado();
                    while(unEmpleado != null)
                    {

                        listaEli += C+"°. "+unEmpleado.getNombre()+"   "+unEmpleado.getCodigo()+"\n";
                        unEmpleado = objArregloEmpleado.mostrarListado();
                        C++;
                    }

                     
                    aCod = JOptionPane.showInputDialog(listaEli+"\nIngrese el codigo"); 
                    aPos = objArregloEmpleado.buscarEmpleado(aCod);
                    
                    if(aPos != -1)
                    {
                        objArregloEmpleado.eliminarEmpleado(aPos);
                        JOptionPane.showMessageDialog(null,"Eliminado Exitosamente: ");

                    }
                    else
                    {
                         JOptionPane.showMessageDialog(null,"El codigo "+aCod+" no existe ");

                    }
                    break;
                case '4':
                     JOptionPane.showMessageDialog(null,"El promedio salario de los Empleados es: "+objArregloEmpleado.promSalEmplados());

                    break;
                case '5':
                     JOptionPane.showMessageDialog(null,"El promedio salario de las mujeres es: "+objArregloEmpleado.promSalMujres());

                    break;
                case '6':
                     JOptionPane.showMessageDialog(null,"El promedio salario de los hombres es: "+objArregloEmpleado.promSalHombres());

                    break;
                case'7':
                     JOptionPane.showMessageDialog(null,"El menor salario es : "+objArregloEmpleado.menorSalarioEmpleado());

                    break;
                case '8':
                     JOptionPane.showMessageDialog(null,"Programa terminado...");
                     
                     unEmpleado = objArregloEmpleado.mostrarListado();
                      while(unEmpleado != null)
                    {
                        System.out.println("Nombre.....: "+unEmpleado.getNombre()+"\t\nCod........: "+unEmpleado.getCodigo()
                                +"\t\nSexo.......: "+unEmpleado.getSexo()+"\t\nValor Hora.: "+unEmpleado.getValHora()+"\t\nN° de horas: "+
                                unEmpleado.getNumHTrab()+"\t\nSalario....: "+unEmpleado.getSalario()+"\n");
                        unEmpleado = objArregloEmpleado.mostrarListado();
                    }
                      System.out.println("\nEl promedio salario de los Empleados es: "+objArregloEmpleado.promSalEmplados());
                      System.out.println("El promedio salario de las mujeres es: "+objArregloEmpleado.promSalMujres());
                      System.out.println("El promedio salario de los hombres es: "+objArregloEmpleado.promSalHombres());
                      System.out.println("El menor salario es : "+objArregloEmpleado.menorSalarioEmpleado());
                      System.out.println();
                    break;
                default:                   
                    break;
            }
        }
        while(opt != '8');        

    }
    
    static char Menu()
    {

        char opcion;

        do
        {

             opcion = JOptionPane.showInputDialog("*** MENU DE OPCIONES ***\n"+
                    "\n1. Mostrar listado nombres y salarios."
                     + "\n2. Ingresar un nuevo empleado."
                     + "\n3. Retirar un empleado. "
                     + "\n4. Calcular salario promedio de los empleados."
                     + "\n5. Calcular salario promedio de las mujeres."
                     + "\n6. Calcular salario promedio de los hombres."
                     + "\n7. Mostrar el menor salario de los empleados."
                     + "\n8. Salir.").charAt(0);
        }     
        while(opcion < '1' || opcion> '8');
        return opcion;
    }    
        
    
    
}
