
package figurasmatrizcuadrada;
public class MatrizCuadrada 
{
    private int cFC;
    private char[][] matriz;
    
    public MatrizCuadrada(int pcFC)
    {
        cFC = pcFC;
        matriz = new char[cFC][cFC];
    }
    
    public void limpiarMatriz()
    {
        int i, j;
        for(i=0;i<cFC;i++)
        {
            for(j=0;j<cFC;j++)
            {
                matriz[i][j] = ' ';
            }
        }
    }
    
    public void mostrarMatriz()
    {
        int i, j;
        for(i=0;i<cFC;i++)
        {
            for(j=0;j<cFC;j++)
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void generarAsterisco(char pCar)
    {
        int k, c=cFC-1, mit = (cFC-1)/2;
        for(k=0;k<cFC;k++)
        {
            matriz[k][k] = pCar;
            matriz[k][mit] = pCar;
            matriz[k][c] = pCar;
            --c;
            matriz[mit][k] = pCar;
        }
    }
    
    public void generarUnaEquiz(char pCar)
    {
        int k, c=cFC-1;
        for(k=0;k<cFC;k++)
        {
            matriz[k][k] = pCar;
            matriz[k][c] = pCar;
            --c;
        }
    }
}
