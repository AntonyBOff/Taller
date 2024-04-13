import java.util.*;
public class Ejercicio42 {
    public static void main(String[] args){
        /*42.Una naranja tiene la capacidad de producir 0.05 voltios. Si un sistema de
        iluminación requiere de x kilovoltios para su funcionamiento. Cuántas naranjas
        realizan el trabajo deseado. Adicionalmente, si cada naranja pesa en promedio 6
        gramos. ¿Cuántas toneladas son necesarias? */
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos kilovoltios necesita la iluminacion?");
        double klv = sc.nextDouble();
        double v = klv * 1000;
        double nn = 0.05 * v;
        double kln = nn * 6 * 0.001;
        double tn = kln * 0.001;
        System.out.println("La cantidad de naranjas que se necesitan son: "+nn);
        System.out.println("Las toneladas de naranja son: "+tn+ "T");
        sc.close();
    }
}
