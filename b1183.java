import java.util.Scanner;

public class b1183 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static String lerString() {
        return TECLADO.nextLine();
    }

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }

    public static void exibirResultado(double valor) {
        System.out.printf("%.1f%n", valor);
    }

    public static void executarDesafio() {
        String operacao = lerString();
        double[][] M = new double[12][12];
        double soma = 0;
        int contador = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = lerNumeroDouble();

                if (j > i) {
                    soma += M[i][j];
                    contador++;
                }
            }
        }

        if (operacao.equals("S")) {
            exibirResultado(soma);
        } else if (operacao.equals("M")) {
            exibirResultado(soma / contador);
        }
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}