import java.util.Scanner;

public class CalculoContaLuz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double VALOR_RESIDENCIAL = 0.60;
        final double VALOR_COMERCIO = 0.48;
        final double VALOR_INDUSTRIA = 1.29;

        System.out.println("Digite o tipo de cliente (1-Residência, 2-Comércio, 3-Indústria):");
        int tipoCliente = scanner.nextInt();

        System.out.println("Digite o consumo em kWh:");
        double consumo = scanner.nextDouble();

        double valorTotal = 0;
        switch (tipoCliente) {
            case 1:
                valorTotal = consumo * VALOR_RESIDENCIAL;
                break;
            case 2: 
                valorTotal = consumo * VALOR_COMERCIO;
                break;
            case 3: 
                valorTotal = consumo * VALOR_INDUSTRIA;
                break;
            default:
                System.out.println("Tipo de cliente inválido. Por favor, digite 1, 2 ou 3.");
                break;
        }

        if (valorTotal > 0) {
            System.out.printf("O valor da conta de luz é: R$ %.2f\n", valorTotal);
        }

        scanner.close();
    }
}
