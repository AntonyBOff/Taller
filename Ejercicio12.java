import java.util.*;
public class Ejercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el primer numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Ingresar el segundo numero: ");
        double n2 = sc.nextDouble();
        System.out.println("Ingresar el tercer numero: ");
        double n3 = sc.nextDouble();
        double su = n1+n2+n3;
        double pro = su /3; 
        double dp = n1 * 2;
        double st = n2 * 3;
        double ct = n3 * n3;
        System.out.println("La suma de los numeros es: "+ su);
        System.out.println("El promedio de los numeros es: "+ pro);
        System.out.println("El doble del primer numero es: "+ dp);
        System.out.println("El triple del segundo numero es: "+ st);
        System.out.println("El cuandrado del tercero es: "+ ct);
        sc.close();
    }
}
