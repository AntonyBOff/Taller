import java.util.*;
public class Ejercicio41 {
    public static void main(String[] args){
        /*41.El cabello de los seres humanos crece en promedio medio centímetros por mes. Si
        una persona no cortará nunca su cabello desde su nacimiento determinar según la
        edad ingresada cuántos metros mide la caballera?. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar su edad: ");
        int edad = sc.nextInt();
        int lc = edad* 12;
        System.out.println("Su cabellera mide: "+lc);
        sc.close();
    }
}
