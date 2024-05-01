import java.util.Scanner;

public class DescontoCarango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalDesconto = 0;
        double totalPago = 0;
        double valorVeiculo;

        while (true) {
            System.out.println("Digite o valor do veículo (digite 0 para encerrar):");
            valorVeiculo = scanner.nextDouble();

            if (valorVeiculo == 0) {
                break; 
            }

            System.out.println("Digite o tipo de combustível (Álcool, Gasolina, Diesel):");
            String combustivel = scanner.next();

            double desconto = 0;
            switch (combustivel.toLowerCase()) {
                case "álcool":
                    desconto = valorVeiculo * 0.25;
                    break;
                case "gasolina":
                    desconto = valorVeiculo * 0.21;
                    break;
                case "diesel":
                    desconto = valorVeiculo * 0.14;
                    break;
                default:
                    System.out.println("Tipo de combustível inválido. Digite novamente.");
                    continue;
            }

            double valorFinal = valorVeiculo - desconto;
            System.out.printf("Valor do desconto: R$%.2f\n", desconto);
            System.out.printf("Valor a pagar: R$%.2f\n", valorFinal);

            totalDesconto += desconto;
            totalPago += valorFinal;
        }

        System.out.printf("Total de desconto concedido: R$%.2f\n", totalDesconto);
        System.out.printf("Total pago pelos clientes: R$%.2f\n", totalPago);

        scanner.close();
    }
}

