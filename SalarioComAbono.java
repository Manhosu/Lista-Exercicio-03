import java.util.Scanner;

public class SalarioComAbono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do funcionário:");
        int idade = scanner.nextInt();

        System.out.println("Digite o sexo do funcionário (M/F):");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.println("Digite o salário fixo do funcionário:");
        double salarioFixo = scanner.nextDouble();

        double abono;
        if (sexo == 'M') {
            if (idade >= 30) {
                abono = 100.00;
            } else {
                abono = 50.00;
            }
        } else if (sexo == 'F') {
            if (idade >= 30) {
                abono = 200.00;
            } else {
                abono = 80.00;
            }
        } else {
            System.out.println("Sexo inválido. Por favor, digite 'M' para masculino ou 'F' para feminino.");
            abono = 0;
        }

        double salarioLiquido = salarioFixo + abono;

        System.out.println("Nome do funcionário: " + nome);
        System.out.printf("Salário líquido (incluindo abono): R$ %.2f\n", salarioLiquido);

        scanner.close();
    }
}
