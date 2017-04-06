package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PostGreSqlWriter {
  public void write(List<Map<String, Object>> data) {

    System.out.println("-------- PostgreSQL "
        + "JDBC Connection Testing ------------");

    try {

      Class.forName("org.postgresql.Driver");

    } catch (ClassNotFoundException e) {

      System.out.println("Where is your PostgreSQL JDBC Driver? "
          + "Include in your library path!");
      e.printStackTrace();
      return;

    }

    System.out.println("PostgreSQL JDBC Driver Registered!");

    Connection connection = null;

    try {

      connection = DriverManager.getConnection(
          "jdbc:postgresql://localhost/Test", "postgres", "nareh");

    } catch (SQLException e) {

      System.out.println("Connection Failed! Check output console");
      e.printStackTrace();
      return;

    }

    
    if (connection != null) {
      try {
        for (Map<String, Object> row : data) {
          String statment = "INSERT INTO  adjust_mo(";
          String keys = "";
          String valuesParameter = "";
          List values = new ArrayList<Object>();

          for (String key : row.keySet()) {
            keys = keys + "," + key.toLowerCase();
            valuesParameter = valuesParameter + ",?";
            values.add(row.get(key));
          }
          
          
          valuesParameter = valuesParameter.replaceFirst(",", "");
          keys = keys.replaceFirst(",", "");
          statment = statment + keys + ")VALUES(" + valuesParameter + ")";
          System.out.println(statment);
          PreparedStatement pst = connection.prepareStatement(statment);
          System.out.println(values.size());
          for (int i = 0; i < values.size(); i++) {
            pst.setObject(i + 1, values.get(i));
          }
          pst.executeUpdate();
        }

      } catch (Exception e) {
        e.printStackTrace();
      }
    } else {
      System.out.println("Failed to make connection!");
    }

    if (connection != null) {
      try {
        connection.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
