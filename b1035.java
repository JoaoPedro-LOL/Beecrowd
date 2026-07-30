import java.util.Scanner;

public class b1035 {
    
    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }
    
    public static void main(String[] args) {
        int A = lerNumeroInteiro();
        int B = lerNumeroInteiro();
        int C = lerNumeroInteiro();
        int D = lerNumeroInteiro();
        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
