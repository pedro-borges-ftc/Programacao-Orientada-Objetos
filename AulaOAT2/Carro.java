package AulaOAT2;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando suavemente.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está reduzindo a velocidade.");
    }
}