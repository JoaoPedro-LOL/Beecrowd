import java.util.Scanner;

public class b1024 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerQuantidade() {
        int n = TECLADO.nextInt();
        TECLADO.nextLine(); // limpar o buffer do Scanner depois de ler um inteiro
        return n;
    }

    public static String lerLinha() {
        return TECLADO.nextLine();
    }

    public static void exibirResultado(String texto) {
        System.out.println(texto);
    }

    public static String criptografar(String linha) {
        char[] caracteres = linha.toCharArray();
        
        //Deslocar letras +3
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                caracteres[i] = (char) (c + 3);
            }
        }
        
        //Inverter a linha
        char[] invertido = new char[caracteres.length];
        for (int i = 0; i < caracteres.length; i++) {
            invertido[i] = caracteres[caracteres.length - 1 - i];
        }
        
        //Deslocar da metade em diante -1
        int metade = invertido.length / 2;
        for (int i = metade; i < invertido.length; i++) {
            invertido[i] = (char) (invertido[i] - 1);
        }
        
        return new String(invertido);
    }

    public static void executarDesafio() {
        int n = lerQuantidade();
        
        for (int i = 0; i < n; i++) {
            String linha = lerLinha();
            
            // Correção para o Scanner, fui debuga e deu erro aqui
            if (linha.isEmpty() && TECLADO.hasNextLine()) {
                linha = lerLinha();
            }
            
            String linhaCriptografafa = criptografar(linha);
            exibirResultado(linhaCriptografafa);
        }
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}