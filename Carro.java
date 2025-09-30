public class Carro extends Veiculo {
    private int Portas;

    public Carro(String placa, String marca, double preco, int Portas) {
        super(placa, marca, preco);
        this.Portas = Portas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de portas: " + Portas);
    }

    public void mostrarDados(boolean mostrarPortas) {
        super.mostrarDados();
        if (mostrarPortas) {
            System.out.println("Número de portas: " + Portas);
        }
    }
}