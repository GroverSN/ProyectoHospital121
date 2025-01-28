package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logica.Hospital;

public class HospitalDAO {

    // Método para insertar un hospital
    public void insertarHospital(String nombreHospital, String direccion) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO hospital (nombreHospital, direccion) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombreHospital);
            statement.setString(2, direccion);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para listar hospitales
    public List<Hospital> listarHospitales() {
        List<Hospital> hospitales = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM hospital";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String nombreHospital = resultSet.getString("nombreHospital");
                String direccion = resultSet.getString("direccion");
                hospitales.add(new Hospital(nombreHospital, direccion));
            }
        } catch (SQLException e) {
            System.out.println("Error al listar hospitales: " + e.getMessage());
        }
        return hospitales;
    }
}
