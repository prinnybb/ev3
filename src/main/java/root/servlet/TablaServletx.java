package root.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import root.entity.Tabla;

@WebServlet(name = "TablaServletx", urlPatterns = {"/TablaServletx"})
public class TablaServletx extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=CIISA;user=sa;password=admin123";
            Connection connection = DriverManager.getConnection(jdbcUrl);

            String sql = "SELECT * FROM Tabla";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            List<Tabla> tablas = new ArrayList<>();

            while (resultSet.next()) {
                Tabla tabla = new Tabla();
                tabla.setId(resultSet.getInt("ID"));
                tabla.setNombre(resultSet.getString("Nombre"));
                tabla.setApellido(resultSet.getString("Apellido"));
                tabla.setEdad(resultSet.getInt("Edad"));
                tabla.setEmail(resultSet.getString("Email"));
                tablas.add(tabla);
            }

            resultSet.close();
            statement.close();
            connection.close();

            request.setAttribute("tablas", tablas);
            request.getRequestDispatcher("mostrarDatos.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
