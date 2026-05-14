
import java.util.Scanner;

public class b1010 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }


    public static void main(String[] args) {
        int numPeca = 0;
        int quantidade;
        double valorUnitario;
        double res = 0;
        for (int i = 0; i < 2; i++) {
            numPeca = lerNumeroInteiro();
            quantidade = lerNumeroInteiro();
            valorUnitario = lerNumeroDouble();
            res += quantidade * valorUnitario;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", res * 1.0);
    }
}
