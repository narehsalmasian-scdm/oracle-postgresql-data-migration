package tables;

public class SwaptionTickerData extends AbstractTable {
  static {
    addChildClasses(0, SwaptionTickerData.class);

  }

  public SwaptionTickerData() {
    tableNameOracle = "SWAPTION_TICKER_DATA";
    tableNamePostgres = "SWAPTION_TICKER_DATA".toLowerCase();
    
    fields.put("TICKER", "TICKER".toLowerCase());
    fields.put("PX_BID", "PX_BID".toLowerCase());
    fields.put("PX_ASK", "PX_ASK".toLowerCase());
    fields.put("LAST_UPDATE", "LAST_UPDATE".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("SYMBOL", "SYMBOL".toLowerCase());
    fields.put("MONEYNESS", "MONEYNESS".toLowerCase());
    fields.put("WEIGHT", "WEIGHT".toLowerCase());
  }
}