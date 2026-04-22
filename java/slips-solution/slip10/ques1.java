import java.sql.*;

public class ques1 {
    public static void main(String[] args) throws Exception {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
        Statement st=con.createStatement();

        ResultSet rs=st.executeQuery("select * from student limit 1");

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
    }
}
