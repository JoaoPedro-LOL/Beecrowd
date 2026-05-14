import java.util.Scanner;

public class b2592 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void main(String[] args) {

        while (true) {
            int n = lerNumeroInteiro();

            if (n == 0) {
                break;
            }

            int temtativa = 0;
            boolean encontro = false;

            while (!encontro) {

                temtativa++;
                boolean seqenciaCorreta = true;

                for (int i = 1; i <= n; i++) {
                    int numeroLido = TECLADO.nextInt();

                    if (numeroLido != i) {
                        seqenciaCorreta = false;
                    }
                }

                if (seqenciaCorreta) {
                    encontro = true;
                    System.out.printf("%d\n", temtativa);
                }
            }
        }

    }
}