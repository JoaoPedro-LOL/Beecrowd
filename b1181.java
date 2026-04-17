import java.util.Scanner;

public class b1181 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        int valor;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void exibirResultado(double valor) {
        System.out.printf("%.1f%n", valor);
    }

    public static void executarDesafio() {

        int linhaInformada = TECLADO.nextInt();

        char operacao = TECLADO.next().toUpperCase().charAt(0);

        double[][] matriz = carregarMatriz(TECLADO);

        double resultadoFinal = processarCalculo(matriz, linhaInformada, operacao);

        exibirResultado(resultadoFinal);

    }

    public static double[][] carregarMatriz(Scanner TECLADO) {
        double[][] m = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = TECLADO.nextDouble();
            }
        }
        return m;
    }

    public static double processarCalculo(double[][] matriz, int linha, char tipo) {
        double soma = 0;

        for (int j = 0; j < 12; j++) {
            soma += matriz[linha][j];
        }

        if (tipo == 'M') {
            return soma / 12.0;
        }
        return soma;
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}