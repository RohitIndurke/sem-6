// JDBC SAMPLE (simplified)
import java.sql.*;

public class ques2 {
    public static void main(String[] args) throws Exception {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
        Statement st=con.createStatement();

        st.executeUpdate("insert into product values(1,'Pen',10)");
        ResultSet rs=st.executeQuery("select * from product");

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
    }
}
