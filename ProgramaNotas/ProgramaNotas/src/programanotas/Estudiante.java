
package programanotas;

/**
 *
 * @author Iván M
 */
public class Estudiante 
{
   private String numCarnet;
   private String nombre;
   private char sexo;
   private float parcial1;
   private float parcial2;
   private float trabajo1;
   private float trabajo2;

   
   
       public Estudiante(String pNumCar,String pNom,char pSexo,float pPar1,float pPar2,float pTrab1,float pTrab2)
    {
      numCarnet = pNumCar;
      nombre = pNom;
      sexo = pSexo;
      parcial1 = pPar1;
      parcial2 = pPar2;
      trabajo1 = pTrab1;      
      trabajo2 = pTrab2;

    }

    public String getNumCarnet() 
    {
        return numCarnet;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public char getSexo() 
    {
        return sexo;
    }

    public float getParcial1() 
    {
        return parcial1;
    }

    public float getParcial2() 
    {
        return parcial2;
    }

    public float getTrabajo1() 
    {
        return trabajo1;
    }

    public float getTrabajo2() 
    {
        return trabajo2;
    }
    
   
    
   
}
