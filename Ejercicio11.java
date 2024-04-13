import java.util.*;
public class Ejercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: ");
        double b = sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        double h = sc.nextDouble();
        double area = b* h;
        System.out.println("El area del rectangulo es: "+ area);
        sc.close();
    }
}
