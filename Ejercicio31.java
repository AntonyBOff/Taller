import java.util.*;
public class Ejercicio31 {
    public static void main(String[] args){
        /*31.Construir un programa que permita calcular el área de un triángulo. El usuario
        ingresará la base y la altura en milímetros y el sistema mostrará los resultados en
        milímetros, centímetros y metros cuadrados respectivamente. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la base en milimetros: ");
        double bm = sc.nextDouble();
        System.out.println("Digite la altura en milimetros: ");
        double hm = sc.nextDouble();
        double rm = (bm * hm)/2;
        double rc = rm / 10;
        double rme = rc / 100;
        System.out.println("El area en miimetros es: "+ rm+ "mm², en centimetros es: "+ rc + "cm², en metros es: "+rme+"m².");
        sc.close();
    }
}