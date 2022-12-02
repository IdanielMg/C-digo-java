
package practica2;
public class ListaDoble 
{
    private NodoDoble cab, ult, x;
 
    public ListaDoble()
    {
        cab = new NodoDoble("","",' ',0.0);
        ult = cab;
        x = cab;
    }
    
    public void registrar(String codigo, String nombre, char sexo, double totalVentas)
    {
        NodoDoble p = new NodoDoble(codigo,nombre,sexo,totalVentas);
        ult.setLigaDer(p);
        p.setLigaIzq(ult);
        ult = p;
    }
    
    public Vendedor MostrarlistaVendedores() 
    {
        x = x.getLigaDer();
        if (x == null)
        {
            x = cab;
        }
        return x.getVendedor();
    }
    
    public String codigoMejorTresPrimeros()
    {
        /*Se aplicó la propiedad fundamental de las listas
        doblemente ligadas, y se usaron variables para simplificar
        la expresion condicional de las sentencias de desición 
        */
        NodoDoble p;
        String codigoMejor;
        double primero, segundo, tercero;
        p = cab.getLigaDer().getLigaDer();
        primero = p.getLigaIzq().getVendedor().getTotalVentas();
        segundo = p.getVendedor().getTotalVentas();
        tercero = p.getLigaDer().getVendedor().getTotalVentas();
        
        if(primero>segundo)
        {
          if(primero > tercero)
          {
              codigoMejor = p.getLigaIzq().getVendedor().getCodigo();
          }  
          else
          {
              codigoMejor = p.getLigaDer().getVendedor().getCodigo();
          }
        }
        else if(segundo>tercero)
        {
            codigoMejor = p.getVendedor().getCodigo();
        }
        else
        {
             codigoMejor = p.getLigaDer().getVendedor().getCodigo();
        }
        return codigoMejor;
    }
    
    public double acumuladoVentasTresUltimos()
    {
        /*Se aplicó la propiedad fundamental de las listas
        doblemente ligadas, y se usaron variables para simplificar
        las operaciones  
        */
        double acumulado,ultimo,penultimo,antepenultimo;
        NodoDoble p;
        
        p = ult.getLigaIzq();
        
        ultimo = p.getLigaDer().getVendedor().getTotalVentas();
        penultimo = p.getVendedor().getTotalVentas();
        antepenultimo = p.getLigaIzq().getVendedor().getTotalVentas();
        
        acumulado = antepenultimo+penultimo+ultimo;
        
        return acumulado;
    }
    
    public String mejorVendedorHombre()
    {
        String nombre = null;
        double venta = 0.0;
        NodoDoble p = cab.getLigaDer();
        while(p!= null)
        {
            if(p.getVendedor().getSexo() == 'm' && venta<p.getVendedor().getTotalVentas())
            {
                nombre = p.getVendedor().getNombre();
                venta = p.getVendedor().getTotalVentas();
            }
            p = p.getLigaDer();
        }
        return nombre;
    }
    public double promedioVentasMujeres()
    {
        double promedioVentas,acumulador = 0,contador = 0;
        
        NodoDoble p = cab.getLigaDer();
        while(p!= null)
        {
            if(p.getVendedor().getSexo() == 'f')
            {
                acumulador = acumulador + p.getVendedor().getTotalVentas();
                contador = contador +1;
            }
            p = p.getLigaDer();
        }
        promedioVentas = acumulador/contador;
        return promedioVentas; 
    }
}
