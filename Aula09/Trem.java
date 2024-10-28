package Aula09;

public class Trem extends Transporte {
    //Atributos
    private int numeroVagoes;
    //Construtores
    public Trem() {
        super();
    }
    public Trem(String empresa, int capacidade, String linha, int numeroVagoes) {
        super(empresa, capacidade, linha);
        this.numeroVagoes = numeroVagoes;
    }
    //Gets e Sets
      public int getNumeroVagoes() {
        return numeroVagoes;
    }
    public void setNumeroVagoes(int numeroVagoes) {
        this.numeroVagoes = numeroVagoes;
    }
    //calcularTarifa
    @Override
    public double calcularTarifa() {
        return 3.75; // Tarifa fixa para Trem
    }
    //imprimirInfo
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Número de Vagões: " + numeroVagoes);
    }  
}

