import java.util.Scanner;

public class ClassificacaoNadador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando a idade do nadador
        System.out.println("Digite a idade do nadador:");
        int idade = scanner.nextInt();

        // Classificando o nadador com base na idade
        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("Categoria: Sênior");
        } else {
            System.out.println("Idade fora da faixa etária");
        }

        scanner.close();
    }
}
