package AulaVA2;

import java.util.List;
import java.util.Scanner;

public class PrincipalVA2 {
    public static void main(String[] args) {
        VeiculoDAO veiculoDAO = new VeiculoDAOImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Sistema de Gerenciamento de Veículos =====");
            System.out.println("1. Adicionar Veículo");
            System.out.println("2. Listar Veículos");
            System.out.println("3. Buscar Veículo por ID");
            System.out.println("4. Atualizar Veículo");
            System.out.println("5. Remover Veículo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o tipo do veículo (Carro, Moto, Caminhao): ");
                    String tipo = scanner.next();
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Marca: ");
                    String marca = scanner.next();
                    System.out.print("Modelo: ");
                    String modelo = scanner.next();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();

                    if (tipo.equalsIgnoreCase("Caminhao")) {
                        System.out.print("Capacidade de carga: ");
                        double capacidadeCarga = scanner.nextDouble();
                        veiculoDAO.inserirVeiculo(new Caminhao(id, marca, modelo, ano, capacidadeCarga));
                    } else if (tipo.equalsIgnoreCase("Carro")) {
                        veiculoDAO.inserirVeiculo(new Carro(id, marca, modelo, ano));
                    } else if (tipo.equalsIgnoreCase("Moto")) {
                        veiculoDAO.inserirVeiculo(new Moto(id, marca, modelo, ano));
                    }
                    break;

                case 2:
                    List<Veiculo> veiculos = veiculoDAO.listarVeiculos();
                    for (Veiculo veiculo : veiculos) {
                        veiculo.exibirInformacoes();
                        veiculo.acelerar();
                        veiculo.frear();
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do veículo: ");
                    int buscarId = scanner.nextInt();
                    Veiculo veiculo = veiculoDAO.buscarVeiculoPorId(buscarId);
                    if (veiculo != null) {
                        veiculo.exibirInformacoes();
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Digite o ID do veículo a ser atualizado: ");
                    int atualizarId = scanner.nextInt();
                    Veiculo veiculoExistente = veiculoDAO.buscarVeiculoPorId(atualizarId);
                    if (veiculoExistente != null) {
                        System.out.print("Nova Marca: ");
                        String novaMarca = scanner.next();
                        System.out.print("Novo Modelo: ");
                        String novoModelo = scanner.next();
                        System.out.print("Novo Ano: ");
                        int novoAno = scanner.nextInt();

                        veiculoExistente.setMarca(novaMarca);
                        veiculoExistente.setModelo(novoModelo);
                        veiculoExistente.setAno(novoAno);

                        veiculoDAO.atualizarVeiculo(veiculoExistente);
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o ID do veículo a ser removido: ");
                    int removerId = scanner.nextInt();
                    veiculoDAO.removerVeiculo(removerId);
                    System.out.println("Veículo removido com sucesso!");
                    break;

                case 6:
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
