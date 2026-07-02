import java.util.Scanner;

public class b1151 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerQuantidade() {
        int n = TECLADO.nextInt();
        TECLADO.nextLine(); // vou nem explicar mais
        return n;
    }

    public static String lerLinha() {
        return TECLADO.nextLine();
    }

    public static void exibirResultado(String texto) {
        System.out.println(texto);
    }

    public static String classificarFrase(String linha) {
        // Vetor para marca a presença de cada uma das 26 letras do alfabeto
        boolean[] letrasPresentes = new boolean[26];
        int letrasUnicas = 0;

        for (int i = 0; i < linha.length(); i++) {
            char c = linha.charAt(i);

            // Verifica se o caractere atual é uma letra minúscula
            if (c >= 'a' && c <= 'z') {
                int indice = c - 'a'; // Transforma 'a' em 0, 'b' em 1, e etc
                
                // Se a letra ainda não tinha sido contabilizada ele marca e soma na contagem
                if (!letrasPresentes[indice]) {
                    letrasPresentes[indice] = true;
                    letrasUnicas++;
                }
            }
        }

        // Regras de classificação com base na quantidade de letras encontradas
        if (letrasUnicas == 26) {
            return "frase completa";
        } else if (letrasUnicas >= 13) { // 13 metade de 26
            return "frase quase completa";
        } else {
            return "frase mal elaborada";
        }
    }

    public static void executarDesafio() {
        int n = lerQuantidade();
        
        for (int i = 0; i < n; i++) {
            String linha = lerLinha();
            
                // mesma coisa de sempre
            if (linha.isEmpty() && TECLADO.hasNextLine()) {
                linha = lerLinha();
            }
            
            String resultado = classificarFrase(linha);
            exibirResultado(resultado);
        }
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}