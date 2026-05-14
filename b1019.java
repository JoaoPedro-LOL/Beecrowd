import java.util.Scanner;

public class b1019 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }

    public static void main(String[] args) {
        int tempo = lerNumeroInteiro();
        int horas = tempo / 3600;
        int minutos = (tempo % 3600) / 60;
        int segundos = tempo % 60;
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}