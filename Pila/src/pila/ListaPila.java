
package pila;

public class ListaPila 
{
    private Nodo cab, x, ult ; 

    public ListaPila() 
    {
        cab = new Nodo('*');
        ult = cab;
        x = cab;  
    }
    public boolean pilaVacia()
    {
        return (ult == cab || ult == null);
    }
    
    public void aplilar(char caracter)
    {
        Nodo p = new Nodo(caracter);
        ult.setLiga(p);
        ult = p;  
    }
    public void desapilar()
    {
        Nodo ant, p;
        ant=cab;
        p = cab.getLiga();
        while(p != null)
        {
            if(p.getLiga() == ult.getLiga())
            {
                ant.setLiga(null);
                p = ult;
                
            }
            else
            {
                ant = p;
                p=p.getLiga();          
            }
        }
    }
}
