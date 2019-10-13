package aniket.creational.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionPool extends ObjectPool<Connection> {

    public String host;
    public String username;
    public String password;

    public JDBCConnectionPool(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }

    @Override
    Connection create() {
        try {
            return DriverManager.getConnection(host, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    boolean validate(Connection obj) {
        try {
            return !obj.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    void destroy(Connection obj) {
        try {
            obj.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
