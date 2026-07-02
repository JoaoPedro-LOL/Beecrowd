import java.util.Scanner;

public class b2062 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerQuantidade() {
        int n = TECLADO.nextInt();
        return n;
    }

    public static String lerPalavra() {
        return TECLADO.next();
    }

    public static void exibirResultado(String texto) {
        System.out.println(texto);
    }

    public static String corrigirTexto(int n) {
        String resultado = "";

        for (int i = 0; i < n; i++) {
            String palavra = lerPalavra();

            // Se a palavra tem exatamente 3 letras avalia a correção
            if (palavra.length() == 3) {

                            //aprendi mais ou menos esse aqui
                if (palavra.startsWith("OB")) {
                    palavra = "OBI";
                } else if (palavra.startsWith("UR")) {
                    palavra = "URI";
                }
            }

            // Monta a frase final
            if (i == 0) {
                resultado += palavra;
            } else {
                resultado += " " + palavra;
            }
        }

        return resultado;
    }

    public static void executarDesafio() {
        int n = lerQuantidade();
        String textoCorrigido = corrigirTexto(n);
        exibirResultado(textoCorrigido);
    }

    public static void main(String[] args) {
        executarDesafio();
        //sabor boi 
    }
}