package AulaOAT2;

public class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto acelera rapidamente!");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando com cuidado.");
    }
}