
package listaligada;


public class Nodo 
{
    private int numero;
    private Nodo liga;

    public Nodo(int numero) 
    {
        this.numero = numero;
        this.liga = null;
    }

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public Nodo getLiga() 
    {
        return liga;
    }

    public void setLiga(Nodo liga) 
    {
        this.liga = liga;
    }
    
}
