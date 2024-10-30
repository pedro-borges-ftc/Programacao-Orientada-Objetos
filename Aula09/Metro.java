package Aula09;

public class Metro extends Transporte {
    //Atributos
    private int numeroEstacoes;
    //Construtores
    public Metro() {
        super();
        numeroEstacoes = 0;
    }
    public Metro(String empresa, int capacidade, String linha, int numeroEstacoes) {
        super(empresa, capacidade, linha);
        this.numeroEstacoes = numeroEstacoes;
    }
    //Gets e Sets
    public int getNumeroEstacoes() {
        return numeroEstacoes;
    }
    public void setNumeroEstacoes(int numeroEstacoes) {
        this.numeroEstacoes = numeroEstacoes;
    }
    //calcularTarifa
    @Override
    public double calcularTarifa() {
        return 5.00; // Tarifa fixa para Metrô
    }
    //imprimirInfo
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Número de Estações: " + numeroEstacoes);
    }
}

