package tables;

public class WmTicker extends AbstractTable {
  static {
    addChildClasses(0, WmTicker.class);

  }

  public WmTicker() {
    tableNameOracle = "WM_TICKER";
    tableNamePostgres = "WM_TICKER".toLowerCase();
    
    fields.put("WM_TICKER", "WM_TICKER".toLowerCase());
    fields.put("RESOLVED", "RESOLVED".toLowerCase());
  }
}