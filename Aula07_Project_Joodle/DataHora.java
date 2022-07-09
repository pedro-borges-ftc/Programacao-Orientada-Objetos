import java.util.Scanner;

public class DataHora {
    //atributos-------------
    private DataEmJava d1 = new DataEmJava();
    private Hora h1 = new Hora();
    //construtores----------
    DataHora(){
        this.d1 = new DataEmJava();
        this.h1 = new Hora();
    }
    DataHora(DataEmJava d, Hora h){
        this.d1 = d;
        this.h1 = h;
    }
    public DataEmJava getD1() {
        return d1;
    }
    public void setD1(DataEmJava d1) {
        this.d1 = d1;
    }
    public Hora getH1() {
        return h1;
    }
    public void setH1(Hora h1) {
        this.h1 = h1;
    }
    public String imprimir(){
        String resposta = d1.imprimir() + " " + h1.imprimir();
        return resposta;
    }
    public void preencheDataHora(){
        this.d1.preencheDataEmJava();
        this.h1.preencheHora();
    }
}
