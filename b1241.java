import java.util.Scanner;

public class b1241 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerQuantidade() {
        int n = TECLADO.nextInt();
        return n;
    }

    public static String lerValor() {
        return TECLADO.next();
    }

    public static void exibirResultado(String texto) {
        System.out.println(texto);
    }

    public static String verificarEncaixe(String a, String b) {
        // Se B for maior que A é IMPOSSÍVEL ele estar contido no final do A
        if (b.length() > a.length()) {
            return "nao encaixa";
        }
        
        // Verifica se a string A termina com os caracteres da string B
        if (a.endsWith(b)) {
            return "encaixa";
        } else {
            return "nao encaixa";
        }
    }

    public static void executarDesafio() {
        int n = lerQuantidade();
        
        for (int i = 0; i < n; i++) {
            String a = lerValor();
            String b = lerValor();
            
            String resultado = verificarEncaixe(a, b);
            exibirResultado(resultado);
        }
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}