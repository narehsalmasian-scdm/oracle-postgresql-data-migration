package oracle_to_postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tables.AbstractTable;

public abstract class Read {
  private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
  private static final String DB_CONNECTION =
      "jdbc:oracle:thin:@bundesbank-tigran.crelgvfd3i9x.eu-central-1.rds.amazonaws.com:1521:NABS";
  private static final String DB_USER = "CEPHNABS1";
  private static final String DB_PASSWORD = "nabs";

  private static Connection dbConnection = null;
  static {
    dbConnection = getDBConnection();
  }
  
  
  public static List<Map<String, Object>> read(AbstractTable tableData) throws Exception{
    List<Map<String, Object>> rows = new ArrayList<Map<String,Object>>();
    

    String fields = "";
    
    Set<String> oracleFields = tableData.getOracleFields();
    for(String field : oracleFields){
      fields = fields + ", " + field;
    }
    fields = fields.replaceFirst(",", "");
    if(fields.isEmpty()){
      return rows;
    }
    
    String selectTableSQL = "SELECT " + fields + " from " + tableData.getTableNameOracle();

    System.out.println(selectTableSQL);
    Statement statement = dbConnection.createStatement();
    try {
      

      System.out.println(selectTableSQL);

      // execute select SQL stetement
      ResultSet rs = statement.executeQuery(selectTableSQL);
      // TODO delete count checking after test
      int count = 3;
      
      while (rs.next() && count-- != 0) {
        
        Map<String, Object> row = new HashMap<String, Object>();        
        for(String field : oracleFields){
          row.put(field, rs.getObject(field));
        }
        
        if(!row.isEmpty()){
          rows.add(row);
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
