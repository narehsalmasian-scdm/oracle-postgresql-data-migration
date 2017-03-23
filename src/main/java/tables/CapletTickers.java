package tables;


public class CapletTickers extends AbstractTable {
  static {
    tableNameOracle = "CAPLET_TICKERS";
    tableNamePostgres = "caplet_tickers";

    fields.put("CAPLET_NAME", "CAPLET_NAME".toLowerCase());
    fields.put("STRIKE", "STRIKE".toLowerCase());
    fields.put("EXPIRY", "EXPIRY".toLowerCase());
    fields.put("TICKER_NAME", "TICKER_NAME".toLowerCase());
    fields.put("TICKER_SOURCE", "TICKER_SOURCE".toLowerCase());
    fields.put("TICKER_GROUP", "TICKER_GROUP".toLowerCase());

  }

}
