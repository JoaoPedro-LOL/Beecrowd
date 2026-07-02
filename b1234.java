import java.util.Scanner;

public class b1234 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static boolean temProximaLinha() {
        return TECLADO.hasNextLine();
    }

    public static String lerLinha() {
        return TECLADO.nextLine();
    }

    public static void exibirResultado(String texto) {
        System.out.println(texto);
    }
                        //nome estranho de escrever
    public static String transformarEmDancante(String linha) {
        char[] caracteres = linha.toCharArray();
        boolean masicula = true; // A primeira letra deve ser SEMPRE maiuscula

        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];

            // Verifica se o caractere atual é uma letra
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (masicula) {
                    caracteres[i] = Character.toUpperCase(c);
                } else {
                    caracteres[i] = Character.toLowerCase(c);
                }
                //Alterna o estado para a próxima letra e ignora espaços
                masicula = !masicula;
            }
        }

        return new String(caracteres);
    }

    public static void executarDesafio() {
        // Como a entrada contém vários casos de teste ele roda até o fim do arquivo
        while (temProximaLinha()) {
            String linha = lerLinha();
            String resultado = transformarEmDancante(linha);
            exibirResultado(resultado);
        }
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}