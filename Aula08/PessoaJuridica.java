import java.util.Scanner;

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
    public void preencherDados(){
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("***PESSOA JURÍDICA***");
            System.out.println("Digite o nome: ");
            String n = ler.nextLine();
            this.setNome(n);//***************
            
            System.out.println("Digite o endereco: ");
            String e = ler.nextLine();
            this.setEndereco(e);//***************
            
            System.out.println("Digite o CNPJ: ");
            this.cnpj = ler.nextLine();
        }
    }
}