package tables;

public class IndexToBbgTicker extends AbstractTable {

  static {

    addChildClasses(1, IndexToBbgTicker.class);
  }

  public IndexToBbgTicker() {
    tableNameOracle = "INDEX_TO_BBG_TICKER";
    tableNamePostgres = "index_to_bbg_ticker";
  
  fields.put("INDEX_NAME", "INDEX_NAME".toLowerCase());
  fields.put("BBG_TICKER_NAME", "BBG_TICKER_NAME".toLowerCase());
  fields.put("INDEX_CORE_VERSION", "INDEX_CORE_VERSION".toLowerCase());
  fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
  fields.put("CREATED_DATE", "CREATED_DATE".toLowerCase());
  fields.put("CREATED_BY", "CREATED_BY".toLowerCase());
  


}
}