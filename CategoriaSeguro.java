import java.util.Scanner;

public class CategoriaSeguro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do pretendente:");
        int idade = scanner.nextInt();
        scanner.nextLine(); 

        if (idade < 17 || idade > 70) {
            System.out.println(nome + " não se enquadra na faixa etária para adquirir apólices de seguro.");
            scanner.close();
            return;
        }

        System.out.println("Digite o grupo de risco do pretendente (Baixo, Médio, Alto):");
        String grupoRisco = scanner.nextLine().toUpperCase();

        int categoria = determinarCategoria(idade, grupoRisco);

        if (categoria != 0) {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Grupo de Risco: " + grupoRisco);
            System.out.println("Categoria de Seguro: " + categoria);
        } else {
            System.out.println("Dados inválidos ou grupo de risco desconhecido.");
        }

        scanner.close();
    }

    private static int determinarCategoria(int idade, String grupoRisco) {
        int categoria = 0;
        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case "BAIXO":
                    categoria = 1;
                    break;
                case "MÉDIO":
                    categoria = 2;
                    break;
                case "ALTO":
                    categoria = 3;
                    break;
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case "BAIXO":
                    categoria = 2;
                    break;
                case "MÉDIO":
                    categoria = 3;
                    break;
                case "ALTO":
                    categoria = 4;
                    break;
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case "BAIXO":
                    categoria = 3;
                    break;
                case "MÉDIO":
                    categoria = 4;
                    break;
                case "ALTO":
                    categoria = 5;
                    break;
            }
        } else if (idade >= 35 && idade <= 64) {
            switch (grupoRisco) {
                case "BAIXO":
                    categoria = 4;
                    break;
                case "MÉDIO":
                    categoria = 5;
                    break;
                case "ALTO":
                    categoria = 6;
                    break;
            }
        } else if (idade >= 65 && idade <= 70) {
            switch (grupoRisco) {
                case "BAIXO":
                    categoria = 7;
                    break;
                case "MÉDIO":
                    categoria = 8;
                    break;
                case "ALTO":
                    categoria = 9;
                    break;
            }
        }
        return categoria;
    }
}
