import java.util.Scanner;

public class b1607 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerQuantidade() {
        int t = TECLADO.nextInt();
        return t;
    }

    
    public static String lerPalavra() {
        return TECLADO.next();
    }

    public static void exibirResultado(int valor) {
        System.out.println(valor);
    }

    public static int calcularOperacoes(String a, String b) {
        int totalOperacoes = 0;

        for (int i = 0; i < a.length(); i++) {
            char charA = a.charAt(i);
            char charB = b.charAt(i);

            // Calcula a diferença de posições na tabela asc
            int diferenca = charB - charA;

            // Se for negativo significa que a letra deu a volta no alfabeto z para a
            if (diferenca < 0) {
                diferenca += 26;
            }

            totalOperacoes += diferenca;
        }

        return totalOperacoes;
    }

    public static void executarDesafio() {
        int t = lerQuantidade();
        
        for (int i = 0; i < t; i++) {
            String sA = lerPalavra();
            String sB = lerPalavra();
            
            int resultado = calcularOperacoes(sA, sB);
            exibirResultado(resultado);
        }
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}