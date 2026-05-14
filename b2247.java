import java.util.Scanner;

public class b2247 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void main(String[] args) {

        int n;
        int teste = 1;

        while ((n = lerNumeroInteiro()) != 0) {

            System.out.println("Teste " + teste);

            int sardoAcumulado = 0;

            for (int i = 0; i < n; i++) {
                int j = lerNumeroInteiro();
                int z = lerNumeroInteiro();

                sardoAcumulado += (j - z);

                System.out.println(sardoAcumulado);
            }

            System.out.println();

            teste++;
        }

    }
}