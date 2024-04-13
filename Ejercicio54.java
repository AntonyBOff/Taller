import java.util.*;
public class Ejercicio54 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la medida expresada en centimetros: ");
        double c = sc.nextDouble();
        double p = 2.54* c;
        System.out.println("La medida en pulgadas es: "+ p);
        sc.close();
    }
}