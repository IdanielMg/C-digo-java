
package trabajo1poo;


public class ClaseNumero 
{
    private int numero;
  
    
    public ClaseNumero(int pNum)
    {
        numero = pNum;
    }

    public void setNumero(int pNum) 
    {
        numero = pNum;
    }

    public int getNumero() 
    {
        return numero;
    }
    
    public String parImpar()
    {

        String result;
        if (numero % 2 == 0) 
        {
            result = "Es Par";

        } else 
        {
            result = "Es Impar";
        }
        return result;
    }
    
    public int sumatoria()
    {
      int suma;
      
      suma = (numero*(numero + 1))/2;
      
      return suma;
    }
    
    public String numPrimo()
    {
        int cantDivisores = 0;
        int p = 1;
        String numPrim;

        while (p <= numero) 
        {
            if (numero % p == 0) 
            {
                cantDivisores++;
            }
            p++;
        }
        if (cantDivisores == 2) 
        {
            numPrim = " primo ";
            
        } else    
        {
            numPrim = " no primo ";
        }
        
        return numPrim;
    }
}
