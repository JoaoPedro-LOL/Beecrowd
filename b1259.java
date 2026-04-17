
import java.util.Scanner;

public class b1259 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static void exibirResultado(int[] vetor, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static void executarDesafio() {
        int n = TECLADO.nextInt();
        int[] pares = new int[n];
        int[] impares = new int[n];
        int contP = 0;
        int contI = 0;

        for (int i = 0; i < n; i++) {
            int valor = TECLADO.nextInt();
            if (valor % 2 == 0) {
                pares[contP++] = valor;
            } else {
                impares[contI++] = valor;
            }
        }

        ordenarCrescente(pares, contP);
        ordenarDecrescente(impares, contI);

        exibirResultado(pares, contP);
        exibirResultado(impares, contI);
    }

    public static void ordenarCrescente(int[] vetor, int tam) {
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static void ordenarDecrescente(int[] vetor, int tam) {
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}