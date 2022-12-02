
package cuentabancaria;

public class Cuenta 
{
    private String identificacion, nombre;
    private float saldo;
    private int contMovimientos;
    
    public Cuenta(String pIdent, String pNom)
    {
        saldo = 0;
        contMovimientos = 0;
        identificacion = pIdent;
        nombre = pNom;
    }
    
    public String GetIdentificacion()
     {
        return identificacion;
     }
    
    public String GetNombre()
     {
         return nombre;
     }
     
    public int GetCotMovimientos()
     {
         return contMovimientos;
     }
     
    public void Depositar(float pValor)
     {
         saldo = saldo + pValor;
         contMovimientos = contMovimientos + 1;
     }
     
    public boolean Retirar(float pValor)
     {
         boolean sePudo = false;
         if (saldo >= pValor)
         {
             saldo = saldo - pValor;
             contMovimientos = contMovimientos + 1;
             sePudo = true;
         }
         return sePudo;
     }
     
      
    public float ConsultarSaldo()
     {
        return saldo;
     }
         
}
