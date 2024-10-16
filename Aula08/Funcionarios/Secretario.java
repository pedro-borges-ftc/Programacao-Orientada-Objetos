package Funcionarios;

public class Secretario extends Funcionario {

    // Atributo específico da classe Secretario
    

    // Construtor padrão
    public Secretario() {
        super();  // Chama o construtor padrão da classe Funcionario
    }

    // Construtor com parâmetros
    public Secretario(String nome, String cpf, double salario) {
        super(nome, cpf, salario);  // Chama o construtor da classe Funcionario
    }

    // Getters e Setters

    // Sobrescrevendo o método imprime
    @Override
    public void imprime() {
        // Chama o método imprime da classe Funcionario
        super.imprime();
    }

    // Sobrescrevendo o método getBonificacao para retornar 5% do salário
    @Override
    public double getBonificacao() {
        return getSalario() * 0.05;  // 5% do salário
    }
}