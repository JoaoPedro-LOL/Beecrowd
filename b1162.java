import java.util.Scanner;

public class b1162 {

    public static Scanner LER = new Scanner(System.in);

    public static void lerVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = LER.nextInt();
        }
    }

    public static int acharNumTrocas(int[] trem) {
        int trocas = 0;
        int temp;
        int tamanho = trem.length;

        //bubble sort
    
        for (int j = 0; j < trem.length - 1; j++) {
            tamanho--;
        
            for (int i = 0; i < tamanho; i++) {
                if (trem[i] > trem[i + 1]) {
                    temp = trem[i];
                    trem[i] = trem[i + 1];
                    trem[i + 1] = temp;
                    trocas++;
                }
            }
        }

        return trocas;
    }

    public static void main(String[] args) {
        int N;
        int L;
        int[] trem;
        int trocas;

        N = LER.nextInt();

        for (int i = 0; i < N; i++) {
            L = LER.nextInt();

            trem = new int[L];

            lerVetor(trem);

            trocas = acharNumTrocas(trem);

            System.out.printf("Optimal train swapping takes %d swaps.\n", trocas);
        }
    }
}