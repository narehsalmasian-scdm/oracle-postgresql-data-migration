package tables;

public class IndexDataTest extends AbstractTable {

  static {

    addChildClasses(1, IndexDataTest.class);
  }

  public IndexDataTest() {
    tableNameOracle = "INDEX_DATA_TEST";
    tableNamePostgres = "index_data_test";
  
  fields.put("INDEX_NAME", "INDEX_NAME".toLowerCase());
  fields.put("PX_BID", "PX_BID".toLowerCase());
  fields.put("PX_ASK", "PX_ASK".toLowerCase());
  fields.put("LAST_UPDATE", "LAST_UPDATE".toLowerCase());
  fields.put("INDEX_CORE_VERSION", "INDEX_CORE_VERSION".toLowerCase());
  fields.put("ERROR_CODE", "ERROR_CODE".toLowerCase());
  fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
  fields.put("CREATED_DATE", "CREATED_DATE".toLowerCase());
  fields.put("IS_IL", "IS_IL".toLowerCase());


}
}