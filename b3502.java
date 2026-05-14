import java.util.Scanner;

public class b3502 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }

    public static void main(String[] args) {
        int t = lerNumeroInteiro();
        int c = lerNumeroInteiro();
        int b = lerNumeroInteiro(); 
        int res = (t * c * b);
        System.out.println(res);
    }
}