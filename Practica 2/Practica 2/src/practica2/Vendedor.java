
package practica2;

public class Vendedor 
{
    private String codigo;
    private String nombre;
    private char sexo;
    private double totalVentas;

    public Vendedor(String codigo, String nombre, char sexo, double totalVentas) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.totalVentas = totalVentas;
    }


    public String getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(String codigo) 
    {
        this.codigo = codigo;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public char getSexo()
    {
        return sexo;
    }

    public void setSexo(char sexo) 
    {
        this.sexo = sexo;
    }

    public double getTotalVentas() 
    {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) 
    {
        this.totalVentas = totalVentas;
    }
    
}
