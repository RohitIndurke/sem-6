import java.sql.*;
import java.util.*;

class dbUser {

    public static void main(String args[]) {
        Connection con = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet res = null;
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(
                "jdbc:postgresql:pe",
                "postgres",
                "1234"
            );
            System.out.println("Connction Done");

            System.out.println("Enter roll no");
            int roll_no = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name");
            String s_name = sc.nextLine();

            System.out.println("Enter class");
            String s_class = sc.nextLine();

            String create =
                ("insert into student(roll_no,name,class) values(?,?,?)");
            pstmt = con.prepareStatement(create);

            pstmt.setInt(1, roll_no);
            pstmt.setString(2, s_name);
            pstmt.setString(3, s_class);

            pstmt.executeUpdate();
            stmt = con.createStatement();
            res = stmt.executeQuery("select * from student");
            while (res.next()) {
                System.out.println(res.getInt("roll_no"));
                System.out.println(res.getString("name"));
                System.out.println(res.getString("class"));
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
