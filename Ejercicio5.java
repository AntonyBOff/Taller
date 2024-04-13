import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el diametro mayor del rombo: ");
        int dma = sc.nextInt();
        System.out.println("Ingrese el diametro menor del rombo: ");
        int dme = sc.nextInt();
        int area = (dma * dme)/2;
        System.out.println("El area del rombo es: "+ area);
        sc.close();
    }
}
