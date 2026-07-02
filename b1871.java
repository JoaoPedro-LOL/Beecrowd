import java.util.Scanner;

public class b1871 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static long lerValor() {
        return TECLADO.nextLong();
    }

    public static void exibirResultado(String texto) {
        System.out.println(texto);
    }

    public static String somarSemZeros(long m, long n) {

        long soma = m + n;
        
        // Transforma a soma em texto e remove todos os 0
        String resultadoSoma = String.valueOf(soma);
        String resultadoSemZero = resultadoSoma.replace("0", "");
                                            //muito dahora esse comando
        return resultadoSemZero;
    }

    public static void executarDesafio() {
        while (true) {
            long m = lerValor();
            long n = lerValor();
            
            //quando M e N forem iguais a 0
            if (m == 0 && n == 0) {
                break;
            }
            
            String resultado = somarSemZeros(m, n);
            exibirResultado(resultado);
        }
    }

    public static void main(String[] args) {
        executarDesafio();
    }
}