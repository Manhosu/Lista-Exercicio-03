import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas você gostaria de verificar?");
        int totalPessoas = scanner.nextInt();

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.printf("Informe a idade da pessoa %d:\n", i);
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Pessoa " + i + ": maior de idade");
            } else {
                System.out.println("Pessoa " + i + ": menor de idade");
            }
        }

        scanner.close();
    }
}
