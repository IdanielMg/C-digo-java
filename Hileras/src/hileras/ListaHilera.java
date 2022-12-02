
package hileras;

public class ListaHilera 
{
    private Nodo cab, x, ult ; 

    public ListaHilera() 
    {
        cab = new Nodo('*');
        ult = cab;
        x = cab;  
    }
    public void crearListaHilera(char caracter)
    {
        Nodo p = new Nodo(caracter);
        ult.setLiga(p);
        ult = p;  
    }
    public char mostrartext()
    {
       x = x.getLiga();
       if(x == null)
       {
           x = cab;  
       }
       return x.getCaracter();
    }
    public void eliminartext()
    {
        Nodo p = cab.getLiga();
        while(p!=null)
        {
            cab.setLiga(p.getLiga());
            p = cab.getLiga();
        }
        ult = cab;
    }
//    public boolean vocales()
//    {
//        Nodo p=cab.getLiga();
//        boolean a,e,i,o,u,v5;
//        a=e=i=o=u=v5=false;
//        while(p!=null&&!v5)
//            
//    }
}
