import java.util.Scanner;

public class b1184 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static double lerValor() {
        return TECLADO.nextDouble();
    }

    public static char lerChar() {
        return TECLADO.next().toUpperCase().charAt(0);
    }

    public static void exibirResultado(double valor) {
        System.out.printf("%.1f%n", valor);
    }

    public static void executarDesafio() {
        char operacao = lerChar();
        double[][] m = new double[12][12];
        double soma = 0;
        int contagem = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = lerValor();
            }
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (j > i) { 
                    soma += m[i][j];
                    contagem++;
                }
            }
        }

        if (operacao == 'M') {
            exibirResultado(soma / contagem);
        } else {
            exibirResultado(soma);
        }
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}