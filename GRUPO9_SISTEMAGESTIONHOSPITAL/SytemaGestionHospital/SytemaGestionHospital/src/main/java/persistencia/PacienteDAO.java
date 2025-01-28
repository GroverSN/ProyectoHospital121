package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logica.Paciente;

public class PacienteDAO {

    public void insertarPaciente(String nombre, int edad, String genero, String diagnostico, String fechaIngreso, String estadoClinico, int nroHabitacion, int nroCamilla) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO paciente (nombre, edad, genero, diagnostico, fechaIngreso, estadoClinico, nroHabitacion, nroCamilla) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setInt(2, edad);
            statement.setString(3, genero);
            statement.setString(4, diagnostico);
            statement.setString(5, fechaIngreso);
            statement.setString(6, estadoClinico);
            statement.setInt(7, nroHabitacion);
            statement.setInt(8, nroCamilla);
            statement.executeUpdate();
            System.out.println("Paciente insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar paciente: " + e.getMessage());
        }
    }

    public List<Paciente> listarPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM paciente";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Paciente paciente = new Paciente(
                        resultSet.getString("nombre"),
                        resultSet.getInt("edad"),
                        resultSet.getString("genero"),
                        resultSet.getString("diagnostico"),
                        resultSet.getString("fechaIngreso"),
                        resultSet.getString("estadoClinico"),
                        resultSet.getInt("nroHabitacion"),
                        resultSet.getInt("nroCamilla")
                );
                pacientes.add(paciente);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar pacientes: " + e.getMessage());
        }
        return pacientes;
    }
}
