package tables;

public class Ticker extends AbstractTable {
  static {
    addChildClasses(0, Ticker.class);

  }

  public Ticker() {
    tableNameOracle = "TICKER";
    tableNamePostgres = "TICKER".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("BBG_TICKER", "BBG_TICKER".toLowerCase());
    fields.put("WM_TICKER", "WM_TICKER".toLowerCase());
    fields.put("NABS_MARKET_DATA_OBJECT", "NABS_MARKET_DATA_OBJECT".toLowerCase());
  }
}