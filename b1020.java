import java.util.Scanner;

public class b1020 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void main(String[] args) {
        int dias = lerNumeroInteiro();
        int anos = dias / 365;
        int resto = dias % 365;
        int meses = resto / 30;
        resto = resto % 30;
        int diasRestantes = resto;
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(diasRestantes + " dia(s)");
    }
}
