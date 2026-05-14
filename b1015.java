import java.util.Scanner;

public class b1015 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }

    public static void main(String[] args) {
        double x1 = lerNumeroDouble();
        double y1 = lerNumeroDouble();
        double x2 = lerNumeroDouble();
        double y2 = lerNumeroDouble();
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("%.4f\n", distancia);

    }
}