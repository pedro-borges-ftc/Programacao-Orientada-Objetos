package Funcionarios;

public class Funcionario {

    // Atributos
    private String nome;
    private String cpf;
    private double salario;

    // Construtor padrão (vazio)
    public Funcionario() {
        // Inicializa com valores padrão
        this.nome = "";
        this.cpf = "";
        this.salario = 0.0;
    }

    // Construtor com parâmetros
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // Getters e Setters

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo cpf
    public String getCpf() {
        return cpf;
    }

    // Setter para o atributo cpf
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Getter para o atributo salario
    public double getSalario() {
        return salario;
    }

    // Setter para o atributo salario
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para imprimir as informações do funcionário
    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: R$ " + salario);
    }

    // Método para calcular e retornar a bonificação (10% do salário)
    public double getBonificacao() {
        return salario * 0.10; // 10% do salário
    }
}