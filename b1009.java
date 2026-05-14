import java.util.Scanner;

public class b1009 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static String lerNomeString() {
        return TECLADO.nextLine();
    }

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }

    public static void main(String[] args) {
        //wtfq
        String NomeFuncionario = lerNomeString();
        double salarioFixo = lerNumeroDouble();
        double extra = lerNumeroDouble();
        double x = (double) (salarioFixo + (extra * 0.15));
        System.out.printf("TOTAL = R$ %.2f\n", x);
    }
}