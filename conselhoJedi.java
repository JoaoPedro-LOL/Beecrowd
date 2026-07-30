import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class conselhoJedi {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void main(String[] args) {

        while (TECLADO.hasNext()) {

            int TesteJovens = lerNumeroInteiro();
            int CandidatosDestecados = lerNumeroInteiro();

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < TesteJovens; i++) {
                list.add(lerNumeroInteiro());
            }

            list.sort(Collections.reverseOrder());

            for (int i = 0; i < CandidatosDestecados; i++) {
                System.out.print(list.get(i));

                if (i < CandidatosDestecados - 1) {
                    System.out.println(" ");
                }
            }
        }

    }

}