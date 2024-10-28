package Aula09;

public class Onibus extends Transporte {
    //Atributos
    private String tipoOnibus;
    //Construtores
    public Onibus() {
        super();
        tipoOnibus = "";
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
    @Override
    public double calcularTarifa(){
        return 4.50; // Tarifa fixa para Ônibus}
    }
    //ImprimirInfo()
    @Override
    public void imprimirInfo(){
        super.imprimirInfo();
        System.out.println("Tipo de ônibus: " + this.tipoOnibus);
    }
    
}
