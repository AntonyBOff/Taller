import java.util.*;
public class Ejercicio26 {
    /*26.Realizar el diagrama de flujo para que nos calcule el cuadrado de la hipotenusa de
    un triángulo rectángulo, a partir de la longitud de sus dos catetos. */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el cateto 1: ");
        double c1 = sc.nextDouble();
        System.out.println("Ingrese el cateto 2: ");
        double c2 = sc.nextDouble();
        double c1yc2 = (c1*c1)+ (c2*c2);
        double h = Math.sqrt(c1yc2);
        double ac = h*h;
        System.out.println("El cuadrado de la hipotenusa de este triangulo es: "+ac);
        sc.close();
    }
}