package AulaVA2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VeiculoDAOImpl implements VeiculoDAO {

    @Override
    public void inserirVeiculo(Veiculo veiculo) {
        String sql = "INSERT INTO veiculos (id, marca, modelo, ano, tipo, capacidadeCarga) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, veiculo.getId());
            stmt.setString(2, veiculo.getMarca());
            stmt.setString(3, veiculo.getModelo());
            stmt.setInt(4, veiculo.getAno());

            if (veiculo instanceof Carro) {
                stmt.setString(5, "Carro");
                stmt.setNull(6, Types.DOUBLE);
            } else if (veiculo instanceof Moto) {
                stmt.setString(5, "Moto");
                stmt.setNull(6, Types.DOUBLE);
            } else if (veiculo instanceof Caminhao) {
                stmt.setString(5, "Caminhao");
                stmt.setDouble(6, ((Caminhao) veiculo).getCapacidadeCarga());
            }

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Veiculo> listarVeiculos() {
        List<Veiculo> veiculos = new ArrayList<>();
        String sql = "SELECT * FROM veiculos";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int ano = rs.getInt("ano");
                String tipo = rs.getString("tipo");

                Veiculo veiculo;
                if (tipo.equals("Carro")) {
                    veiculo = new Carro(id, marca, modelo, ano);
                } else if (tipo.equals("Moto")) {
                    veiculo = new Moto(id, marca, modelo, ano);
                } else if (tipo.equals("Caminhao")) {
                    double capacidadeCarga = rs.getDouble("capacidadeCarga");
                    veiculo = new Caminhao(id, marca, modelo, ano, capacidadeCarga);
                } else {
                    continue; // Tipo desconhecido
                }
                veiculos.add(veiculo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return veiculos;
    }

    @Override
    public Veiculo buscarVeiculoPorId(int id) {
        String sql = "SELECT * FROM veiculos WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int ano = rs.getInt("ano");
                String tipo = rs.getString("tipo");

                if (tipo.equals("Carro")) {
                    return new Carro(id, marca, modelo, ano);
                } else if (tipo.equals("Moto")) {
                    return new Moto(id, marca, modelo, ano);
                } else if (tipo.equals("Caminhao")) {
                    double capacidadeCarga = rs.getDouble("capacidadeCarga");
                    return new Caminhao(id, marca, modelo, ano, capacidadeCarga);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void atualizarVeiculo(Veiculo veiculo) {
        String sql = "UPDATE veiculos SET marca = ?, modelo = ?, ano = ?, tipo = ?, capacidadeCarga = ? WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, veiculo.getMarca());
            stmt.setString(2, veiculo.getModelo());
            stmt.setInt(3, veiculo.getAno());

            if (veiculo instanceof Carro) {
                stmt.setString(4, "Carro");
                stmt.setNull(5, Types.DOUBLE);
            } else if (veiculo instanceof Moto) {
                stmt.setString(4, "Moto");
                stmt.setNull(5, Types.DOUBLE);
            } else if (veiculo instanceof Caminhao) {
                stmt.setString(4, "Caminhao");
                stmt.setDouble(5, ((Caminhao) veiculo).getCapacidadeCarga());
            }

            stmt.setInt(6, veiculo.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removerVeiculo(int id) {
        String sql = "DELETE FROM veiculos WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}