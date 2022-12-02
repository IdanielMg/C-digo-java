
package listadoble;

/**
 *
 * @author Iván M
 */
public class Lista 
{
    private NodoDoble cab, ult, x;
    
    public Lista()
    {
        cab = new NodoDoble(0);
        ult = cab;
        x = cab;
    }
    
    public void crearLista(int numero)
    {
        NodoDoble p = new NodoDoble(numero);
        ult.setLigaDer(p);
        p.setLigaIzq(ult);
        ult = p;
    }
    
    public int Mostrarlista() 
    {
        x = x.getLigaDer();
        if (x == null)
        {
            x = cab;
        }
        return x.getNumero();
    }
    
    public int mayorDato()
    {
       int mayor;
       NodoDoble p = cab.getLigaDer();
       mayor = p.getNumero();
       while(p != null)
       {
           if(p.getNumero()>mayor)
           {
               mayor = p.getNumero();
               
           }
           p = p.getLigaDer();
       }
       return mayor;
    
    }
    
    public float promDato()
    {
       int acum = 0, cont = 0;
       float prom;
       NodoDoble p = cab.getLigaDer();
       while(p != null)
       {
           acum = acum + p.getNumero();
           cont++;
         
           p = p.getLigaDer();
       }
       prom = acum/cont;
       return prom;
    
    }
    
    public void eliminar(int pNum)
    {
       NodoDoble p = cab.getLigaDer();
       NodoDoble q = null;
       while(p!=null)
       {
           if(p.getNumero()==pNum)
           {
               q = p;
               q.getLigaIzq().setLigaDer(q.getLigaDer());
               q.getLigaDer().setLigaIzq(q.getLigaIzq());
               p = null;
           }
           else
           {
               p = p.getLigaDer();
           }
       }
        
    }
    
    public void eliminarUltimo()
    {
        NodoDoble p;
        p = ult.getLigaIzq();
        p.setLigaDer(null);
        ult = p.getLigaDer();
    }
            
}
