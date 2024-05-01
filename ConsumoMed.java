import java.util.Scanner;

public class ConsumoMed {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Informe a distância total percorrida (em quilômetros):");
            double distancia = scanner.nextDouble();
    
            System.out.println("Informe o total de combustível gasto (em litros):");
            double combustivelGasto = scanner.nextDouble();
    
            double consumoMedio = distancia / combustivelGasto;
    
            System.out.printf("O consumo médio é de %.2f km/l\n", consumoMedio);
    
            scanner.close();
        }
    }
    

