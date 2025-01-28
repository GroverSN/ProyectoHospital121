package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logica.Habitacion;

public class HabitacionDAO {

    public void insertarHabitacion(String tipo, int capacidad, boolean equipoEspecializado, int idHospital) {
    try (Connection connection = DatabaseConnection.getConnection()) {
        String sql = "INSERT INTO habitacion (idHabitacion , tipo , capacidad, equipoEspecializado, idHospital) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, tipo);
        statement.setInt(2, capacidad);
        statement.setBoolean(3, equipoEspecializado);
        statement.setInt(4, idHospital);
        statement.executeUpdate();
        System.out.println("Habitación insertada correctamente.");
    } catch (SQLException e) {
        System.out.println("Error al insertar habitación: " + e.getMessage());
    }
}
    
    public List<Habitacion> listarHabitaciones() {
    List<Habitacion> habitaciones = new ArrayList<>();
    try (Connection connection = DatabaseConnection.getConnection()) {
        String sql = "SELECT * FROM habitacion";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Habitacion habitacion = new Habitacion(
                resultSet.getInt("idHabitacion"),
                resultSet.getString("tipo"),
                resultSet.getInt("capacidad"),
                resultSet.getBoolean("equipoEspecializado"),
                resultSet.getInt("idHospital")
            );
            habitaciones.add(habitacion);
        }
    } catch (SQLException e) {
        System.out.println("Error al listar habitaciones: " + e.getMessage());
    }
    return habitaciones;
}

}
