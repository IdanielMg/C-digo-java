
package ejercicio3;


public class Nodo 
{
    private Empleado regEmpleado = new Empleado();
    private Nodo liga;

    public Nodo(String nombre, char sexo, double salario) 
    {
        regEmpleado.setNombre(nombre);
        regEmpleado.setSexo(sexo);
        regEmpleado.setSalario(salario);
        liga = null;
    }

    public Empleado getRegEmpleado() 
    {
        return regEmpleado;
    }

    public Nodo getLiga() 
    {
        return liga;
    }

    public void setLiga(Nodo liga) 
    {
        this.liga = liga;
    }

    
}
