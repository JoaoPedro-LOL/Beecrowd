import java.util.Scanner;

public class b1022 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void main(String[] args) {

        int n = lerNumeroInteiro();

        for (int i = 0; i < n; i++) {

            int n1 = lerNumeroInteiro();
            TECLADO.next();
            int d1 = lerNumeroInteiro();
            String op = TECLADO.next();
            int n2 = lerNumeroInteiro();
            TECLADO.next();
            int d2 = lerNumeroInteiro();
            int numRes = 0, denRes = 0;
            if (op.equals("+")) {
                numRes = (n1 * d2) + (n2 * d1);
                denRes = d1 * d2;
            } else if (op.equals("-")) {
                numRes = (n1 * d2) - (n2 * d1);
                denRes = d1 * d2;
            } else if (op.equals("*")) {
                numRes = n1 * n2;
                denRes = d1 * d2;
            } else if (op.equals("/")) {
                numRes = n1 * d2;
                denRes = n2 * d1;
            }
            int a = numRes;
            int b = denRes;
            while (b != 0) {
                int resto = a % b;
                a = b;
                b = resto;
            }
            int mdc = Math.abs(a);
            int numSimp = numRes / mdc;
            int denSimp = denRes / mdc;
            System.out.println(numRes + "/" + denRes + " = " + numSimp + "/" + denSimp);
        }
    }
}