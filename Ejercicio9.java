import java.util.*;
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad: ");
        double cantidad = sc.nextDouble();
        double iva = cantidad * 0.21;
        System.out.println("El IVA de esa cantidad es: "+ iva);
        sc.close();
    }
}
