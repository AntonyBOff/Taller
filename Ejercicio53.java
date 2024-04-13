import java.util.*;
public class Ejercicio53 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura: ");
        int h = sc.nextInt();
        int a = h*h;
        System.out.println("El area del cuadrado es: "+ a);
        sc.close();
    }
}
