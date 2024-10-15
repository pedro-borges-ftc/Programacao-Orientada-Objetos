package Pessoas;
public class PessoaFisica extends Pessoa{
    //Atributos
    private String cpf;
    //Construtores
    PessoaFisica(){
        super();   //aqui é chamado o construtor da super classe - Pessoa()
        this.cpf = "";
    }
    PessoaFisica(String n, String e, String c){
        super(n,e);   //aqui é chamado o construtor da super classe - Pessoa(nome,endereco)
        this.cpf = c;
    }
    //Gets e Sets
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String c){
        this.cpf = c;
    }
    //métodos
    public String imprimirPessoaFisica(){
        String resposta = this.imprimirPessoa();
        resposta += "CPF: " + this.cpf + "\n";
        return resposta;
    }
}