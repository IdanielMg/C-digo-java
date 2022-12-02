
package imcpersona;

/**
 *
 * @author Iván M
 */
public class Imc 
{
    private String nombre;
    private float altura;
    private int peso;

    Imc(String pNom, float pAlt, int pPes) 
    {
        nombre = pNom;
        altura = pAlt;
        peso = pPes;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public float getAltura() 
    {
        return altura;
    }

    public int getPeso() 
    {
        return peso;
    }
    public float calaculoImc(float pAlt, int pPes)
    {
      float imc;
      
      imc = pPes/(pAlt*pAlt);
       
      return imc;
    }
    public String estadoImc(float pImc)
    {
        String cod = "" ;
        if(pImc >= 18 && pImc <= 24 )
        {
            cod = "Normal";
        }
        else if(pImc < 18)
        {
            cod = "Delgado";
        } 
        else if(pImc > 24)
        {
            cod = "Obeso";
        }
        return cod;
    }
}
