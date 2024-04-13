import java.util.*;
public class Ejercicio32 {
    public static void main(String[] args){
        /*32.Construir un programa que permita calcular el área de un rectángulo, los datos se
        ingresan en metros y se espera ver los resultados en metros, centímetros y
        milímetros cuadrados. */
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo en metros: ");
        double bm = sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo en metros: ");
        double hm = sc.nextDouble();
        double rm = bm * hm;
        double rcm = rm * 100;
        double rmm = rcm * 10;
        System.out.println("El area del rectangulo es metros es: "+ rm + "m², en centimetros es: "+rcm+"cm², en milimetros es: "+rmm +"mm².");
        sc.close();
    }
}
