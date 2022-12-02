
package listageneralizada;


public class ListaGeneralizada 
{
    private String hilera;
    
    
    public ListaGeneralizada()
    {
        
    }
    
    public void Ingresar(String hilera){
        this.hilera = hilera;
        Pila lista = new Pila();
        Nodo x, l,k,t, ultimo;
        int n ,i;
       
        x = new Nodo(null);
        
        ultimo = l = x;
        
        n = hilera.length();
        
        for(i = 1 ; i < n ; i++)
        {
            switch(hilera.charAt(i))
           {
                case '(':
                    lista.Apilar(ultimo);
                    k = new Nodo(null);
                    ultimo.setSw(1);
                    ultimo.setDato(k);
                    ultimo = k;
                    break;
                case ',':
                    t = new Nodo(null);
                    ultimo.setLiga(t);
                    ultimo = t;
                
                case ')':
                    ultimo = lista.Desapilar();
                    
                    
           }
        }
    }
}
