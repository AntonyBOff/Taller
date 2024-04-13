import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo: ");
        float bs = sc.nextFloat();
        System.out.println("Ingresar la altura del triangulo: ");
        float al = sc.nextFloat();
        float area = (bs * al)/2;
        System.out.println("El area del triangulo es: "+ area);
        sc.close();
    }
}
