package AulaVA2;

public abstract class Veiculo {
    protected int id;
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(int id, String marca, String modelo, int ano) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public abstract void acelerar();

    public abstract void frear();

    public void exibirInformacoes() {
        System.out.println("ID: " + id + ", Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}