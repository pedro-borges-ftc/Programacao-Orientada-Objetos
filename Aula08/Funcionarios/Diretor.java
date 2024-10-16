package Funcionarios;

public class Diretor extends Funcionario {

    // Atributo específico da classe Diretor
    private int numeroDepartamentosGerenciados;

    // Construtor padrão
    public Diretor() {
        super();  // Chama o construtor padrão da classe Funcionario
        this.numeroDepartamentosGerenciados = 0;
    }

    // Construtor com parâmetros
    public Diretor(String nome, String cpf, double salario, int numeroDepartamentosGerenciados) {
        super(nome, cpf, salario);  // Chama o construtor da classe Funcionario
        this.numeroDepartamentosGerenciados = numeroDepartamentosGerenciados;
    }

    // Getters e Setters
    public int getNumeroDepartamentosGerenciados() {
        return numeroDepartamentosGerenciados;
    }

    public void setNumeroDepartamentosGerenciados(int numeroDepartamentosGerenciados) {
        this.numeroDepartamentosGerenciados = numeroDepartamentosGerenciados;
    }

    // Sobrescrevendo o método imprime para incluir o número de departamentos gerenciados
    @Override
    public void imprime() {
        // Chama o método imprime da classe Funcionario
        super.imprime();
        // Adiciona a impressão do número de departamentos gerenciados
        System.out.println("Número de Departamentos Gerenciados: " + numeroDepartamentosGerenciados);
    }

    // Sobrescrevendo o método getBonificacao para retornar 30% do salário
    @Override
    public double getBonificacao() {
        return getSalario() * 0.30;  // 30% do salário
    }
}