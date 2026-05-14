import java.util.Scanner;

public class b1013 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }

    public static void main(String[] args) {
        int a = lerNumeroInteiro();
        int b = lerNumeroInteiro();
        int c = lerNumeroInteiro();
        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        System.out.println(maiorABC + " eh o maior");
    }
}