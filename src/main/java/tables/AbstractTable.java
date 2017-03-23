package tables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class AbstractTable {
  // map oracle field to postgres field
  protected static Map<String, String> fields = new HashMap<String, String>();
  protected static String tableNameOracle;
  protected static String tableNamePostgres;

  // map transfer order to list of classes(in the same level)
  protected static Map<Integer, List<Class<? extends AbstractTable>>> childClasses =
      new HashMap<Integer, List<Class<? extends AbstractTable>>>();

  public static String getTableNameOracle() {
    return tableNameOracle;
  }

  public static String getTableNamePostgres() {
    return tableNamePostgres;
  }

  public static Map<String, String> getFields() {
    return fields;
  }

  public static Set<String> getOracleFields() {
    return fields.keySet();
  }

  public static String getPostgresField(String oracleField) {
    return fields.get(oracleField);
  }

  public static Map<Integer, List<Class<? extends AbstractTable>>>
      getChildClasses() {
    return childClasses;
  }

  protected static void addChildClasses(Integer index,
      Class<? extends AbstractTable> clazz) {
    if (childClasses.get(index) == null) {
      List<Class<? extends AbstractTable>> classesList = new ArrayList<Class<? extends AbstractTable>>();
      classesList.add(clazz);
      childClasses.put(index, classesList);
    }
    else
    {
      childClasses.get(index).add(clazz);
    }
  }

}