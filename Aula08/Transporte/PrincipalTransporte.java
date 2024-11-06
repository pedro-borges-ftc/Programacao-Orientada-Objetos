package Transporte;

import java.util.Scanner;

public class PrincipalTransporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transporte transporte = null;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU:");
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir dados");
            System.out.println("2 - Imprimir dados");
            System.out.println("3 - Calcular tarifa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:
                    System.out.println("Escolha o tipo de transporte:");
                    System.out.println("1 - Ônibus");
                    System.out.println("2 - Trem");
                    System.out.println("3 - Metrô");
                    System.out.print("Opção: ");
                    int tipoTransporte = scanner.nextInt();
                    scanner.nextLine(); // Consome a quebra de linha

                    System.out.print("Empresa: ");
                    String empresa = scanner.nextLine();

                    System.out.print("Capacidade: ");
                    int capacidade = scanner.nextInt();
                    scanner.nextLine(); // Consome a quebra de linha

                    System.out.print("Linha: ");
                    String linha = scanner.nextLine();
                   
                    switch (tipoTransporte) {
                        case 1://Ônibus
                            System.out.print("Tipo do ônibus: ");
                            String tipoOnibus = scanner.nextLine();
                            transporte = new Onibus(empresa, capacidade, linha, tipoOnibus);
                            break;
                        case 2://Trem
                            System.out.println("implementação pendente");
                            break;
                        case 3://Metrô
                            System.out.println("implementação pendente");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                case 2:
                    if (transporte != null) {
                        transporte.imprimirInfo();
                    } else {
                        System.out.println("Nenhum transporte cadastrado.");
                    }
                    break;

                case 3:
                    if (transporte != null) {
                        System.out.println("Tarifa: R$ " + transporte.calcularTarifa());
                    } else {
                        System.out.println("Nenhum transporte cadastrado.");
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
