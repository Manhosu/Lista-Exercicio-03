import java.util.Scanner;

public class CalculoSalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas efetuadas pelo vendedor (em dinheiro):");
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;

        double salarioFinal = salarioFixo + comissao;

        System.out.printf("Nome do Vendedor: %s\n", nome);
        System.out.printf("Salário Fixo: R$ %.2f\n", salarioFixo);
        System.out.printf("Salário Final (com comissão): R$ %.2f\n", salarioFinal);

        scanner.close();
    }
}



