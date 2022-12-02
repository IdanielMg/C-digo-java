
package practica1;

/**
 *
 * @author Iván M
 */
public class Lista 
{
    private Nodo cab, x ; 
    private Nodo ult;

    public Lista() 
    {
        cab = new Nodo(0);
        ult = cab;
         x = cab;
         
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
    
    public int ContNegativos()
    {
        int cont = 0;
        Nodo p = cab.getLiga();
        while(p != null)
        {
            if(p.getNumero() < 0)
            {
                cont = cont + 1;
            }
            
            p = p.getLiga();
        }
        return cont;
    }
    
    public int menorDato()
    {
        int menor;
        Nodo p = cab.getLiga();
        menor = p.getNumero();
       while(p != null)
       {
           if(p.getNumero()<menor)
           {
               menor = p.getNumero();
               
           }
           p = p.getLiga();
       }
       return menor;
    
    }
    
    public void Eliminar(int pMenor)
    {
        
        int dato = pMenor;
        Nodo ant, p;
        ant=cab;
        p = cab.getLiga();
        while(p != null)
        {
            if(p.getNumero() == dato)
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
    
    public void InsertarNumero(int pNum, int pDato)
    {
        Nodo p;
        p = cab.getLiga();
        while(p!=null)
        {
            if(p.getNumero()==pDato)
            {
                Nodo q = new Nodo(pNum);
                q.setLiga(p.getLiga());
                p.setLiga(q);
                p = null;
            }
            else
            {
                p = p.getLiga();
            }
        }

    }
    
    public boolean buscarDato(int pDato)
    {
        
        boolean encontrado = false;
        Nodo p = cab.getLiga();
        
       while(p != null)
       {
           if(p.getNumero()==pDato)
           {
               encontrado = true; 
           }
           
           p = p.getLiga();
       }
       return encontrado; 
    }
}
