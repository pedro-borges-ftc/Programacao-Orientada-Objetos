package Aula11;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    // Método para adicionar um contato ao banco de dados
    public void adicionarContato(Contato contato) {
        String sql = "INSERT INTO contatos (nome, email, celular) VALUES (?, ?, ?)";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getCelular());
            stmt.executeUpdate();
            
            System.out.println("Contato adicionado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao adicionar contato: " + e.getMessage());
        }
    }

    // Método para listar todos os contatos
    public List<Contato> listarContatos() {
        String sql = "SELECT * FROM contatos";
        List<Contato> contatos = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Contato contato = new Contato();
                contato.setCodigo(rs.getInt("codigo"));
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setCelular(rs.getString("celular"));

                contatos.add(contato);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar contatos: " + e.getMessage());
        }
        return contatos;
    }

    // Método para buscar um contato por ID
    public Contato buscarContatoPorId(int id) {
        String sql = "SELECT * FROM contatos WHERE codigo = ?";
        Contato contato = null;

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                contato = new Contato();
                contato.setCodigo(rs.getInt("codigo"));
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setCelular(rs.getString("celular"));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar contato: " + e.getMessage());
        }
        return contato;
    }

    // Método para atualizar um contato
    public void atualizarContato(Contato contato) {
        String sql = "UPDATE contatos SET nome = ?, email = ?, celular = ? WHERE codigo = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getCelular());
            stmt.setInt(4, contato.getCodigo());

            stmt.executeUpdate();
            System.out.println("Contato atualizado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar contato: " + e.getMessage());
        }
    }

    // Método para remover um contato
    public void removerContato(int id) {
        String sql = "DELETE FROM contatos WHERE codigo = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Contato removido com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao remover contato: " + e.getMessage());
        }
    }
}

