import java.util.Scanner;

public class b1253 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {

        if (TECLADO.hasNextInt()) {
            int n = TECLADO.nextInt();
            TECLADO.nextLine();

            for (int i = 0; i < n; i++) {
                String textoCriptografado = TECLADO.nextLine();
                int deslocamento = TECLADO.nextInt();
                TECLADO.nextLine();

                StringBuilder textoOriginal = new StringBuilder();

                for (int j = 0; j < textoCriptografado.length(); j++) {
                    char letra = textoCriptografado.charAt(j);

                    int posicaoAtual = letra - 'A';
                    int novaPosicao = (posicaoAtual - deslocamento + 26) % 26;

                    char letraOriginal = (char) (novaPosicao + 'A');
                    textoOriginal.append(letraOriginal);
                }

                System.out.println(textoOriginal.toString());
            }
        }
    }
}