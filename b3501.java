
import java.util.Scanner;

public class b3501 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }

    public static int leituraMatriz(int n, int m, int[][] matriz) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = lerNumeroInteiro();
            }
        }
        return 0;
    }

    public static int horizontal(int n, int m, int k, int[][] matriz) {
        String maiorNumero = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m - k; j++) {
                StringBuilder sb = new StringBuilder();
                for (int off = 0; off < k; off++) {
                    sb.append(matriz[i][j + off]);
                }
                String atual = sb.toString();
                if (maiorNumero.equals("") || atual.compareTo(maiorNumero) > 0) {
                    maiorNumero = atual;
                }
            }
        }

        return 0;
    }

    public static int diagonal(int n, int m, int k, int[][] matriz) {
        String maiorNumero = "";
        for (int i = 0; i <= n - k; i++) {
            for (int j = 0; j <= m - k; j++) {
                StringBuilder sb = new StringBuilder();
                for (int offset = 0; offset < k; offset++) {
                    sb.append(matriz[i + offset][j + offset]);
                }
                String atual = sb.toString();
                if (maiorNumero.equals("") || atual.compareTo(maiorNumero) > 0) {
                    maiorNumero = atual;
                }
            }
        }

        return 0;
    }

    public static int printhorizontal(int n, int m, int k, int[][] matriz) {
        String maiorNumero = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m - k; j++) {
                StringBuilder sb = new StringBuilder();
                for (int off = 0; off < k; off++) {
                    sb.append(matriz[i][j + off]);
                }
                String atual = sb.toString();
                if (maiorNumero.equals("") || atual.compareTo(maiorNumero) > 0) {
                    maiorNumero = atual;
                }
            }
        }
        System.out.println(maiorNumero);
        return 0;
    }

    public static int printdiagonal(int n, int m, int k, int[][] matriz) {
        String maiorNumero = "";
        for (int i = 0; i <= n - k; i++) {
            for (int j = 0; j <= m - k; j++) {
                StringBuilder sb = new StringBuilder();
                for (int offset = 0; offset < k; offset++) {
                    sb.append(matriz[i + offset][j + offset]);
                }
                String atual = sb.toString();
                if (maiorNumero.equals("") || atual.compareTo(maiorNumero) > 0) {
                    maiorNumero = atual;
                }
            }
        }
        System.out.println(maiorNumero);
        return 0;
    }

    public static void main(String[] args) {

        // Leitura de N e M
        int n = lerNumeroInteiro();
        int m = lerNumeroInteiro();
        int mai2;
        int mai1;

        // Leitura da matriz
        int[][] matriz = new int[n][m];
        leituraMatriz(n, m, matriz);

        // Leitura de K
        int k = lerNumeroInteiro();
        String maiorNumero = "";

        // Opção 1: Horizontal (Esquerda para Direita)
        mai1 = horizontal(n, m, k, matriz);

        // Opção 2: Diagonal (Cima para Baixo, Esquerda para Direita)
        mai2 = diagonal(n, m, k, matriz);

        if (mai1 > mai2) {
            printdiagonal(n, m, k, matriz);
        } else {
            printhorizontal(n, m, k, matriz);
        }

    }
}
