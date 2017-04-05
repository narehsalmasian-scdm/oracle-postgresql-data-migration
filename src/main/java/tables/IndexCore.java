package tables;

public class IndexCore extends AbstractTable {

  static {

    addChildClasses(1, IndexCore.class);
  }

  public IndexCore() {
    tableNameOracle = "INDEX_CORE";
    tableNamePostgres = "index_core";
  
  fields.put("INDEX_NAME", "INDEX_NAME".toLowerCase());
  fields.put("LEADING_TICKER", "LEADING_TICKER".toLowerCase());
  fields.put("VERSION", "VERSION".toLowerCase());
  fields.put("PACKAGE_NAME", "PACKAGE_NAME".toLowerCase());
  fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
  fields.put("CREATED_DATE", "CREATED_DATE".toLowerCase());
  fields.put("CREATED_BY", "CREATED_BY".toLowerCase());
  fields.put("PX", "PX".toLowerCase());

}
}