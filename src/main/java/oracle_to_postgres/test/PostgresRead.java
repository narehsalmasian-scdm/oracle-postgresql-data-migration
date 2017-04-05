package oracle_to_postgres.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;

import tables.AbstractTable;

public class PostgresRead {

  public static Map<String, Object> read(AbstractTable tableData, Object id)
      throws Exception {
    Connection c = null;
    Statement stmt = null;

    Map<String, Object> result = new HashMap<String, Object>();
    
    try {
// Class.forName("org.postgresql.Driver");
      c = DriverManager
          .getConnection("jdbc:postgresql://localhost/Test", "postgres",
              "nareh");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

      stmt = c.createStatement();
      String queryString = "select * from call_schedule where id='" + id + "';";
      System.out.println(queryString);
      ResultSet rs = stmt.executeQuery(queryString);
      while (rs.next()) {
        String securityid = rs.getString("security_id");
        
        Timestamp calldate = rs.getTimestamp("call_date");
        System.out.println(calldate);
        System.out.println(calldate.getTime());
        
        
        
        String calltype = rs.getString("call_type");
        Double strike = rs.getDouble("strike");
        Double securityversion = rs.getDouble("security_version");
        String isactive = rs.getString("is_active");

        result.put("security_id", securityid);
        result.put("call_date",calldate );
        result.put("call_type",calltype );
        result.put("strike",strike );
        result.put("security_version", securityversion);
        result.put("is_active", isactive);
    

        break;
      }
      
   
      rs.close();
      stmt.close();
      c.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Operation done successfully");

    return result;
  }

}
