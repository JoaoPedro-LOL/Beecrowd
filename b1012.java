import java.util.Scanner;

public class b1012 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }

    public static void main(String[] args) {
        double a = lerNumeroDouble();
        double b = lerNumeroDouble();
        double c = lerNumeroDouble();
        double areaTriangulo = (a * c) / 2;
        double areaCirculo = 3.14159 * Math.pow(c, 2);
        double areaTrapezio = ((a + b) * c) / 2;
        double areaquadrado = Math.pow(b, 2);
        double areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f", areaTriangulo);
        System.out.printf("\nCIRCULO: %.3f", areaCirculo);
        System.out.printf("\nTRAPEZIO: %.3f", areaTrapezio);
        System.out.printf("\nQUADRADO: %.3f", areaquadrado);
        System.out.printf("\nRETANGULO: %.3f\n", areaRetangulo);
    }
}