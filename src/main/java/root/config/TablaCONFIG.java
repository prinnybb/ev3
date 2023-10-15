package root.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TablaCONFIG {

    public Connection getConnection() throws SQLException {
        String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=CIISA;user=sa;password=admin123";
        return DriverManager.getConnection(jdbcUrl);
    }
}