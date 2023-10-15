package root.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import root.config.TablaCONFIG;
import root.entity.Tabla;

public class TablaDAO {
    private TablaCONFIG tablaConfig;

    public TablaDAO() {
        tablaConfig = new TablaCONFIG();
    }

    public List<Tabla> findAll() {
        List<Tabla> tablas = new ArrayList<>();
        String sql = "SELECT * FROM Tabla";

        try (Connection connection = tablaConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Tabla tabla = new Tabla();
                tabla.setId(resultSet.getInt("ID"));
                tabla.setNombre(resultSet.getString("Nombre"));
                tabla.setApellido(resultSet.getString("Apellido"));
                tabla.setEdad(resultSet.getInt("Edad"));
                tabla.setEmail(resultSet.getString("Email"));
                tablas.add(tabla);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tablas;
    }

    public Tabla findById(Integer id) {
        return null;
    }

    public void create(Tabla tabla) {
    }

    public void update(Tabla tabla) {
    }

    public void delete(Integer id) {
    }
}
