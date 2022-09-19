package kg.megacom.messageapp.dao.impl;

import kg.megacom.messageapp.dao.ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDBImpl implements ConnectionDB {
    @Override
    public Connection getConnection() throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/admin/OneDrive/Рабочий стол/sub-msg.db");
        return connection;
    }
    @Override
    public void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
