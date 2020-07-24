import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleInsert {
   public static void main(String[] args) {
      String driver = "oracle.jdbc.driver.OracleDriver";
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "kosea";
      String password = "kosea2019a";
      
      try {
         Class.forName(driver);
         System.out.println("jdbc driver loading success.");
         Connection conn = DriverManager.getConnection(url, user, password);
         System.out.println("oracle connection successn");
         
         Statement stmt = conn.createStatement();
         
         String sql = "SELECT * FROM dept";
         ResultSet rs = stmt.executeQuery(sql);
         while(rs.next())
            System.out.println(rs.getString("deptno") + " ");
            System.out.println(rs.getString("dname") + " ");
            System.out.println(rs.getString("loc")+ " ");
      }
      catch (ClassNotFoundException e) {
         System.out.println("jdbc driver loading fail.");
      }catch (SQLException e) {
         System.out.println("oracle connetion fail.");
      }
   }

}