import java.sql.*;

class slip2_1 {

    public static void main(String args[]) {
        Connection con = null;
        ResultSet res = null;
        Statement st = null;

        try {
            Class.forName("org:postgresql:Driver");
            con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/pe",
                "postgres",
                "12345678"
            );

            st = con.createStatement();
            System.out.print("\nconnection done\n");
        } catch (Exception e) {
            System.out.print("\nconnection fail\n" + e);
        }
    }
}
