import java.util.Arrays;
import java.util.Scanner;

public class b1259 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void executa() {

        int n = lerNumeroInteiro();
        int[] pares = new int[n];
        int[] impares = new int[n];
        int op = 0;
        int oi = 0;

        for (int i = 0; i < n; i++) {
            int valor = lerNumeroInteiro();
            if (valor % 2 == 0) {
                pares[op++] = valor;
            } else {
                impares[oi++] = valor;
            }
        }

        // Ordena apenas a parte preenchida de cada array
        Arrays.sort(pares, 0, op);
        Arrays.sort(impares, 0, oi);

        // Imprime pares em ordem crescente
        for (int i = 0; i < op; i++) {
            System.out.println(pares[i]);
        }

        // (percorrendo o array de trás para frente)
        for (int i = oi - 1; i >= 0; i--) {
            System.out.println(impares[i]);
        }

    }

    public static void main(String[] args) {
        executa();
    }
}