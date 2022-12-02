package poogrupopersonas;

/**
 * @author Usuario
 */
public class ArregloPersonas 
{
    private int cantReservada, cantReal, x;
    private Persona[] arregloPersonas;
       
    public ArregloPersonas(int pCantRes) //constructor común
    {
        cantReservada = pCantRes;
        cantReal = 0;
        x = -1;
        arregloPersonas = new Persona[cantReservada];
    }
      
    public void ingresarPersona(String pNom,String pIdent, char pSexo, int pEdad, char pEstCiv)
    {
        Persona objPersonaActual = new Persona(pNom, pIdent, pSexo, pEdad, pEstCiv);        
        arregloPersonas[cantReal++] = objPersonaActual;
    }
    
    public Persona mostrarListado()
    {
        ++x;
        if(x < cantReal)
        {
            return arregloPersonas[x];
        }
        else
        {
            x = -1;
            return null;
        }
    }
    
    public int contarMujeres()
    {
        int i, cont=0;
        for(i=0;i<cantReal;++i)
        {
            if(arregloPersonas[i].getSexo() == 'f')
            {
                ++cont;
            }
        }
        return cont;
    }
    
    public int contarHombresCasados()
    {
        int i, cont=0;
        for(i=0;i<cantReal;++i)
        {
            if(arregloPersonas[i].getSexo() == 'm' && arregloPersonas[i].getEstadoCivil() == 'c')
            {
                ++cont;
            }
        }
        return cont;
    }
    
    public float calcularPromedioEdadHombres()
    {
        int i, acumEdad=0, cont=0;
        float promEdHom=0.0f;
        
        for(i=0;i<cantReal;++i)
        {
            if(arregloPersonas[i].getSexo() == 'm')
            {
                acumEdad += arregloPersonas[i].getEdad();
                ++cont;
            }
        }
        promEdHom = (float)acumEdad/cont;
        return promEdHom;
    }
    
    
    public String nombreHombreMasJoven()
    {
        int i, edadMen = 150;
        String nomMen="";
        for(i=0;i<cantReal;++i)
        {
            if(arregloPersonas[i].getSexo() == 'm' && arregloPersonas[i].getEdad() < edadMen)
            {
                edadMen = arregloPersonas[i].getEdad();
                nomMen = arregloPersonas[i].getNombre();
            }                
        }
        return nomMen;
    }

    public int buscarPersona(String pIdent) 
    {
        int i = 0;
        while(i < cantReal && !arregloPersonas[i].getIdentificacion().equals(pIdent))
        {    
            ++i;
            
        }
        if(i== cantReal)
        {
            i = -1; 
        }
        return i;
    }
    
    public void eliminarPersona(int pPos)
    {
        int i = pPos;
        while(i<=cantReal - 1)
        {
            arregloPersonas[i] = arregloPersonas[i+1];
            i++;
        }
        --cantReal;
        
    }
}
