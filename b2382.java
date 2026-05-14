import java.util.Scanner;

public class b2382 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void main(String[] args) {

        int l = lerNumeroInteiro();
        int a = lerNumeroInteiro();
        int p = lerNumeroInteiro();
        int r = lerNumeroInteiro();
        int diagonalQuadado = (l * l) + (a * a) + (p * p);
        int diametroEsfera = (2 * r) * (2 * r);

        if (diagonalQuadado <= diametroEsfera) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }
}