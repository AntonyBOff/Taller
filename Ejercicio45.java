import java.util.*;
public class Ejercicio45 {
    public static void main(String[] args){
        /*45.Crear un función que reciba un número real y devuelva un número entero con el
        valor: -1 si el número es negativo, 1 si el número es positivo o 0 si es cero.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número real: ");
        double r = sc.nextDouble();
        if(r> 0){
            System.out.println("(1)");
        }else if(r < 0){
            System.out.println("(-1)");
        }else if( r == 0){
            System.out.println("(0)");
        }
        sc.close();
    }
}
