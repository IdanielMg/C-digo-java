package eliminareinsertarenvector;
import java.util.Scanner;
/**
 * @author Usuario
 */
public class EliminarEInsertarEnVector 
{
    public static void main(String[] args) 
    {      // TODO code application logic here
        int n, i, posDatoAEliminar, dato, posDatoAInsertar;
        int[] v;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de datos: ");
        n = lector.nextInt();
        v = new int[n];
        
        System.out.println("Ingrese el dato de la posición:");
        for(i=0;i<n;i++)
        {
            System.out.print((i+1)+"°: ");
            v[i]=lector.nextInt();
        }
        
        System.out.print("\nEstos son los datos del vector: ");
        MostrarVector(v, n);
        
        System.out.print("\nIngrese la posición del dato a eliminar: "); //OJO, se supone que la posición existe
        posDatoAEliminar=lector.nextInt();
        n=EliminarDatoDadaPosicion(v, n, posDatoAEliminar);
        
        System.out.print("\nEstos son los datos del vector: ");
        MostrarVector(v, n);
        
        System.out.print("\nIngrese el dato a insertar: ");
        dato = lector.nextInt();
        System.out.print("\nIngrese la posición del dato a insertar: "); //OJO, se supone que la posición existe
        posDatoAInsertar=lector.nextInt();
        n=InsertarDatoDadaPosicion(v, n, dato, posDatoAInsertar);
        
        System.out.print("\nEstos son los datos del vector: ");
        MostrarVector(v, n);
        
        System.out.println();
    }
    
    static void MostrarVector(int[] pVector, int pTamanio)
    {
        int i;
        for(i=0;i<pTamanio;i++)
        {
            System.out.print(pVector[i]+" ");
        }
    }
    
    static int EliminarDatoDadaPosicion(int[] pVector, int pTamanio, int pPosDato)
    {
        int i;
        for(i=pPosDato-1;i<pTamanio-1;i++)
        {
            pVector[i] = pVector[i+1];
        }
        --pTamanio;
        return pTamanio;
    }
    
    static int InsertarDatoDadaPosicion(int[] pVector, int pTamanio, int pDato, int pPosDato)
    {
        int i;
        for(i=pTamanio-1;i>=pPosDato-1;i--)
        {
            pVector[i+1] = pVector[i];
        }
        pVector[pPosDato-1]=pDato;
        ++pTamanio;
        return pTamanio;
    }
    
}
