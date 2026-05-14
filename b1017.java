import java.util.Scanner;

public class b1017 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }

    public static void main(String[] args) {
        int horas = lerNumeroInteiro();
        int velocidade = lerNumeroInteiro();
        double litros = (horas * velocidade) / 12.0;
        System.out.printf("%.3f\n", litros);

    }
}