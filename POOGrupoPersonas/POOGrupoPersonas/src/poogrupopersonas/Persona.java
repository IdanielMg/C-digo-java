package poogrupopersonas;

/**
 * @author Usuario
 */
public class Persona 
{
    private  String nombre;
    private  String identificacion;
    private char sexo;
    private int edad;
    private char estadoCivil;
    
    public Persona(String pNom,String pIdent, char pSexo, int pEdad, char pEstCiv)//constructor común
    {
        nombre = pNom;
        identificacion = pIdent;
        sexo = pSexo;
        edad = pEdad;
        estadoCivil = pEstCiv;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
     public String getIdentificacion()
    {
        return identificacion;
    }
    
    public char getSexo()
    {
        return sexo;
    }
    
    public int getEdad()
    {
        return edad;
    }
    
    public char getEstadoCivil()
    {
        return estadoCivil;
    }
    
    public String nombreEstadoCivil()
    {
        String nomEstCiv="";
        switch(estadoCivil)
        {
            case 's':
                nomEstCiv = "Solter@";
                break;
            case 'c':
                nomEstCiv = "Casad@";
                break;
            case 'd':
                nomEstCiv = "Divorciad@";
                break;
            case 'v':
                nomEstCiv = "Viud@";
                break;
            case 'o':
                nomEstCiv = "Otro";
                break;
            default:
                break;
        }
        return nomEstCiv;
    }
}