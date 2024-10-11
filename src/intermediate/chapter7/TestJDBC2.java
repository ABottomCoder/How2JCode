package Intermediate.chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                Connection c = DriverManager.
                        getConnection(
                                "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                                "root", "Rootdenglu11*"
                        );
                Statement s = c.createStatement();
        ) {
            String sql = "delete from hero where id = 5";
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
