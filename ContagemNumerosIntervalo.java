import java.util.Scanner;

public class ContagemNumerosIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0; 

        final int TOTAL_NUMEROS = 80;

        System.out.println("Digite 80 números:");

        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            System.out.printf("Número %d: ", i + 1);
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 10 e 150 (inclusive): " + contador);

        scanner.close();
    }
}
