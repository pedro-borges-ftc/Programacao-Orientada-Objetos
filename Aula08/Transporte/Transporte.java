package Aula08.Transporte;

/**
 * Transporte vai ser a superclasse do exercício
 */
public class Transporte {
    //Atributos
    private String empresa;
    private int capacidade;
    private String linha;
    //Construtores
    public Transporte() {
        empresa = "";
        capacidade = 0;
        linha = "";
    }
    public Transporte(String empresa, int capacidade, String linha) {
        this.empresa = empresa;
        this.capacidade = capacidade;
        this.linha = linha;
    }
    //Get
    public String getEmpresa() {
        return empresa;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public String getLinha() {
        return linha;
    }
    //Sets
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public void setLinha(String linha) {
        this.linha = linha;
    }
    //ImprimirInfo()
    public void imprimirInfo(){
        System.out.println("Empresa: " + this.empresa);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Linha: " + this.linha);
    }
    //CalcularTarifa
    public double calcularTarifa(){
       return 0;
    }
}