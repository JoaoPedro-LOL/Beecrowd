import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExameGeral {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void main(String[] args) {

        while (TECLADO.hasNext()) {
            
            int numHabitantes = lerNumeroInteiro();
            int numConsultas = lerNumeroInteiro();
            int res = 0;

            ArrayList<Integer> listinha = new ArrayList<>();

            for (int i = 0; i < numHabitantes; i++) {
                listinha.add(lerNumeroInteiro());
            }

            listinha.sort(Collections.reverseOrder());

            for (int i = 0; i < numConsultas; i++) {
                res = lerNumeroInteiro();
            }

            System.out.println(listinha.get(res - 1));
        }
    }
}