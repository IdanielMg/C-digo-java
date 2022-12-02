
package listaligada;


public class Lista 
{
    Nodo head, tail, x;

    public Lista() {
        head = new Nodo(0);
        tail = head;
        x = head;
    }
    
    public void add(int numero) {
        Nodo p = new Nodo(numero);
        tail.setLiga(p);
        tail = p;
    }

    public int output() {
        x = x.getLiga();
        if (x == null)
        {
            x = head;
        }
        return x.getNumero();
    }
    
}
