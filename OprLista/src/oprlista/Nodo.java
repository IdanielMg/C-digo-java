
package oprlista;

/**
 *
 * @author Iván M
 */
public class Nodo 
{
    public int num;
    public Nodo liga;
    
    public Nodo (int d)
    {
        num = d;
    }
    public Nodo (int d, Nodo n)
    {
        num = d;
        liga = n;
    }

  
}
