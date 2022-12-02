
package listageneralizada;

/**
 *
 * @author Iván M
 */
public class Pila
{
    private Nodo cab, ultimo, x;
    
    public Pila()
    {
        cab = new Nodo('*');
        ultimo = x = cab;
    }
    
    public boolean PilaVacia()
    {
        return (ultimo == cab || ultimo == null);
    }
    
    public void Apilar(Object pDato){
        Nodo p = new Nodo(pDato);
        if(ultimo != cab && ultimo == null){
            p.setLiga(ultimo);
        }
        cab.setLiga(p);
        ultimo = p;
    }
    
    public Nodo Desapilar()
    {
        cab.setLiga(ultimo.getLiga());
        ultimo = cab.getLiga();
        
        return ultimo;
    }
    
    public Object MostrarPila(){
        x = x.getLiga();
        
        if(x == null){
            x = cab;
        }
        
        return x.getDato();
    }
    
    
    
}
