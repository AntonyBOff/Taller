import java.util.*;
public class Ejercicio48 {
    public static void main(String[] args){
        /*48.Facilite el ingreso de dos números enteros y/o reales, muestre su suma, resta,
        multiplicación, división y el resto (módulo) de la división.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int r1 = sc.nextInt();
        System.out.println("Ingrese otro número entero: ");
        int r2 = sc.nextInt();
        int s = r1 + r2;
        int rr = r1 - r2;
        int m = r1* r2;
        int d = r1/ r2;
        int r = ((r2 * (r1 / r2)) - r1)- ((r2 * (r1 / r2)) - r1)- ((r2 * (r1 / r2)) - r1);
        System.out.println("La suma es: "+s);
        System.out.println("La resta es: " + rr);
        System.out.println("La multiplicación es: " + m);
        System.out.println("La divicion es: " + d);
        System.out.println("El resto es: "+ r);
        sc.close();
    }
}