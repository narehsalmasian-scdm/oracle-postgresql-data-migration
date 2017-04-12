package tables;

public class SwaptionTickers extends AbstractTable {
  static {
    addChildClasses(0, SwaptionTickers.class);

  }

  public SwaptionTickers() {
    tableNameOracle = "SWAPTION_TICKERS";
    tableNamePostgres = "SWAPTION_TICKERS".toLowerCase();
    
    fields.put("SWAPTION_NAME", "SWAPTION_NAME".toLowerCase());
    fields.put("EXPIRY", "EXPIRY".toLowerCase());
    fields.put("TENOR", "TENOR".toLowerCase());
    fields.put("TICKER_NAME", "TICKER_NAME".toLowerCase());
    fields.put("TICKER_SOURCE", "TICKER_SOURCE".toLowerCase());
    fields.put("TICKER_GROUP", "TICKER_GROUP".toLowerCase());
  }
}
