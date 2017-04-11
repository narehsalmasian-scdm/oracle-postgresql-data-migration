package tables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class AbstractTable {
  // map transfer order to list of classes(in the same level)
  protected static Map<Integer, List<Class<? extends AbstractTable>>> childClasses =
      new HashMap<Integer, List<Class<? extends AbstractTable>>>();

  static {
    try {
//      Class.forName("tables.CallShedule");
//      Class.forName("tables.SecurityInfo");

      Class.forName("tables.BacHisResults");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  // map oracle field to postgres field
  protected Map<String, String> fields = new HashMap<String, String>();
  protected String tableNameOracle;
  protected String tableNamePostgres;
  protected String tableCreaterQuery;
  protected static Set<AbstractTable> failedTableCreation =
      new HashSet<AbstractTable>();


  public static void addFailedTables(AbstractTable table) {

    failedTableCreation.add(table);
  }

  public String getTableNameOracle() {
    return tableNameOracle;
  }

  public String getTableNamePostgres() {
    return tableNamePostgres;
  }

  public String getTableCreaterQuery() {

    return this.tableCreaterQuery;
  }

  public Map<String, String> getFields() {
    return fields;
  }

  public Set<String> getOracleFields() {
    return fields.keySet();
  }

  public String getPostgresField(String oracleField) {
    return fields.get(oracleField);
  }

  public static Map<Integer, List<Class<? extends AbstractTable>>>
      getChildClasses() {
    return childClasses;
  }

  protected static void addChildClasses(Integer index,
      Class<? extends AbstractTable> clazz) {
    if (childClasses.get(index) == null) {
      List<Class<? extends AbstractTable>> classesList =
          new ArrayList<Class<? extends AbstractTable>>();
      classesList.add(clazz);
      childClasses.put(index, classesList);
    } else {
      childClasses.get(index).add(clazz);
    }
  }

}