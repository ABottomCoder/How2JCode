package Intermediate.chapter7;

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args){
        Connection c = null;
        Statement s = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.
                    getConnection(
                            "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                            "root", "Rootdenglu11*"
                    );

            s = c.createStatement();
            String sql = "insert into hero values(null, "+" 'Garen' "+", "+515.0f+","+67+")";
            s.executeUpdate(sql);


            System.out.println("insert success !!!");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(s != null)
                try{
                    s.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }

            if(c != null){
                try{
                    c.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
