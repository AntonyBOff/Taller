import java.util.*;
public class Ejercicio51 {
    public static void main(String[] args){
        /*51.Calcule el área y el perímetro de un rectángulo dada la base y la altura.*/
        Scanner sc = new Scanner( System.in);
        System.out.println("Ingrese la base del rectangulo: ");
        int b = sc.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        int h = sc.nextInt();
        int p = h*2 + b*2;
        int r = h* b;
        System.out.println("El area del rectangulo es: "+ r);
        System.out.println("El perimetro del rectangulo es: "+p);
        sc.close();
    }
}
