package tables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AbstractTable {
  // map oracle field to postgres field
  protected static Map<String, String> fields = new HashMap<String, String>();
  protected static String tableNameOracle;
  protected static String tableNamePostgres;

  public static String getTableNameOracle() {
    return tableNameOracle;
  }

  public static String getTableNamePostgres() {
    return tableNamePostgres;
  }

  public static Map<String, String> getFields() {
    return fields;
  }
  
  public static Set<String> getOracleFields(){
    return fields.keySet();
  }
  
  public static String getPostgresField(String oracleField){
    return fields.get(oracleField);
  }
}
