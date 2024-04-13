import java.util.*;
public class Ejercicio46 {
    public static void main(String[] args){
        /*46.Que permita leer el valor correspondiente a una distancia en millas y las visualice
        expresadas en metros. Sabiendo que 1 milla marina equivale a 1852 metros. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la cantidad de millas marinas que desea convertir a metros: ");
        double mm = sc.nextDouble();
        double mxm = mm * 1852;
        System.out.println("Los metros por millas marinas son: "+ mxm+ "m");
        sc.close();
    }
}
