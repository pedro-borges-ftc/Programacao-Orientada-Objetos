public class Moeda {
    //atributos
    private double valor;
    private String nome;
    
    //Construtores
    Moeda(){
        this.valor = 0.0;
        this.nome = "";
    }

    Moeda(double v, String n){
        this.valor = v;
        this.nome = n;
    }

    //métodos
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
