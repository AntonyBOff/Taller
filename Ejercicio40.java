import java.util.*;
public class Ejercicio40 {
    public static void main(String[] args){
        /*40.Construir una calculadora minera, la cual permita saber a cuántos pesos equivalen
        los kilos de oro ingresados. El usuario deberá ingresar tanto los kilos a convertir
        como el precio en pesos por onza de oro. Recordemos que una onza equivale a
        28.3495 gramos y que 1000 gramos son un kilo.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULADORA MINERA");
        System.out.println("");
        System.out.println("Ingresar la cantidad de kilos de oro: ");
        double ko = sc.nextDouble();
        System.out.println("Ingresar el valor de la onza de oro en pesos: ");
        double po = sc.nextDouble();
        double o = (1000/28.3495)*ko;
        double precio = o * po;
        System.out.println("La cantidad de onzas de oro es: "+ o +"oz");
        System.out.println("Lo que equivale a: $"+ precio);
        sc.close();
    }
}
