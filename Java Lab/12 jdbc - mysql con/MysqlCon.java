import java.sql.*;
class MysqlCon {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java", "root", "root");
            Statement stmt = con.createStatement();
            String q1 = "SELECT * FROM test";
            ResultSet rs = stmt.executeQuery(q1);
            while (rs.next())
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
