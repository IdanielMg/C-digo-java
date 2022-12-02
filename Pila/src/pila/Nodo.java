
package pila;

public class Nodo 
{
    private char caracter;
    private Nodo liga;

    public Nodo(char caracter) 
    {
        this.caracter = caracter;
        liga = null;
    }

    public char getCaracter() 
    {
        return caracter;
    }

    public void setCaracter(char caracter) 
    {
        this.caracter = caracter;
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
