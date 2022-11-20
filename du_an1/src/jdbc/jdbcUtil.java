/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Phuong
 */
public class jdbcUtil {
    private static Connection conn;

    public static Connection getConnection() {
        if (jdbcUtil.conn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser = "sa", dbPass = "123456",
                        dbUrl = "jdbc:sqlserver://localhost:1433;"
                        + "databaseName=QuanLyCuaHangTraChanh"
                        + ";encrypt=true;trustServerCertificate=true;";

                conn = DriverManager
                        .getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Kết nối thành công");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return jdbcUtil.conn;
    }
}
