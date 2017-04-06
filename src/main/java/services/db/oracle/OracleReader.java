package services.db.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import oracle.sql.TIMESTAMP;
import tables.AbstractTable;
import tables.SecurityInfo;
import utils.TypeConverter;

public abstract class OracleReader {
  private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
  private static final String DB_CONNECTION = "jdbc:oracle:thin:@bundesbank-taron1.crelgvfd3i9x.eu-central-1.rds.amazonaws.com:1521:NABS";
  private static final String DB_USER = "CEPHNABS1";
  private static final String DB_PASSWORD = "nabs";

  private static Connection dbConnection = null;
  final static Logger logger = Logger.getLogger(OracleReader.class);
  static {
    dbConnection = getDBConnection();
  }
  
  //TODO : remove this
  public static Set<String> types = new HashSet<String>();

  public static List<Map<String, Object>> read(AbstractTable tableData) throws Exception {
    List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
    

    String fields = "";

    Set<String> oracleFields = tableData.getOracleFields();
    for (String field : oracleFields) {
      fields = fields + ", " + field;
    }
    fields = fields.replaceFirst(",", "");
    if (fields.isEmpty()) {
      return rows;
    }

    logger.info("Reading data for " + tableData.getTableNameOracle());
    String selectTableSQLCount = "SELECT COUNT(*) AS CC" + " from " + tableData.getTableNameOracle();
    Statement statement = dbConnection.createStatement();
    ResultSet rscount = statement.executeQuery(selectTableSQLCount);
    rscount.next();
    int countt = rscount.getInt("CC");
    logger.info("Reading " + countt + " from table " + tableData.getTableNameOracle());

    String selectTableSQL =
        "SELECT " + fields + " from " + tableData.getTableNameOracle();

    statement = dbConnection.createStatement();
    try {

//      System.out.println(selectTableSQL);

      // execute select SQL stetement
      ResultSet rs = statement.executeQuery(selectTableSQL);
      // TODO delete count checking after test
      int count = 3;
      if (tableData instanceof SecurityInfo) {
        count = 100000;
      }

      while (rs.next() && count-- != 0) {
        if(rs.getRow() % 1000 == 0){
          logger.info("Reading row " + rs.getRow() + " from table ");
        }
        Map<String, Object> row = new HashMap<String, Object>();
        for (String field : oracleFields) {
          Object value = rs.getObject(field);
          row.put(field, TypeConverter.convert(value));
        }
       
        if (!row.isEmpty()) {
          rows.add(row);
        }

      }

    } catch (SQLException e) {

      e.printStackTrace();

    } finally {

      if (statement != null) {
        statement.close();
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
