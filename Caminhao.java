public class Caminhao extends Veiculo {
    private double capacidadeDaCarga;

    public Caminhao(String placa, String marca, double preco, double capacidadeDaCarga) {
        super(placa, marca, preco);
        this.capacidadeDaCarga = capacidadeDaCarga;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Capacidade da carga: " + capacidadeDaCarga + " toneladas");
    }

    public void mostrarDados(boolean emKg) {
        super.mostrarDados();
        if (emKg) {
            double capacidadeDaCargaKg = capacidadeDaCarga * 1000;
            System.out.println("Capacidade da carga: " + capacidadeDaCargaKg + " kg");
        } else {
            System.out.println("Capacidade da carga: " + capacidadeDaCarga + " toneladas");
        }
    }
}