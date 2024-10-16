package Funcionarios;

public class Gerente extends Funcionario {

    // Atributo específico da classe Gerente
    private int numeroFuncionariosGerenciados;

    // Construtor padrão
    public Gerente() {
        super();  // Chama o construtor padrão da classe Funcionario
        this.numeroFuncionariosGerenciados = 0;
    }

    // Construtor com parâmetros
    public Gerente(String nome, String cpf, double salario, int numeroFuncionariosGerenciados) {
        super(nome, cpf, salario);  // Chama o construtor da classe Funcionario
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    // Getters e Setters
    public int getNumeroFuncionariosGerenciados() {
        return numeroFuncionariosGerenciados;
    }

    public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    // Sobrescrevendo o método imprime para incluir o número de funcionários gerenciados
    @Override
    public void imprime() {
        // Chama o método imprime da classe Funcionario
        super.imprime();
        // Adiciona a impressão do número de funcionários gerenciados
        System.out.println("Número de Funcionários Gerenciados: " + numeroFuncionariosGerenciados);
    }

    // Sobrescrevendo o método getBonificacao para retornar 15% do salário
    @Override
    public double getBonificacao() {
        return getSalario() * 0.15;  // 15% do salário
    }
}