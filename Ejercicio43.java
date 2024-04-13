import java.util.*;
public class Ejercicio43 {
    public static void main(String[] args){
        /*43.Crear una función que calcule cual es el número menor de dos números enteros */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite el sengundo número: ");
        int n2 = sc.nextInt();
        if(n1 > n2){
            System.out.println("El segundo número es menor.");
        }else if(n1 < n2){
            System.out.println("El el primer número es menor.");
        }else if( n1 == n2){
            System.out.println("Los números son iguales.");
        }
        sc.close();
    }
}
