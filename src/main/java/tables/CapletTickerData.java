package tables;

public class CapletTickerData extends AbstractTable {

  static {
    addChildClasses(0, CapletTickerData.class);
  }

  public CapletTickerData() {
    tableNameOracle = "CAPLET_TICKER_DATA";
    tableNamePostgres = "CAPLET_TICKER_DATA".toLowerCase();

    fields.put("TICKER", "TICKER".toLowerCase());
    fields.put("PX_BID", "PX_BID".toLowerCase());
    fields.put("PX_ASK", "PX_ASK".toLowerCase());
    fields.put("LAST_UPDATE", "LAST_UPDATE".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());

  }
}