
package pila;

import java.util.Scanner;

/**
 *
 * @author Iván M
 */
public class Pila 
{

    public static void main(String[] args) 
    {
      String hilera;
      char car;
      boolean emparejada = true;
      int i = 0;
      Scanner lector = new Scanner(System.in);
      ListaPila objHilera = new ListaPila();
      
        System.out.println("Ingrese los paratesis");
        hilera = lector.nextLine();
       
        while (i < hilera.length() && emparejada) 
        {
//            //car = hilera.substring(i, i+1).charAt(0);
//            car = hilera.charAt(i);
//            switch (car) 
//            {
//                case '{':
//                case '[':
//                case '(':
//                    objHilera.aplilar(car);
//                    break;
//                case '}':
//                    if (objHilera.desapilar() != '{') 
//                    {
//                        emparejada = false;
//                    }
//                    break;
//                case ']':
//                    if (this.Desapilar() != '[') 
//                    {
//                        emparejada = false;
//                    }
//                    break;
//                case ')':
//                    if (this.Desapilar() != '(') 
//                    {
//                        emparejada = false;
//                    }
//                    break;
//                default:
//                    break;
//            }
//            i++;
//        }
//        if (!PilaVacia()) //al final la pila debe quedar vacía para estar buena
//        {
//            emparejada = false;
//        }
//        return emparejada;
    }
}
}
