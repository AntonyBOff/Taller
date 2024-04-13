import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("*Calculadora de media aritmetica*");
        System.out.println("");
        System.out.println("Digite el primer numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite el segundo numero: ");
        int n2 = sc.nextInt();
        System.out.println("Digite el tercer numero: ");
        int n3 = sc.nextInt();
        int ma = (n1 + n2 + n3)/3;
        System.out.println("La media aritmetica de los tres numeros es: "+ ma);
        sc.close();
    }
}
