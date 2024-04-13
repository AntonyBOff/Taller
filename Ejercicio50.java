import java.util.*;
public class Ejercicio50 {
    public static void main(String[] args){
        /*50.Facilite el ingreso de tres números enteros y/o reales, muestre su respectiva suma
        y multiplicación*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int n3 = sc.nextInt();
        int s = n1+n2+n3;
        int m = n1 * n2 * n3;
        System.out.println("La suma es: "+ s);
        System.out.println("La multiplicación es: "+ m);
        sc.close();
    }
}