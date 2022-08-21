package jdbcexample.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionProvider {
    private static DBConnectionProvider provider = new DBConnectionProvider();
    private static String DB_URL = "jdbc:mysql://localhost:3306/user?autoReconnect=true&useSSL=false";
    private static String DB_USERNAME = "root";
    private static String DB_PASSWORD = "root";

    private DBConnectionProvider() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static DBConnectionProvider getProvider() {
        return provider;
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        return null;
    }

}