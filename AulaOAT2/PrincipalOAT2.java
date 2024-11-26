package AulaOAT2;

import java.util.ArrayList;
import java.util.List;

public class PrincipalOAT2 {
    public static void main(String[] args) {
        // Criação dos objetos
        Veiculo carro = new Carro("Toyota", "Corolla", 2022);
        Veiculo moto = new Moto("Honda", "CB500", 2021);
        Veiculo caminhao = new Caminhao("Volvo", "FH", 2020, 25.0);

        // Lista de veículos
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro);
        veiculos.add(moto);
        veiculos.add(caminhao);

        // Interação com os veículos
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirInformacoes();
            veiculo.acelerar();
            veiculo.frear();
            System.out.println();
        }
    }
}