import java.util.*;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner letra = new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String texto = letra.next();
        System.out.println("El texto ingresado es: " + texto);
        letra.close();
    }
}