package tables;

public class CapletTickers extends AbstractTable {
  static {

    addChildClasses(1, CapletTickers.class);
  }

  public CapletTickers() {
    tableNameOracle = "CAPLET_TICKERS";
    tableNamePostgres = "caplet_tickers";
    
    tableCreaterQuery = "CREATE TABLE" + "public.caplet_tickers" + "(" +
        " caplet_name character varying," +
        "strike character varying," +
        " expiry character varying," +
        "  ticker_name character varying," +
        "  ticker_source character varying," +
        " ticker_group character varying" +
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.caplet_tickers OWNER TO postgres;" + ";";

    fields.put("CAPLET_NAME", "CAPLET_NAME".toLowerCase());
    fields.put("STRIKE", "STRIKE".toLowerCase());
    fields.put("EXPIRY", "EXPIRY".toLowerCase());
    fields.put("TICKER_NAME", "TICKER_NAME".toLowerCase());
    fields.put("TICKER_SOURCE", "TICKER_SOURCE".toLowerCase());
    fields.put("TICKER_GROUP", "TICKER_GROUP".toLowerCase());
  }

}
