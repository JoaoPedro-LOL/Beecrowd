import java.util.Scanner;

public class b1332 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerQuantidade() {
        int n = TECLADO.nextInt();
        TECLADO.nextLine(); // Limpa o buffer 
        return n;
    }

    public static String lerLinha() {
        return TECLADO.nextLine();
    }

    public static void exibirResultado(int valor) {
        System.out.println(valor);
    }

    public static int reconhecerPalavra(String palavra) {
        // Se tem 5 letras, só pode ser "three"
        if (palavra.length() == 5) {
            return 3;
        }

        // Se tem 3 letras ele testa se é one contando as letras
        int acertos = 0;
        if (palavra.charAt(0) == 'o') acertos++;
        if (palavra.charAt(1) == 'n') acertos++;
        if (palavra.charAt(2) == 'e') acertos++;

        if (acertos >= 2) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void executarDesafio() {
        int n = lerQuantidade();
        
        for (int i = 0; i < n; i++) {
            String palavra = lerLinha();
            
            // Correção para o Scanner, aprendi com meu erro 
            if (palavra.isEmpty() && TECLADO.hasNextLine()) {
                palavra = lerLinha();
            }
            
            int resultado = reconhecerPalavra(palavra);
            exibirResultado(resultado);
        }
    }

    public static void main(String[] args) {
        executarDesafio();
        //bem facinho esse em
    }
}