package Aula11;

import java.util.List;
import java.util.Scanner;

public class PrincipalAula11 {
    public static void main(String[] args) {
        ContatoDAO contatoDAO = new ContatoDAO();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Buscar contato por ID");
            System.out.println("4. Atualizar contato");
            System.out.println("5. Remover contato");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                    // Adicionar contato
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Celular: ");
                    String celular = scanner.nextLine();

                    Contato novoContato = new Contato(0, nome, email, celular);
                    contatoDAO.adicionarContato(novoContato);
                    break;

                case 2:
                    // Listar contatos
                    List<Contato> contatos = contatoDAO.listarContatos();
                    for (Contato c : contatos) {
                        System.out.println(c.toString());
                    }
                    break;

                case 3:
                    // Buscar contato por ID
                    System.out.print("Digite o ID do contato: ");
                    int id = scanner.nextInt();
                    Contato contato = contatoDAO.buscarContatoPorId(id);
                    if (contato != null) {
                        System.out.println(contato.toString());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    // Atualizar contato
                    System.out.print("ID do contato: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer

                    Contato contatoExistente = contatoDAO.buscarContatoPorId(idAtualizar);
                    if (contatoExistente != null) {
                        System.out.print("Nome (atual: " + contatoExistente.getNome() + "): ");
                        contatoExistente.setNome(scanner.nextLine());

                        System.out.print("Email (atual: " + contatoExistente.getEmail() + "): ");
                        contatoExistente.setEmail(scanner.nextLine());

                        System.out.print("Celular (atual: " + contatoExistente.getCelular() + "): ");
                        contatoExistente.setCelular(scanner.nextLine());

                        contatoDAO.atualizarContato(contatoExistente);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    // Remover contato
                    System.out.print("ID do contato: ");
                    int idRemover = scanner.nextInt();
                    contatoDAO.removerContato(idRemover);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
