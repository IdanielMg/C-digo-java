
package parcialtres;


public class Lista
{
    private Nodo cab, x ; 
    private Nodo ult, y;

    public Lista() 
    {
        cab = new Nodo(0);
        ult = cab;
        x = cab;
         y = ult;
    }
    
    public void crearLista(int numero)
    {
        Nodo p = new Nodo(numero);
        ult.setLiga(p);
        ult = p;  
    }
   
    public int Mostrarlista()
    {
       x = x.getLiga();
       if (x == null)
       {
            x = cab;
       }
       return x.getNumero();
    }
    
    
    public int mayorDato()
    {
       int mayor;
       Nodo p = cab.getLiga();
       mayor = p.getNumero();
       p.getLiga();
       while(p != null)
       {
           if(p.getNumero()>mayor)
           {
               mayor = p.getNumero();
               
           }
           p = p.getLiga();
       }
       return mayor;
    
    }
    public int contMayorDato()
    {
       int cont =0, mayor;
       Nodo p = cab.getLiga();
       mayor = p.getNumero();
       while(p != null)
       {
           if(p.getNumero()>mayor)
           {
               cont = cont+1;
           }
           p = p.getLiga();
       }
       return cont;
    
    }
    public void EliminarMayor(int pMayor)
    {
        int mayor = pMayor;
        Nodo ant, p;
        ant=cab;
        p = cab.getLiga();
        while(p != null)
        {
            if(p.getNumero() == pMayor)
            {
                ant.setLiga(p.getLiga());
                p = null;
             
            }
            else
            {
                ant = p;
                p=p.getLiga();          
            }
        }
    }
    
    public void CambiarImparesEntre20Y30()
    {
        Nodo p = cab.getLiga();
        while(p != null)
        {
            if(p.getNumero()%2!=0 && p.getNumero()>20 && p.getNumero()<30)
            {
                p.setNumero(500);
               
            }
            else
            {
                p=p.getLiga();          
            }
        }       
    }
    
    public float PromedioPares()
    {
        Nodo p = cab.getLiga();
        int cont = 0;
        int acum = 0;  
        float promedio;
        while(p != null)
        {
            if(p.getNumero()%2 == 0)
            {
                acum = acum + p.getNumero();
                cont = cont + 1;
         
            }
            
             p=p.getLiga();
        }
        
        promedio = (float)acum/cont;
        return promedio;
    }
}
