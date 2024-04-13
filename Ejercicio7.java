import java.util.*;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su nuemro: ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("-El numero es negativo");
        }else{
            System.out.println("-El numero es positivo");
        }
        sc.close();
    }
}
