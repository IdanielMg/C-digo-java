package poocuentabancaria;

/**
 *
 * @author Luis C. Puerta
 */
public class Cuenta //prototipo para objetos de la clase Cuenta
{                                       //atributos
    private String identificacion, nombre;
    private double saldo;
    private int contMovimientos;
                                       //constructor
    public Cuenta(String pIdent, String pNom)
    {
        saldo = 0;
        contMovimientos = 0;
        identificacion = pIdent;
        nombre = pNom;
    }
                                  //métodos  
    public String GetIdentificacion()
    {
        return identificacion;
    }
    public String GetNombre()
    {
        return nombre;
    }
    public int GetContMovimientos()
    {
        return contMovimientos;
    }
    public void Depositar(double pValor)
    {
        saldo += pValor;
        ++contMovimientos;
    }
    public boolean Retirar(double pValor)
    {
        boolean sePudo = false;
        if(saldo >= pValor)
        {
            saldo -= pValor;
            ++contMovimientos;
            sePudo = true;
        }
        return sePudo;
    }
    public double ConsultarSaldo()
    {
        return saldo;
    }
}
