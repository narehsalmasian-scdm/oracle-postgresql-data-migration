package oracle_to_postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class OracleSqlReader {
  private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
  private static final String DB_CONNECTION =
      "jdbc:oracle:thin:@bundesbank-tigran.crelgvfd3i9x.eu-central-1.rds.amazonaws.com:1521:NABS";
  private static final String DB_USER = "CEPHNABS1";
  private static final String DB_PASSWORD = "nabs";

  public List<Map<String, Object>> selectRecordsFromDbUserTable() throws SQLException {

    List<Map<String, Object>> rows = new ArrayList<Map<String,Object>>();
    
    Connection dbConnection = null;
    Statement statement = null;

    String selectTableSQL = "SELECT ID, PAYMENT_DATE, INTEREST,PRINCIPAL,CAP,FLOOR,CALLABLE,MAKE_WHOLE_CALL, PUTABLE,EXTENDIBLE,EXTENDIBLE_BY_DEFAULT,SINKABLE, AMORTIZING,INFLATION,FUNGIBLE,LEG_ID from ADJUST_MO";

    try {
      dbConnection = getDBConnection();
      statement = dbConnection.createStatement();

      System.out.println(selectTableSQL);

      // execute select SQL stetement
      ResultSet rs = statement.executeQuery(selectTableSQL);
      int count = 3;
      
      while (rs.next() && count-- != 0) {
        
        Map<String, Object> row = new HashMap<String, Object>();
        rows.add(row);
        Integer ID = rs.getInt("ID");
        Date date = rs.getDate("PAYMENT_DATE");
        String interest = rs.getString("INTEREST");
        Double principal = rs.getDouble("PRINCIPAL");
        Double cap = rs.getDouble("CAP");
        Double floor = rs.getDouble("FLOOR");
        Double callable = rs.getDouble("CALLABLE");
        Double makeWholeCall = rs.getDouble("MAKE_WHOLE_CALL");
        Double putable = rs.getDouble("PUTABLE");
        Double extendible = rs.getDouble("EXTENDIBLE");
        Double extendibleByDefault = rs.getDouble("EXTENDIBLE_BY_DEFAULT");
        Double sinkable = rs.getDouble("SINKABLE");
        Double amortizing = rs.getDouble("AMORTIZING");
        Double inflation = rs.getDouble("INFLATION");
        Double fungible = rs.getDouble("FUNGIBLE");
        String legId = rs.getString("LEG_ID");
        row.put("ID", ID);
        row.put("PAYMENT_DATE", date);
        row.put("INTEREST", interest);
        row.put("PRINCIPAL", principal);
        row.put("CAP", cap);
        row.put("FLOOR", floor);
        row.put("CALLABLE", callable);
        row.put("MAKE_WHOLE_CALL", makeWholeCall);
        row.put("PUTABLE", putable);
        row.put("EXTENDIBLE", extendible);
        row.put("EXTENDIBLE_BY_DEFAULT", extendibleByDefault);
        row.put("SINKABLE", sinkable);
        row.put("AMORTIZING", amortizing);
        row.put("INFLATION",inflation);
        row.put("FUNGIBLE", fungible);
        row.put("LEG_ID", legId);
        
        for(Entry<String, Object> cell : row.entrySet()){
         System.out.println(cell.getValue()); 
        
        }
      }

    } catch (SQLException e) {

      e.printStackTrace();

    } finally {

      if (statement != null) {
        statement.close();
      }

      if (dbConnection != null) {
        dbConnection.close();
      }

    }

    return rows;
    
  }

  private static Connection getDBConnection() {

    Connection dbConnection = null;

    try {

      Class.forName(DB_DRIVER);

    } catch (ClassNotFoundException e) {

      System.out.println(e.getMessage());

    }

    try {

      dbConnection =
          DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
      return dbConnection;

    } catch (SQLException e) {

      System.out.println(e.getMessage());

    }

    return dbConnection;

  }

}
