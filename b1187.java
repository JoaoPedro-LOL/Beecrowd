import java.util.Scanner;

public class b1187 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static void exibirResultado(double valor) {
        System.out.printf("%.1f%n", valor);
    }

    public static void executarDesafio() {
        
        char operacao = TECLADO.next().toUpperCase().charAt(0);
        double[][] matriz = carregarMatriz();
        double resultadoFinal = processarCalculo(matriz, operacao);

        exibirResultado(resultadoFinal);
    }

    public static double[][] carregarMatriz() {
        double[][] m = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (TECLADO.hasNextDouble()) {
                    m[i][j] = TECLADO.nextDouble();
                }
            }
        }
        return m;
    }

    public static double processarCalculo(double[][] matriz, char tipo) {
        double soma = 0;
        int totalElementosArea = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (j > i) {
                    soma += matriz[i][j];
                    totalElementosArea++;
                }
            }
        }

        if (tipo == 'M') {
            return soma / (double) totalElementosArea;
        }
        return soma;
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}