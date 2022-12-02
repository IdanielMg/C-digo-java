
package practica1;

import java.util.Scanner;

public class Practica1 
{

    
    public static void main(String[] args) 
    {
        char opc;
        int numero;
        boolean encontrado;
        Scanner lector = new Scanner(System.in);
        
        Lista objLista = new Lista();
        do
        {
            System.out.println("Ingrese un numero diferente de cero");
            System.out.print("Primer numero: ");
            numero = lector.nextInt();
            if(numero == 0)
            {
                System.out.println("\n¡ERROR! ingrese nuevamente\n");
            }
        }
        while(numero == 0);
        
        while(numero != 999)
        {
            objLista.crearLista(numero);
            do
            {
            System.out.print("Siguiente numero(999 para finalizar): ");
            numero = lector.nextInt();
            if(numero == 0)
            {
                System.out.println("\n¡ERROR! ingrese nuevamente\n");
            }
            }
            while(numero == 0);
        }
        
        do
        {
            System.out.println();
            opc = Menu();
            System.out.println();
            switch(opc)
            {
                case '1':
                    numero = objLista.Mostrarlista();
                    while(numero != 0)
                    {
                        System.out.print("["+numero+"]-->");
                        numero = objLista.Mostrarlista();
                    }
                    System.out.println();
                    break;
                    
                case '2':
                    do
                    {
                        System.out.print("Ingrese el nuevo numero: ");
                        numero = lector.nextInt();
                        if(numero == 0)
                        {
                            System.out.println("\n¡ERROR! ingrese nuevamente\n");
                        }
                    }
                    while(numero == 0);
                    objLista.crearLista(numero);
                    break;
                    
                case '3':
                    int aMenor = objLista.menorDato();
                    int i=-1;
                    objLista.Eliminar(aMenor);
                    System.out.println("el menor dato es: "+aMenor);
  
                    System.out.println("Dato eliminado correctamente...");

                    break;
                    
                case '4':
                    int aNum,aDato;
                    System.out.print("Digite el numero a insertar: ");
                    aNum = lector.nextInt();
                    
                    System.out.println("\nElija el dato anterior a la insercion...\n");
                    numero = objLista.Mostrarlista();
                    while(numero != 0)
                    {
                        System.out.print("["+numero+"]-->");
                        numero = objLista.Mostrarlista();
                    }
                    System.out.println();
                    
                    System.out.print("\nEscriba el dato: ");
                    aDato = lector.nextInt();
  
                    encontrado = objLista.buscarDato(aDato);
                    if(encontrado == true)
                    {
                        objLista.InsertarNumero(aNum,aDato);
                        System.out.println("Numero insertado exitosamnete...");
                        
                    }
                    else
                    {
                        System.out.println("El dato ingresado no esta en la lista...");

                    }

                    break;
                    
                case '5':
                    System.out.println("La cantidad de numeros negativos es: "+objLista.ContNegativos());
                    break;
                     
                    
                case '6':
                    System.out.println("Fin del programa");
                    break;
                
                default:                   
                    break;
            }
        }
        while(opc != '6');        
        System.out.println();
    }
      static char Menu()
    {
        Scanner lector = new Scanner(System.in);
        char opcion;
        System.out.println("\t\t MENU DE OPCIONES\n ");
        System.out.println("\t\t1. Mostrar la lista");
        System.out.println("\t\t2. Ingresar un nuevo número (validar)");
        System.out.println("\t\t3. Eliminar el número menor (solo su primera aparición)");
        System.out.println("\t\t4. Insertar un número inmediatamente después de otro que entra como parámetro");
        System.out.println("\t\t5. Averiguar cuántos son negativos");
        System.out.println("\t\t6. Salir");
        do
        {
            System.out.print("\t\t    Opción: ");
            opcion = lector.next().charAt(0);
        }
        while(opcion < '1' || opcion> '6');
        return opcion;
    } 
}
