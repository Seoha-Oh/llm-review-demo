package demo;

import java.sql.*;

public class Example2 {

    private final Connection conn;

    public SqlInjectionExample(Connection conn) {
        this.conn = conn;
    }

    public ResultSet f1(String username) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = '" + username + "'";
        Statement stmt = conn.createStatement();
        return stmt.executeQuery(sql);
    }

    public ResultSet f2(String username) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, username);
        return ps.executeQuery();
    }
}
