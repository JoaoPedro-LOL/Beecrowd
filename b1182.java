import java.util.Scanner;

public class b1182 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void exibirResultado(double valor) {
        System.out.printf("%.1f%n", valor);
    }

    public static void executarDesafio() {

        int colunaInformada = lerNumeroInteiro();
        char operacao = TECLADO.next().toUpperCase().charAt(0);


        double[][] matriz = carregarMatriz(TECLADO);


        double resultadoFinal = processarCalculo(matriz, colunaInformada, operacao);

        exibirResultado(resultadoFinal);
    }

    public static double[][] carregarMatriz(Scanner teclado) {
        double[][] m = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = teclado.nextDouble();
            }
        }
        return m;
    }

    public static double processarCalculo(double[][] matriz, int coluna, char tipo) {
        double soma = 0;

        for (int i = 0; i < 12; i++) {
            soma += matriz[i][coluna];
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