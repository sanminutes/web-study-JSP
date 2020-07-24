import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnect {
   public static void main(String[] args) {
      String driver = "oracle.jdbc.driver.OracleDriver";
      String url = "jdbc:oracle:thin:@localhost:1521:orcl";
      String user = "kosea";
      String password = "kosea2019a";
      
      try {
         Class.forName(driver);
         System.out.println("jdbc driver loading success.");
         Connection conn = DriverManager.getConnection(url, user, password);
         System.out.println("oracle connection success.");
         System.out.println();
         
         Statement stmt = conn.createStatement();
         
         String sql = "SELECT * FROM dept";
         ResultSet rs = stmt.executeQuery(sql);
         while(rs.next()) {
            System.out.print(rs.getString("deptno") + " ");
            System.out.print(rs.getString("dname") + " ");
            System.out.print(rs.getString("loc")+ " ");
            System.out.println();
         }
      }
      catch (ClassNotFoundException e) {
         System.out.println("jdbc driver loading fail.");
      }catch (SQLException e) {
         System.out.println("oracle connetion fail.");
      }
   }

}