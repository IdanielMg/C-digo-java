
package laberinto;

/**
 *
 * @author Iván M
 */
public class classLaberinto
{
    
    public int contador = 0;
    public int[][] laberinto={
			{1, 1, 0, 1, 0, 1, 1, 1, 0, 0},
	    {0, 1, 1, 0, 1, 0, 1, 0, 0, 1},
	    {0, 0, 0, 1, 0, 0, 0, 0, 1, 0},
	    {1, 0, 0, 0, 1, 0, 1, 0, 0, 0},
	    {0, 0, 1, 0, 1, 0, 0, 1, 1, 0},
	    {0, 1, 0, 0, 0, 0, 1, 1, 1, 0},
	    {1, 0, 0, 1, 1, 0, 0, 0, 0, 0},
	    {1, 0, 0, 1, 0, 0, 1, 0, 1, 0},
	    {1, 0, 0, 0, 0, 0, 0, 1, 0, 0},
	    {0, 1, 1, 0, 1, 0, 1, 0, 0, 1},
    };
    
    /* ----------------- IMPLEMENTACIÓN DEL ALGORITMO ----------------- */
    public void resuelve(int x, int y){ 
        if (paso(x, y)) { 
            laberinto[2][1] = 'S'; 
	    }
    }
    
    private boolean paso(int x, int y) {
        contador++; 
        if (laberinto[x][y]=='X'){ 
            return true; 
	    }
	    if (laberinto[x][y]=='#'||laberinto[x][y]=='*') { 
            return false; 
	    }
        laberinto[x][y]='*'; 
        boolean result;	     
	    result=paso(x, y+1); 
	    if (result) return true; 
	    result=paso(x-1, y); 
	    if (result) return true; 
	    result=paso(x, y-1); 
	    if (result) return true; 
	    result=paso(x+1, y); 
	    if (result) return true;
	    laberinto[x][y]=' '; 
	    return false;
            
            
    }
    
            
	
   
 

   
}
