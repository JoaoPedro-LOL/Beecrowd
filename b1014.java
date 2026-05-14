import java.util.Scanner;

public class b1014 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }

    public static void main(String[] args) {
        int x = lerNumeroInteiro();
        double y = lerNumeroDouble();
        double res = (x / y);
        System.out.printf("%.3f km/l\n", res); 
    }
}