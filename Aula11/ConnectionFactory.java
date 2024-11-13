package Aula11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:sqlite:meuBancoDeDados.db"; // Caminho do banco SQLite

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados SQLite: " + e.getMessage(), e);
        }
    }
}

