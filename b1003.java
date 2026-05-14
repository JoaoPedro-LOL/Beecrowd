import java.util.Scanner;

public class b1003 {

        public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }


    public static void main(String[] args) {
        int a = lerNumeroInteiro();
        int b = lerNumeroInteiro();
        int x = a + b;
        System.out.println("SOMA = " + x);
    }
}