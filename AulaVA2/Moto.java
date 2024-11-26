package AulaVA2;

public class Moto extends Veiculo {
    public Moto(int id, String marca, String modelo, int ano) {
        super(id, marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando rapidamente!");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando.");
    }
}