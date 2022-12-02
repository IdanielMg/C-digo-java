
package algoritmos;

/**
 *
 * @author Iván M
 */
public class Algoritmos {

    public static void main(String[] args) 
    {
        int c=0;
        for(int i = 0; i < 30 ;i++)
        {
          if( 3*i % 16 == 1)
          {
              c = c + 1;
              System.out.println(i);
          }
//            System.out.println(i);
        }
        System.out.println("hay "+ c);
    }
    
}
