import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a, b, c;
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese el coeficiente a: ");
        a = read.nextInt();
        System.out.print("Ingrese el coeficiente b: ");
        b = read.nextInt();
        System.out.print("Ingrese el coeficiente c: ");
        c = read.nextInt();

        int x = (b*b)-(4*a*c);

        Double discriminante = Math.sqrt(x);
        System.out.println("El discriminate es: "+discriminante);

        Double y = (-b + discriminante)/2*a;
        Double z = (-b - discriminante)/2*a;
        System.out.println("x1 = "+y);
        System.out.println("x2 = "+z);
    }
}