import java.util.*;
public class Ejercicio36 {
    public static void main(String[] args){
        /*36.En un estacionamiento cobran $15.00 por hora o fracción. Diseñe un algoritmo que
        determine cuánto debe pagar un cliente por el estacionamiento de su vehículo,
        conociendo el tiempo de estacionamiento en horas. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la cantidad de horas de estacionamento: ");
        double h = sc.nextDouble();
        double p = h * 15.00;
        System.out.println("La cantidad que debe pagar por "+h+ " horas de estacionamiento es: $"+p);
        sc.close();
    }
}