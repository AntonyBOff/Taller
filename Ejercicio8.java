import java.util.*;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea dividir: ");
        int r1 = sc.nextInt();
        System.out.println("Ingrese el numero por el que desea dividir: ");
        int r2 = sc.nextInt();
        int r = ((r2 *(r1 / r2 )) - r1)- ((r2 * (r1 / r2)) - r1)- ((r2 * (r1 / r2)) - r1);
        System.out.println("El resto es: "+ r);
        sc.close();
    }
}