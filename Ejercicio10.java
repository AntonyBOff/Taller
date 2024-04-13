import java.util.*;
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del triagulo: ");
        double b = sc.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        double h = sc.nextDouble();
        double area = (b*h)/2;
        System.out.println("El area del triagulo es: "+ area);
        sc.close();
    }
}
