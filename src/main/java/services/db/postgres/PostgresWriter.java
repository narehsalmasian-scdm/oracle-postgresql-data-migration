package services.db.postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import tables.AbstractTable;

public abstract class PostgresWriter {
  final static Logger logger = Logger.getLogger(PostgresWriter.class);

  private static Connection connection = null;

  private static boolean exist(AbstractTable table) {
    try {
      String existingQuery =
          "SELECT 1 FROM " + table.getTableNamePostgres();
      PreparedStatement pst = connection.prepareStatement(existingQuery);
      pst.execute();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public static void openConnection() {
    try {
      logger.info("PostgreSQL JDBC Driver Registered!");
      System.out.println("PostgreSQL JDBC Driver Registered!");
      connection = DriverManager.getConnection(
          "jdbc:postgresql://localhost/Test", "postgres", "nareh");

      // Class.forName("org.postgresql.Driver");

    } catch (SQLException e) {
      logger.info("Connection Failed! Check output console");
      System.out.println("Connection Failed! Check output console");
      e.printStackTrace();

    }
  }

  public static boolean createTable(AbstractTable table, boolean overrideIfExists) {
    try {
      String tableQuery = table.getTableCreaterQuery();
      boolean tableExists = exist(table);
      if (!tableExists) {
        PreparedStatement pst = connection.prepareStatement(tableQuery);
        return pst.execute();
      } else if(overrideIfExists){
        String drop = " DROP TABLE " + table.getTableNamePostgres();
        PreparedStatement pst = connection.prepareStatement(drop);
        pst.execute();
        pst = connection.prepareStatement(tableQuery);
        return pst.execute();
      } else {
        return true;
      }
    } catch (Exception e) {
      logger.info("Failed to create table in postgresql");
    }
    return false;

  }

  public static void closeConnection() {
    if (connection != null) {
      try {
        connection.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

  public static void write(List<Map<String, Object>> data,
      AbstractTable tableData) throws Exception {
    logger.info("Write proccess starting");
    for (Map<String, Object> row : data) {
      logger.info("Inserting to table (write function)");
      String statment = "INSERT INTO " + tableData.getTableNamePostgres() + "(";
      String keys = "";
      String valuesParameter = "";
      List values = new ArrayList<Object>();

      for (String field : row.keySet()) {
        keys = keys + "," + tableData.getPostgresField(field);
        valuesParameter = valuesParameter + ",?";
        values.add(row.get(field));
      }
      keys = keys.replaceFirst(",", "");
      valuesParameter = valuesParameter.replaceFirst(",", "");
      statment = statment + keys + ")VALUES (" + valuesParameter + ")";
      PreparedStatement pst = connection.prepareStatement(statment);
      for (int i = 0; i < values.size(); i++) {
        try {
          pst.setObject(i + 1, values.get(i));
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
      pst.executeUpdate();
    }

  }

}
