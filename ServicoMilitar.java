import java.util.Scanner;

public class ServicoMilitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de pessoas para avaliar:");
        int totalPessoas = scanner.nextInt();
        scanner.nextLine();

        int totalAptos = 0;
        int totalInaptos = 0;

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Digite o nome da pessoa:");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa (M/F):");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            System.out.println("Digite a idade da pessoa:");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("A pessoa está em boa saúde? (S/N):");
            char saude = scanner.nextLine().toUpperCase().charAt(0);

            boolean apto = (sexo == 'M' && idade >= 18 && idade <= 35 && saude == 'S');
            
            if (apto) {
                totalAptos++;
                System.out.println(nome + " está apto para o serviço militar obrigatório.");
            } else {
                totalInaptos++;
                System.out.println(nome + " não está apto para o serviço militar obrigatório.");
            }
        }

        System.out.println("Total de pessoas avaliadas: " + totalPessoas);
        System.out.println("Total de aptos: " + totalAptos);
        System.out.println("Total de inaptos: " + totalInaptos);

        scanner.close();
    }
}
