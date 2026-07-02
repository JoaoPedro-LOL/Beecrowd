import java.util.Scanner;

public class b1272 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerQuantidade() {
        int n = TECLADO.nextInt();
        TECLADO.nextLine(); // Limpa o buffer do tecladito
        return n;
    }

    public static String lerLinha() {
        return TECLADO.nextLine();
    }

    public static void exibirResultado(String texto) {
        System.out.println(texto);
    }

    public static String descobriMensagem(String linha) {
        char[] caracteres = linha.toCharArray();
        String resultado = "";
        
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            
            // checa se é o começo de uma palavra
            if (c >= 'a' && c <= 'z') {
                //primeira letra se estiver no índice 0 OU se o caractere anterior for um espaço
                if (i == 0 || caracteres[i - 1] == ' ') {
                    resultado += c;
                }
            }
        }
        
        return resultado;
    }

    public static void executarDesafio() {
        int n = lerQuantidade();
        
        for (int i = 0; i < n; i++) {
            String linha = lerLinha();
            
            // se tiver uma linha vazia ele mata ela e le a correta
            if (linha.isEmpty() && TECLADO.hasNextLine()) {
                linha = lerLinha();
            }
            
            String mensagemOcurta = descobriMensagem(linha);
            exibirResultado(mensagemOcurta);
        }
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}