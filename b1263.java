import java.util.Scanner;

public class b1263 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static boolean temProximaLinha() {
        return TECLADO.hasNextLine();
    }

    public static String lerLinha() {
        return TECLADO.nextLine();
    }

    public static void exibirResultado(int valor) {
        System.out.println(valor);
    }

    public static int contarAliteracoes(String linha) {

        // Divide a linha em um array de palavras usando o espaço como separador
        String[] palavras = linha.split(" ");       
                    //trabalho feito com esse carinha aqui

        if (palavras.length <= 1) {
            return 0;
        }

        int totalAliteracoes = 0;
        boolean emAliteracao = false;

        // Compara cada palavra com a sua anteriora
        for (int i = 1; i < palavras.length; i++) {
            
            // o de sempre denovo
            char letraAtual = Character.toLowerCase(palavras[i].charAt(0));
            char letraAnterior = Character.toLowerCase(palavras[i - 1].charAt(0));

            if (letraAtual == letraAnterior) {
                // meio auto-explicativo, se não estiver em aliteração ele soma e marca que ta
                if (!emAliteracao) {
                    totalAliteracoes++;
                    emAliteracao = true;
                }
            } else {
                // Se as iniciais forem diferentes, a sequência de aliteração babou
                emAliteracao = false;
            }
        }

        return totalAliteracoes;
    }

    public static void executarDesafio() {

        while (temProximaLinha()) {
            String linha = lerLinha();
            
            // Ignora linhas vazias caso aconteça
            if (linha.trim().isEmpty()) {
                continue;
            }

            int resultadoBolado = contarAliteracoes(linha);
            exibirResultado(resultadoBolado);
        }
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}