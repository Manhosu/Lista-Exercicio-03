import java.util.Scanner;

public class CalculoPesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando informações do usuário
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o sexo (M/F):");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.println("Digite a altura (em metros):");
        double altura = scanner.nextDouble();

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        // Calculando o peso ideal
        double pesoIdeal = 0;
        if (sexo == 'M') {
            if (altura > 1.70) {
                if (idade <= 20) {
                    pesoIdeal = (72.7 * altura) - 58;
                } else if (idade <= 39) {
                    pesoIdeal = (72.7 * altura) - 53;
                } else {
                    pesoIdeal = (72.7 * altura) - 45;
                }
            } else {
                if (idade <= 40) {
                    pesoIdeal = (72.7 * altura) - 50;
                } else {
                    pesoIdeal = (72.7 * altura) - 58;
                }
            }
        } else if (sexo == 'F') {
            if (altura > 1.50) {
                pesoIdeal = (62.1 * altura) - 44.7;
            } else {
                if (idade >= 35) {
                    pesoIdeal = (62.1 * altura) - 45;
                } else {
                    pesoIdeal = (62.1 * altura) - 49;
                }
            }
        }

        // Exibindo resultados
        if (pesoIdeal > 0) {
            System.out.printf("%s, seu peso ideal é: %.2f kg\n", nome, pesoIdeal);
        } else {
            System.out.println("Dados insuficientes para calcular o peso ideal.");
        }

        scanner.close();
    }
}
