import java.util.*;
public class Ejercicio30 {
    public static void main(String[] args){
        /*30.Que permita leer el valor correspondiente a una distancia en kilómetros y las
        visualice expresadas en metros.*/        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la cantidad de kilómetros que desea convertir a metros: ");
        double k = sc.nextDouble();
        double m = k * 1000;
        System.out.println("La cantidad de metros es: "+ m);
        sc.close();
    }
}