import java.util.Scanner;

public class b1021 {
    public final static Scanner TECLADO = new Scanner(System.in);

    public static double lerNumeroDOuble() {
        return TECLADO.nextDouble();
    }


    public static void main(String[] args) {
        double valor = lerNumeroDOuble();

        int notas100 = (int) (valor / 100);
        valor = valor % 100;

        int notas50 = (int) (valor / 50);
        valor = valor % 50;

        int notas20 = (int) (valor / 20);
        valor = valor % 20;

        int notas10 = (int) (valor / 10);
        valor = valor % 10;

        int notas5 = (int) (valor / 5);
        valor = valor % 5;

        int notas2 = (int) (valor / 2);
        valor = valor % 2;

        int moedas1 = (int) (valor / 1);
        valor = valor % 1;

        int moedas50cents = (int) (valor / 0.50);
        valor = valor % 0.50;

        int moedas25cents = (int) (valor / 0.25);
        valor = valor % 0.25;

        int moedas10cents = (int) (valor / 0.10);
        valor = valor % 0.10;

        int moedas5cents = (int) (valor / 0.05);
        valor = valor % 0.05;

        int moedas1cent = (int) Math.round(valor / 0.01);

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50cents + " moeda(s) de R$ 0.50");
        System.out.println(moedas25cents + " moeda(s) de R$ 0.25");
        System.out.println(moedas10cents + " moeda(s) de R$ 0.10");
        System.out.println(moedas5cents + " moeda(s) de R$ 0.05");
        System.out.println(moedas1cent + " moeda(s) de R$ 0.01");

    }
}
