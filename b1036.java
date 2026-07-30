import java.util.Scanner;

public class b1036 {
    
    public final static Scanner TECLADO = new Scanner(System.in);

    public static double lerNumeroDouble() {
        return TECLADO.nextDouble();
    }
    
    public static void main(String[] args) {
        double A = lerNumeroDouble();
        double B = lerNumeroDouble();
        double C = lerNumeroDouble();
        double delta = Math.pow(B, 2) - 4 * A * C;
        if (delta < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }

}
