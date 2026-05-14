import java.util.Scanner;

public class b1016 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }

    public static void main(String[] args) {
        int distancia = lerNumeroInteiro();
        int tempo = distancia * 2;
        System.out.println(tempo + " minutos");

    }
}