import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el radio del circulo:");
        Double r = sc.nextDouble();
        Double area = 3.1415 * (r*r);
        System.out.println("El area del circulo es: "+ area);
        sc.close();
    }
}