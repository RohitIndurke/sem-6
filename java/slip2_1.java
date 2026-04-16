import java.sql.*;

class slip2_1 {

    public static void main(String args[]) {
        Connection con = null;
        ResultSet res = null;
        Statement st = null;

        try {
            Class.forName("org:postgresql:Driver");
            con = DriverManager.getConnection(
                "jdbc:postgresql:pe2",
                "postgres",
                "1234"
            );

            stmt = con.createStatement();

            // 1. Create table
            String create =
                "CREATE TABLE IF NOT EXISTS PROJECT (" +
                "project_id INT PRIMARY KEY, " +
                "project_name VARCHAR(50), " +
                "project_description VARCHAR(100), " +
                "project_status VARCHAR(20))";
            stmt.executeUpdate(create);
            System.out.println("Table created successfully.");

            // 2. Insert records
            stmt.executeUpdate(
                "INSERT INTO PROJECT VALUES (1, 'Website', 'E-commerce site', 'Completed')"
            );
            stmt.executeUpdate(
                "INSERT INTO PROJECT VALUES (2, 'App', 'Android app', 'Ongoing')"
            );
            stmt.executeUpdate(
                "INSERT INTO PROJECT VALUES (3, 'System', 'Inventory system', 'Pending')"
            );

            System.out.println("Records inserted successfully.");

            // 3. Display records in tabular format
            rs = stmt.executeQuery("SELECT * FROM PROJECT");

            System.out.println("\nPROJECT TABLE:");
            System.out.println("ID\tName\t\tDescription\t\tStatus");
            System.out.println(
                "----------------------------------------------------------"
            );

            while (rs.next()) {
                System.out.println(
                    rs.getInt("project_id") +
                        "\t" +
                        rs.getString("project_name") +
                        "\t\t" +
                        rs.getString("project_description") +
                        "\t\t" +
                        rs.getString("project_status")
                );
            }

            // Close resources
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.print("\nconnection fail\n" + e);
        }
    }
}
