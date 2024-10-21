package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoNew {
    private static final String URL ="jdbc:mysql://localhost:3306/caro"; // sửa lại tên của csdl
    private static final String USER ="root";// mặc định của mysql
    private static final String PASS ="123456";// do cài đặt khi cài đặt mysql
    public static Connection getConnectDB(){
        Connection connection = null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection= DriverManager.getConnection(URL,USER,PASS);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            System.exit(1);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//            System.exit(1);
//        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
//        return connection;
    }
}
