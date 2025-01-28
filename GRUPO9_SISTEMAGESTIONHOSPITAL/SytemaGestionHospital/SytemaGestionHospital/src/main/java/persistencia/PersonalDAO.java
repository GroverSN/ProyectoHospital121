package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logica.Personal;
import logica.Doctor;
import logica.Enfermero;

public class PersonalDAO {

    public void insertarPersonal(String nombre, int edad, String genero, String turno, String cargo, double sueldo) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO personal (nombre, edad, genero, turno, cargo, sueldo) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setInt(2, edad);
            statement.setString(3, genero);
            statement.setString(4, turno);
            statement.setString(5, cargo);
            statement.setDouble(6, sueldo);
            statement.executeUpdate();
            System.out.println("Personal insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar personal: " + e.getMessage());
        }
    }

    public List<Personal> listarPersonal() {
        List<Personal> personalList = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM personal";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                // Aquí puedes decidir qué tipo de personal crear según el cargo o cualquier otro criterio
                Personal personal;
                if (resultSet.getString("cargo").equalsIgnoreCase("Doctor")) {
                    personal = new Doctor(
                        resultSet.getString("nombre"),
                        resultSet.getInt("edad"),
                        resultSet.getString("genero"),
                        resultSet.getString("turno"),
                        resultSet.getString("cargo"),
                        resultSet.getDouble("sueldo")
                    );
                } else {
                    personal = new Enfermero(
                        resultSet.getString("nombre"),
                        resultSet.getInt("edad"),
                        resultSet.getString("genero"),
                        resultSet.getString("turno"),
                        resultSet.getString("cargo"),
                        resultSet.getDouble("sueldo")
                    );
                }
                personalList.add(personal);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar personal: " + e.getMessage());
        }
        return personalList;
    }
}
