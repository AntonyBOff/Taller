import java.util.*;
public class Ejercicio39 {
    public static void main(String[] args){
        /*39.Una persona pasa el 34 por ciento de su vida durmiendo. Dado el año de
        nacimiento, el año actual, imprimir cuántos días ha
        dormido.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su año de nacimiento: ");
        int an = sc.nextInt();
        int edad = 2024- an;
        int nd = edad * 365;
        double dd = nd * 0.34;
        System.out.println("Su edad es: "+ edad);
        System.out.println("La cantidad de dias dormido es: "+dd);
        sc.close();
    }
}