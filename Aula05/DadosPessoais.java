package Aula05;

import java.util.Scanner;

public class DadosPessoais {
    //Atributos da classe
    private String nome;
    private DataEmJava05 dataNasc;
    private int idade;
    //Construtor
    public DadosPessoais(){
        this.dataNasc = new DataEmJava05(01, 01, 01);
    }
    public DadosPessoais(String nome, DataEmJava05 dataNasc, int idade) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.idade = idade;
    }
    //Gets e Sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public DataEmJava05 getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(DataEmJava05 dataNasc) {
        this.dataNasc = dataNasc;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    //Extra
    public void alterarData(int dia, int mes, int ano){
        this.dataNasc.setDia(dia);
        this.dataNasc.setMes(mes);
        this.dataNasc.setAno(ano);    
    }
    public void imprimir(){
        System.out.println("***Dados Pessoais***");
        System.out.println("Nome: " + this.nome);
        System.out.println("Data Nascimento: " + this.dataNasc.imprimir());
        System.out.println("Idade: " + this.idade);
    }
    public void preencheDadosPessoais(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        this.nome = ler.nextLine();

        System.out.println("Digite a idade: ");
        this.idade = ler.nextInt();

        this.dataNasc.preencheDataEmJava();
    }
}