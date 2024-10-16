package Funcionarios;

public class Engenheiro extends Funcionario {

    // Atributo específico da classe Engenheiro
    

    // Construtor padrão
    public Engenheiro() {
        super();  // Chama o construtor padrão da classe Funcionario
    }

    // Construtor com parâmetros
    public Engenheiro(String nome, String cpf, double salario) {
        super(nome, cpf, salario);  // Chama o construtor da classe Funcionario
    }

    // Getters e Setters

    // Sobrescrevendo o método imprime
    @Override
    public void imprime() {
        // Chama o método imprime da classe Funcionario
        super.imprime();
    }

    // Sobrescrevendo o método getBonificacao para retornar 20% do salário
    @Override
    public double getBonificacao() {
        return getSalario() * 0.20;  // 20% do salário
    }
}