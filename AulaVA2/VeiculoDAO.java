package AulaVA2;

import java.util.List;

public interface VeiculoDAO {
    void inserirVeiculo(Veiculo veiculo);
    List<Veiculo> listarVeiculos();
    Veiculo buscarVeiculoPorId(int id);
    void atualizarVeiculo(Veiculo veiculo);
    void removerVeiculo(int id);
}