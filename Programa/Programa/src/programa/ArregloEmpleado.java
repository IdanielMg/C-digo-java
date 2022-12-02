
package programa;

public class ArregloEmpleado 
{
    private int cantidadReservada, n, x;
    private Empleado[] arregloEmpleados;
       
    public ArregloEmpleado(int pCantRes)
    {
        cantidadReservada = pCantRes;
        n = 0;
        x = -1;
        arregloEmpleados = new Empleado[cantidadReservada];
    }
      
    public void ingresarEmpleados(String pNom,String pCod, char pSexo, double pValHTrab, int pNumHora)
    {
        Empleado objEmpleadoActual = new Empleado(pNom, pCod, pSexo, pValHTrab, pNumHora);        
        arregloEmpleados[n++] = objEmpleadoActual;
    }
    
     public Empleado mostrarListado()
    {
        ++x;
        if(x < n)
        {
            return arregloEmpleados[x];
        }
        else
        {
            x = -1;
            return null;
        }
    }
     
     public double promSalEmplados()
    {
        int i, acumSal=0, cont=0;
        double promSalEmpl;
        
        for(i=0;i<n;++i)
        {
                acumSal += arregloEmpleados[i].getSalario();
                ++cont;  
        }
        promSalEmpl = acumSal/cont;
        return promSalEmpl;
    }

   
     public double promSalMujres()
    {
        int i, acumSal=0, cont=0;
        double promSalMuj;
        
        for(i=0;i<n;++i)
        {
             if(arregloEmpleados[i].getSexo() == 'f')
            {
                acumSal += arregloEmpleados[i].getSalario();
                ++cont; 
            }   
        }
        promSalMuj = acumSal/cont;
        return promSalMuj;
    }
     
     public double promSalHombres()
    {
        int i, acumSal=0, cont=0;
        double promSalHomb=0.0f;
        
        for(i=0;i<n;++i)
        {
             if(arregloEmpleados[i].getSexo() == 'm')
            {
                acumSal += arregloEmpleados[i].getSalario();
                ++cont; 
            }   
        }
        promSalHomb = acumSal/cont;
        return promSalHomb;
    }
     
      public int buscarEmpleado(String pCod) 
    {
        int i = 0;
        while(i < n && !arregloEmpleados[i].getCodigo().equals(pCod))
        {    
            ++i;
            
        }
        if(i== n)
        {
            i = -1; 
        }
        return i;
    }
    
    public void eliminarEmpleado(int pPos)
    {
        int i = pPos;
        while(i<=n - 1)
        {
            arregloEmpleados[i] = arregloEmpleados[i+ 1];
            i++;
        }
        --n;
        
    }
    
    public double menorSalarioEmpleado()
    {
        int i;
        double salMen;
      
         salMen = arregloEmpleados[1].getSalario();
         
         for(i=0;i<n;i=1+i)
         {
             if(arregloEmpleados[i].getSalario()<salMen)
             {
                 salMen = arregloEmpleados[i].getSalario();
             } else {
             }
         }
         
        return salMen;
    }
}
