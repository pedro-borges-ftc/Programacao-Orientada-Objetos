package Transporte;

public class Onibus extends Transporte {
    //Atributos
    private String tipoOnibus;
    //Construtores
    public Onibus() {
        super();
    }
    public Onibus(String empresa, int capacidade, String linha, String tipoOnibus) {
        super(empresa, capacidade, linha);
        this.tipoOnibus = tipoOnibus;
    }
    //Gets e Sets
    public String getTipoOnibus() {
        return tipoOnibus;
    }
    public void setTipoOnibus(String tipoOnibus) {
        this.tipoOnibus = tipoOnibus;
    }
    //CalcularTarifa
    public double calcularTarifa(){
        //Ler valor de algum lugar
       return this.getCapacidade() * 0.08;
    }
}
