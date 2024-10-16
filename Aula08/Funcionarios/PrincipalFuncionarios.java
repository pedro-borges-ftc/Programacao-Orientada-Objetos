package Funcionarios;

import java.util.Scanner;

public class PrincipalFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = null;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU:");
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir dados");
            System.out.println("2 - Imprimir dados");
            System.out.println("3 - Calcular bonificação");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:
                    System.out.println("Escolha o tipo de funcionário:");
                    System.out.println("1 - Funcionário comum");
                    System.out.println("2 - Engenheiro");
                    System.out.println("3 - Diretor");
                    System.out.println("4 - Gerente");
                    System.out.println("5 - Secretário");
                    System.out.print("Opção: ");
                    int tipoFuncionario = scanner.nextInt();
                    scanner.nextLine(); // Consome a quebra de linha

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); // Consome a quebra de linha

                    switch (tipoFuncionario) {
                        case 1:
                            funcionario = new Funcionario(nome, cpf, salario);
                            break;
                        case 2:
                            funcionario = new Engenheiro(nome, cpf, salario);
                            break;
                        case 3:
                            System.out.print("Número de departamentos gerenciados: ");
                            int numDeptos = scanner.nextInt();
                            funcionario = new Diretor(nome, cpf, salario, numDeptos);
                            break;
                        case 4:
                            System.out.print("Número de funcionários gerenciados: ");
                            int numFuncionarios = scanner.nextInt();
                            funcionario = new Gerente(nome, cpf, salario, numFuncionarios);
                            break;
                        case 5:
                            funcionario = new Secretario(nome, cpf, salario);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                case 2:
                    if (funcionario != null) {
                        funcionario.imprime();
                    } else {
                        System.out.println("Nenhum funcionário cadastrado.");
                    }
                    break;

                case 3:
                    if (funcionario != null) {
                        System.out.println("Bonificação: R$ " + funcionario.getBonificacao());
                    } else {
                        System.out.println("Nenhum funcionário cadastrado.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
