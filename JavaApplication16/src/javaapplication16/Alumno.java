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
public class Alumno 
{
      private String identificacion;
    private String nombre;
    private char sexo;
    private float eParcial1, eParcial2, eParcial3;
    private float seguimiento1, seguimiento2; 

    public Alumno(String identificacion, String nombre, char sexo, float eParcial1, float eParcial2, float eParcial3, float seguimiento1, float seguimiento2) 
    {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.sexo = sexo;
        this.eParcial1 = eParcial1;
        this.eParcial2 = eParcial2;
        this.eParcial3 = eParcial3;
        this.seguimiento1 = seguimiento1;
        this.seguimiento2 = seguimiento2;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public float geteParcial1() {
        return eParcial1;
    }

    public float geteParcial2() {
        return eParcial2;
    }

    public float geteParcial3() {
        return eParcial3;
    }

    public float getSeguimiento1() {
        return seguimiento1;
    }

    public float getSeguimiento2() {
        return seguimiento2;
    }
    
    
    public float calcularNotaDefinitiva()
    {
        float notaDef;
        
        notaDef = eParcial1*0.15f+eParcial2*0.20f+eParcial3*0.25f+seguimiento1*0.15f+seguimiento2*0.25f;
        
        return notaDef;
    }
    
    




}
}
