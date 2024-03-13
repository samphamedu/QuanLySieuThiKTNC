package com.supermarket.UTILS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcHelper {

    static String driver = "com.microsoft.sqlserver.SQLServerDriver";
    static String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=QUAN_LY_SIEU_THI_G5";
    static String user = "sa";
    static String pass = "songlong";

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            e.toString();
        }
    }

    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, user, pass);
        PreparedStatement stmt;
        if (sql.trim().startsWith("")) {
            stmt = conn.prepareCall(sql);
        } else {
            stmt = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }

    public static ResultSet query(String sql, Object... args) throws SQLException {
        try {
            PreparedStatement stmt = getStmt(sql, args);
            return stmt.executeQuery();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = query(sql, args);
            if (rs.next()) {
                return rs.getObject(1);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static int update(String sql, Object... args) {
        try {
            PreparedStatement stmt = getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
