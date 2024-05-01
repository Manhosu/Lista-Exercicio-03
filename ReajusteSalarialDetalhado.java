import java.util.Scanner;

public class ReajusteSalarialDetalhado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double aumentoTotalFolha = 0;

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário atual do funcionário:");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();

        double percentualReajuste = 0;
        if (salarioAtual < 3 * salarioMinimo) {
            percentualReajuste = 0.50; // 50%
        } else if (salarioAtual >= 3 * salarioMinimo && salarioAtual <= 10 * salarioMinimo) {
            percentualReajuste = 0.20; // 20%
        } else if (salarioAtual > 10 * salarioMinimo && salarioAtual <= 20 * salarioMinimo) {
            percentualReajuste = 0.15; // 15%
        } else {
            percentualReajuste = 0.10; // 10%
        }

        double reajuste = salarioAtual * percentualReajuste;
        double novoSalario = salarioAtual + reajuste;

        aumentoTotalFolha += reajuste;

        System.out.printf("Nome do funcionário: %s\n", nome);
        System.out.printf("Reajuste: R$ %.2f\n", reajuste);
        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
        System.out.printf("Aumento total na folha de pagamento: R$ %.2f\n", aumentoTotalFolha);

        scanner.close();
    }
}
