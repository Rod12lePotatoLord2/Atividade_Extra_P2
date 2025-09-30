import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bom dia, escolha o tipo de veículo que deseja cadastrar (1 - Carro, 2 - Moto, 3 - Caminhão): ");
            int tipoVeiculo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Informe a placa do veículo: ");
            String placa = scanner.nextLine();

            System.out.println("Agora, informe a marca do veículo: ");
            String marca = scanner.nextLine();

            System.out.println("Por fim, qual é o preço do veículo? ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            if (tipoVeiculo == 1) {
                System.out.println("Número de portas do carro: ");
                int Portas = scanner.nextInt();
                veiculos.add(new Carro(placa, marca, preco, Portas));
            } else if (tipoVeiculo == 2) {
                System.out.println("Cilindradas da moto: ");
                int cilindradas = scanner.nextInt();
                veiculos.add(new Moto(placa, marca, preco, cilindradas));
            } else if (tipoVeiculo == 3) {
                System.out.println("Capacidade da carga do caminhão (em toneladas): ");
                double capacidadeDaCarga = scanner.nextDouble();
                veiculos.add(new Caminhao(placa, marca, preco, capacidadeDaCarga));
            }

            System.out.println("Deseja cadastrar outro veículo? (s/n): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("\nVeículos cadastrados:");
        for (Veiculo veiculo : veiculos) {
            veiculo.mostrarDados();
            System.out.println(" ");
        }
    }
}