import java.util.Scanner;

public class CalculoSalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o nome do vendedor
        System.out.println("Digite o nome do vendedor:");
        String nome = scanner.nextLine();

        // Solicita ao usuário o salário fixo do vendedor
        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        // Solicita ao usuário o total de vendas efetuadas em dinheiro
        System.out.println("Digite o total de vendas efetuadas pelo vendedor (em dinheiro):");
        double totalVendas = scanner.nextDouble();

        // Calcula a comissão de 15% sobre o total de vendas
        double comissao = totalVendas * 0.15;

        // Calcula o salário total no final do mês
        double salarioFinal = salarioFixo + comissao;

        // Exibe o nome do vendedor, salário fixo e o salário final
        System.out.printf("Nome do Vendedor: %s\n", nome);
        System.out.printf("Salário Fixo: R$ %.2f\n", salarioFixo);
        System.out.printf("Salário Final (com comissão): R$ %.2f\n", salarioFinal);

        // Fecha o scanner
        scanner.close();
    }
}



