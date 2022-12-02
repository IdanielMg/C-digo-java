/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listageneralizada;

/**
 *
 * @author Iván M
 */
public class Nodo
{
    private Nodo liga;
    private Object dato;
    private int sw;
    
    public Nodo(Object dato)
    {
        liga = null;
        this.dato = dato;
        sw = 0;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public int getSw() {
        return sw;
    }

    public void setSw(int sw) {
        this.sw = sw;
    }
    
    
}
