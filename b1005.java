import java.util.Scanner;

public class b1005 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void main(String[] args) {
        int numFuncionario = lerNumeroInteiro();
        int horasTrabalhadas = lerNumeroInteiro();
        float valorPorHora = lerNumeroInteiro();
        float x = horasTrabalhadas * valorPorHora;
        System.out.printf("NUMBER = %d\n", numFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", x);
    }
}