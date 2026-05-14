import java.util.Scanner;

public class b1018 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }

    public static void main(String[] args) {
        int valor = lerNumeroInteiro();
        int n100 = valor / 100;
        int resto = valor % 100;
        int n50 = resto / 50;
        resto = resto % 50;
        int n20 = resto / 20;
        resto = resto % 20;
        int n10 = resto / 10;
        resto = resto % 10;
        int n5 = resto / 5;
        resto = resto % 5;
        int n2 = resto / 2;
        resto = resto % 2;
        int n1 = resto / 1;

        System.out.println(valor);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");

    }
}