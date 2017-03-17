package oracle_to_postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import tables.AbstractTable;

public abstract class Writer {

  private static Connection connection = null;

  
 public static void openConnection(){
   try {
     System.out.println("PostgreSQL JDBC Driver Registered!");
     connection = DriverManager.getConnection(
         "jdbc:postgresql://localhost/Test", "postgres", "nareh");

//Class.forName("org.postgresql.Driver");

   } catch (SQLException e) {

     System.out.println("Connection Failed! Check output console");
     e.printStackTrace();

   }
  }
 public static void closeConnection(){
   if (connection != null) {
     try {
       connection.close();
     } catch (SQLException e) {
       // TODO Auto-generated catch block
       e.printStackTrace();
     }
   }
 }
  public static void write(List<Map<String, Object>> data,AbstractTable tableData) throws Exception {
    for (Map<String, Object> row : data) {
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
      System.out.println(values.size());
      for (int i = 0; i < values.size(); i++) {
        pst.setObject(i + 1, values.get(i));
      }
      pst.executeUpdate();
      
      
      
      
      
          
    }
    
  }
  
}
