import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectDB {
    public static void main(String[] args) {
        try {
    
            String url = "jdbc:mysql://localhost:3306/testdb";
            String user = "root";
            String password = "1234"; 

            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected Successfully!");

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO student VALUES(2,'Sai')");
            System.out.println("Record Inserted");

            st.executeUpdate("UPDATE student SET name='Ravi' WHERE id=2");
            System.out.println("Record Updated");

            st.executeUpdate("DELETE FROM student WHERE id=1");
            System.out.println("Record Deleted");


            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}