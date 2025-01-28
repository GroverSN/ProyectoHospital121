package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logica.Medicamento;

public class MedicamentoDAO {

    public void insertarMedicamento(String nombre, String tipo, int cantidad, double costo) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO medicamento (nombre, tipo, cantidad, costo) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, tipo);
            statement.setInt(3, cantidad);
            statement.setDouble(4, costo);
            statement.executeUpdate();
            System.out.println("Medicamento insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar medicamento: " + e.getMessage());
        }
    }

    public List<Medicamento> listarMedicamentos() {
        List<Medicamento> medicamentos = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM medicamento";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Medicamento medicamento = new Medicamento(
                    resultSet.getString("nombre"),
                    resultSet.getString("tipo"),
                    resultSet.getInt("cantidad"),
                    resultSet.getDouble("costo")
                );
                medicamentos.add(medicamento);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar medicamentos: " + e.getMessage());
        }
        return medicamentos;
    }
}
