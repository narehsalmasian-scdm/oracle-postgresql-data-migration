package tables;

public class IndexToWmTicker extends AbstractTable {

  static {

    addChildClasses(1, IndexToWmTicker.class);
  }

  public IndexToWmTicker() {
    tableNameOracle = "INDEX_TO_WM_TICKER";
    tableNamePostgres = "index_to_wm_ticker";
  
  fields.put("INDEX_NAME", "INDEX_NAME".toLowerCase());
  fields.put("WM_TICKER_NAME", "WM_TICKER_NAME".toLowerCase());
  fields.put("INDEX_CORE_VERSION", "INDEX_CORE_VERSION".toLowerCase());
  fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
  fields.put("CREATED_DATE", "CREATED_DATE".toLowerCase());
  fields.put("CREATED_BY", "CREATED_BY".toLowerCase());
  


}
}