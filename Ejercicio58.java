import java.util.*;
public class Ejercicio58 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de horas trabajadas: ");
        double ht = sc.nextDouble();
        System.out.println("Valor por hora trabajada: ");
        double vh = sc.nextDouble();
        double sh = ht * vh;
        System.out.println("El sueldo por horas trabajadas es: "+ sh);
        sc.close();
    }
}
