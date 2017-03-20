package tables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class AbstractTable {
  // map oracle field to postgres field
  protected static Map<String, String> fields = new HashMap<String, String>();
  protected static String tableNameOracle;
  protected static String tableNamePostgres;
  
  protected static Set<Class<? extends AbstractTable>> childClasses = new HashSet<Class<? extends AbstractTable>>();

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

  public abstract Integer getOrder();
  
  public static List<Class<? extends AbstractTable>> getChildClasses(){
    Map<Integer, List<Class<? extends AbstractTable>>> allTables = new HashMap<Integer, List<Class<? extends AbstractTable>>>();
    
    for(Class<? extends AbstractTable> table : childClasses){
      List<Class<? extends AbstractTable>> indexList = allTables.get(table.getOr)
    }
    
    return allTables;
  }
 
}
