/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author Iván M
 */
public class Arreglo {
    private int cantReservada, cantReal, x;
    private Alumno[] arregloDeAlumno;
    
    public Arreglo(int pCantReservada) //constructor
    {
        cantReservada=pCantReservada;
        arregloDeAlumno=new Alumno[cantReservada];
        cantReal=0;
        x=-1;
    }
    
    public void ingresarObjetoAlumno(String pId, String pNom, char Psx, float pP1, float pP2, float pP3, float pS1, float pS2)
    {
      Alumno alumnoActual = new Alumno(pId, pNom, Psx, pP1, pP2, pP3, pS1, pS2);
      arregloDeAlumno[cantReal++]= alumnoActual;
    }
    
    public Alumno regresarObjetoAlumno()
    {   
       x++;
        if (x<cantReal)
        {
           return arregloDeAlumno[x];
        }
        else
        {
           x=-1;
           return null;
        }
    }
    
    public float mayorNotaDefinitva()
    {
        float mayorNota=-1.0f, notaDef;
        int i;
        
        for(i=0; i<cantReal;i++)
        {
            notaDef=arregloDeAlumno[i].calcularNotaDefinitiva();
            
            if( notaDef > mayorNota)
            {
                mayorNota=notaDef;
            }
        }
        
        return mayorNota;
    }        
           
    public float menorNotaDefinitva()
    {
        float menorNota=6.0f, notaDef;
        int i;
        
        for(i=0; i<cantReal;i++)
        {
            notaDef=arregloDeAlumno[i].calcularNotaDefinitiva();
            
            if( notaDef < menorNota)
            {
                menorNota=notaDef;
            }
        }
        
        return menorNota;
    }
    
    public int contarmujeresAprovaron()
    {
        int cont=0, i;
        float notaDef;
        
        for(i=0;i<cantReal;i++)
        {
            if(arregloDeAlumno[i].getSexo() =='f')
            {
            notaDef=arregloDeAlumno[i].calcularNotaDefinitiva();
            
            
                if(notaDef > 3.0f)
                {
                    ++cont;
                }
            }
        
        }
        
        return cont;
    }
}
