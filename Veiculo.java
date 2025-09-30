public class Veiculo {
    protected String placa;
    protected String marca;
    protected double preco;

    public Veiculo(String placa, String marca, double preco) {
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }

    public void mostrarDados() {
        System.out.println("Placa do veículo: " + placa);
        System.out.println("Marca do veículo: " + marca);
        System.out.println("Preço do veículo: R$ " + preco);
    }

    public void mostrarDados(double desconto) {
        double precoDesconto = preco * (1 - desconto / 100);
        System.out.println("Placa do veículo: " + placa);
        System.out.println("Marca do veículo: " + marca);
        System.out.println("Preço do veículo (com desconto): R$ " + precoDesconto);
    }
}