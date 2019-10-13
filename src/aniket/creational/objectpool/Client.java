package aniket.creational.objectpool;

import java.sql.Connection;

public class Client {
    public static void main(String[] args) {
        JDBCConnectionPool pool = new JDBCConnectionPool("host", "username", "password");
        Connection connection = pool.getObject(); //get and acquire connection object from pool

        pool.release(connection); // release the connection resource
    }
}
