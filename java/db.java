import java.sql.*;

class db {

    public static void main(String args[]) {
        Connection con = null;
        Statement stmt = null;
        ResultSet res = null;

        try {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(
                "jdbc:postgresql:pe",
                "postgres",
                "1234"
            );
            System.out.println("Connction Done");

            stmt = con.createStatement();

            String create =
                ("create table student(roll_no int primary key,name varchar(20),class varchar(20));");
            stmt.executeUpdate(create);
            stmt.executeUpdate(
                "insert into student values(1,'rohit','TYBSC');"
            );
            stmt.executeUpdate(
                "insert into student values(2,'atharv','SYBSC');"
            );
            stmt.executeUpdate(
                "insert into student values(3,'vedant','FYBSC');"
            );

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
