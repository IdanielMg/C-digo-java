package listadoble;

/**
 *
 * @author Iván M
 */
public class NodoDoble 
{

    private int numero;
    private NodoDoble ligaIzq, ligaDer;
    
    public NodoDoble(int numero)
    {
        this.numero = numero;
        ligaIzq = null;
        ligaDer = null;
    }

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public NodoDoble getLigaIzq() 
    {
        return ligaIzq;
    }

    public void setLigaIzq(NodoDoble ligaIzq) 
    {
        this.ligaIzq = ligaIzq;
    }

    public NodoDoble getLigaDer() 
    {
        return ligaDer;
    }

    public void setLigaDer(NodoDoble ligaDer) 
    {
        this.ligaDer = ligaDer;
    }

}
