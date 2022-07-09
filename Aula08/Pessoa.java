import java.util.Scanner;

public class Pessoa{
    //Atributos
    private String nome;
    private String endereco;
    
    //Construtores
    Pessoa(){
        this.nome = "";
        this.endereco = "";
    }
     Pessoa(String n, String e){
        this.nome = n;
        this.endereco = e;
    }
    //Gets
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    //Sets
    public void setNome(String n){
        this.nome = n;
    }
    public void setEndereco(String e){
        this.endereco = e;
    }
    //métodos
    public String imprimirPessoa(){
        String resposta = "Nome: " + this.nome + "\n";
        resposta += "Endereco: " + this.endereco + "\n";
        
        return resposta;
    }
}