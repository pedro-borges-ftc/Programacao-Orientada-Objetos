package Aula09;

import java.util.Scanner;

public class PrincipalTransporte09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transporte onibus = new Onibus();
        Transporte trem = new Trem();
        Transporte metro = new Metro();
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

            System.out.println("Escolha o tipo de transporte:");
            System.out.println("1 - Ônibus");
            System.out.println("2 - Trem");
            System.out.println("3 - Metrô");
            System.out.print("Opção: ");
            int tipoTransporte = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1://1 - Inserir dados
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
                            onibus = new Onibus(empresa, capacidade, linha, tipoOnibus);
                            break;
                        case 2://Trem
                            System.out.print("Tipo do ônibus: ");
                            int numeroVagoes = scanner.nextInt();
                            scanner.nextLine(); // Consome a quebra de linha
                            trem = new Trem(empresa, capacidade, linha, numeroVagoes);
                            break;
                        case 3://Metrô
                            System.out.print("Tipo do ônibus: ");
                            int numeroEstacoes = scanner.nextInt();
                            scanner.nextLine(); // Consome a quebra de linha
                            metro = new Metro(empresa, capacidade, linha, numeroEstacoes);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                case 2://2 - Imprimir dados                    
                    switch (tipoTransporte) {
                        case 1://Ônibus
                            onibus.imprimirInfo();
                            break;
                        case 2://Trem
                            trem.imprimirInfo();
                            break;
                        case 3://Metrô
                            metro.imprimirInfo();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;
                case 3://3 - Calcular tarifa
                    switch (tipoTransporte) {
                        case 1://Ônibus
                            onibus.calcularTarifa();
                            break;
                        case 2://Trem
                            trem.calcularTarifa();
                            break;
                        case 3://Metrô
                            metro.calcularTarifa();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
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
