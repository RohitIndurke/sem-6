import java.sql.*;

public class slip2_1 {

    public static void main(String args[]) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement ps;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/pe",
                "postgres",
                "12345678"
            );
            if (con == null) {
                System.out.println("Connection fail");
            } else {
                System.out.println("Connection done");
                ps = con.prepareStatement("Select * from student");
                rs = ps.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);

                    System.out.println(
                        "here is id \n" + id + "here is name \n" + name
                    );
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
