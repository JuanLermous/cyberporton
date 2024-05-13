package com.mycompany.cyberporton1_0.Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
    //NOTA: cambiar los datos con el nombre y conexiones de sus bases de datos
    // probablemente sea esta :
    //private static final String URL = "jdbc:mysql://localhost:3306/cyberporton";

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/cyberporton";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
