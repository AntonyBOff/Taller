import java.util.*;
public class Ejercicio38 {
    public static void main(String[] args){
        /*38.Una persona por cada año de vida debe consumir 8 kilogramos de fruta. Dada la
        edad de una persona, imprimir cuántos gramos de fruta ha consumido y
        adicionalmente si una manzana pesa en promedio 4 gramos, determinar cuántas
        manzanas ha consumido. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad para saber la cantidad de fruta consumida: ");
        int edad = sc.nextInt();
        int fc = edad * 8;
        int m = (fc * 1000)/4;
        System.out.println("Los kilogramos de fruta consumida durante su vida es: "+ fc+ "kl");
        System.out.println("La cantidad de manzanas consumidas durante su vida es: "+m);
        sc.close();
    }
}
