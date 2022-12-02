
package oprlista;

/**
 *
 * @author Iván M
 */
public class Lista 
{
    public Nodo cab, ult;
    
    public Lista()
    {
        cab = null;
        ult = null;
    }
    public void crearLista(int num)
    {
        cab = new Nodo(num, cab);
        if(ult == null)
        {
            ult = cab;
        }
    }
    public void mostraLista()
    {
        Nodo x = cab;
        while(x!= null)
        {
            System.out.println(x.num);
            x = x.liga;
        }
        
    }
}
