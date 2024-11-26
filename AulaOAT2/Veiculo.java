package AulaOAT2;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos abstratos
    public abstract void acelerar();
    public abstract void frear();

    // Método concreto
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}