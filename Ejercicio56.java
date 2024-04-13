import java.util.*;
public class Ejercicio56 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en segundos: ");
        double ts = sc.nextDouble();
        double tm = ts / 60;
        double th = tm / 60;
        System.out.println("El tiempo dado en segundos es: "+ts);
        System.out.println("El tiempo dado en minutos es: "+ tm);
        System.out.println("El tiempo dado en horas es: "+ th);
        sc.close();
    }
}
