package AulaVA2;

public class Carro extends Veiculo {
    public Carro(int id, String marca, String modelo, int ano) {
        super(id, marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }
}