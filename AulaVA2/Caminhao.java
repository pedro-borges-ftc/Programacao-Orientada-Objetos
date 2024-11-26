package AulaVA2;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(int id, String marca, String modelo, int ano, double capacidadeCarga) {
        super(id, marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("O caminhão está ganhando velocidade.");
    }

    @Override
    public void frear() {
        System.out.println("O caminhão está freando lentamente devido à carga.");
    }
}