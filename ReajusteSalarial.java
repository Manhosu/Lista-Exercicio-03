import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_FUNCIONARIOS = 584;
        double salarioMinimo;
        
        System.out.println("Digite o valor do salário mínimo atual:");
        salarioMinimo = scanner.nextDouble();

        double totalReajuste = 0;

        for (int i = 1; i <= TOTAL_FUNCIONARIOS; i++) {
            System.out.printf("Digite o salário do funcionário %d:\n", i);
            double salarioAtual = scanner.nextDouble();

            double percentualReajuste;

            if (salarioAtual < 3 * salarioMinimo) {
                percentualReajuste = 0.50;
            } else if (salarioAtual >= 3 * salarioMinimo && salarioAtual <= 10 * salarioMinimo) {
                percentualReajuste = 0.20;
            } else if (salarioAtual > 10 * salarioMinimo && salarioAtual <= 20 * salarioMinimo) {
                percentualReajuste = 0.15;
            } else {
                percentualReajuste = 0.10;
            }

            double reajuste = salarioAtual * percentualReajuste;
            double novoSalario = salarioAtual + reajuste;
            totalReajuste += reajuste;

            System.out.printf("Funcionário %d: Salário antigo: R$ %.2f, Reajuste: R$ %.2f, Novo Salário: R$ %.2f\n",
                              i, salarioAtual, reajuste, novoSalario);
        }

        System.out.printf("Total de reajuste distribuído: R$ %.2f\n", totalReajuste);

        scanner.close();
    }
}
