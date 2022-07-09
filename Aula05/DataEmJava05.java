package Aula05;

import java.util.Scanner;

public class DataEmJava05 {
    //Atributos da classe
    private int dia;
    private int mes;
    private int ano;
    //Métodos da classe
    //Construtor
    public DataEmJava05(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    //Gets e Sets
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String imprimir(){
        String resposta = this.dia + "/" + this.mes + "/" + this.ano;
        return resposta;
    }
    public void preencheDataEmJava(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o dia de Nascimento: ");
        this.dia = ler.nextInt();

        System.out.println("Digite o mês de Nascimento: ");
        this.mes = ler.nextInt();

        System.out.println("Digite o ano de Nascimento: ");
        this.ano = ler.nextInt();
    }
}