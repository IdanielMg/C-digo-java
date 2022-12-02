
package programa;

public class Empleado 
{
    private  String nombre;
    private  String Codigo;
    private char sexo;
    private int numHTrab;
    private double valHora ;
    private double salario;
    public Empleado(String pNom,String pCod, char pSexo, double pValHora ,int pNumHTrab)
    {
        nombre = pNom;
        Codigo =  pCod;
        sexo = pSexo;
        numHTrab = pNumHTrab;
        valHora = pValHora;
        salario =  pNumHTrab*pValHora;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getCodigo() 
    {
        return Codigo;
    }

    public double getSalario() 
    {
        return salario;
    }

    public char getSexo() 
    {
        return sexo;
    }
    

    public int getNumHTrab() 
    {
        return numHTrab;
    }

    public double getValHora() 
    {
        return valHora;
    }

}
