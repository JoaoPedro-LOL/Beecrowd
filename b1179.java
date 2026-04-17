
import java.util.Scanner;

public class b1179 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static void exibirVetor(int[] vetor, int quantidade, String tipo) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(tipo + "[" + i + "] = " + vetor[i]);
        }
    }

    public static void executarDesafio() {
        int[] pares = new int[5];
        int[] impares = new int[5];
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < 15; i++) {
            int valor = TECLADO.nextInt();

            if (valor % 2 == 0) {
                pares[contPar] = valor;
                contPar++;
            } else {
                impares[contImpar] = valor;
                contImpar++;
            }

            if (contPar == 5) {
                exibirVetor(pares, contPar, "par");
                contPar = 0;
            }

            if (contImpar == 5) {
                exibirVetor(impares, contImpar, "impar");
                contImpar = 0;
            }
        }

        exibirVetor(impares, contImpar, "impar");
        exibirVetor(pares, contPar, "par");
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}