
package ejercicio3;


public class Lista 
{
    private Nodo cab;
    private Nodo x;
    private Nodo ult;

    public Lista() 
    {
        cab = new Nodo("",' ',0);
        ult = cab;
        x = cab;
         
    } 
    public void crearLista(String nombre, char sexo, double salario)
    {
        Nodo p;
        p = new Nodo(nombre,sexo,salario);
        ult.setLiga(p);
        ult = p;  
    }
    public Empleado Mostrarlista()
    {
        x = x.getLiga();
       if (x == null)
       {
            x = cab;
       }
        return x.getRegEmpleado();
    }

}
