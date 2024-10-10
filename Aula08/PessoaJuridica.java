public class PessoaJuridica extends Pessoa{
    //Atributos
    private String cnpj;
    //Construtores
    PessoaJuridica(){
        super();   //aqui é chamado o construtor da super classe - Pessoa()
        this.cnpj = "";
    }
    PessoaJuridica(String n, String e, String c){
        super(n,e);   //aqui é chamado o construtor da super classe - Pessoa(nome,endereco)
        this.cnpj = c;
    }
    //Gets e Sets
    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(String c){
        this.cnpj = c;
    }
    //métodos
    public String imprimirPessoaJuridica(){
        String resposta = this.imprimirPessoa();
        resposta += "CNPJ: " + this.cnpj + "\n";
        
        return resposta;
    }
}