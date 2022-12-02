
package practica2;


public class NodoDoble
{
    private Vendedor vendedor;
    private NodoDoble ligaIzq, ligaDer;
    
    public NodoDoble(String codigo, String nombre, char sexo, double totalVentas)
    {
        vendedor = new Vendedor(codigo,nombre,sexo,totalVentas);
        ligaIzq = null;
        ligaDer = null;
    }

    public Vendedor getVendedor() {
        return vendedor;
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
