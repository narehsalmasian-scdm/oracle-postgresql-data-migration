package tables;

public class IndexToBbgTicker extends AbstractTable {

  static {

    addChildClasses(1, IndexToBbgTicker.class);
  }

  public IndexToBbgTicker() {
    tableNameOracle = "INDEX_TO_BBG_TICKER";
    tableNamePostgres = "index_to_bbg_ticker";
    
    tableCreaterQuery = "CREATE TABLE" + "public.index_to_bbg_ticker" + "(" +
        "   index_name character varying," +
        "    bbg_ticker_name character varying NOT NULL," +
        "   index_core_version double precision NOT NULL," +
        "    is_active character varying," +
        "    created_date timestamp without time zone," +
        "  created_by character varying," +
        " CONSTRAINT index_to_bbg_ticker_pkey PRIMARY KEY (index_core_version, bbg_ticker_name)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.index_to_bbg_ticker OWNER TO postgres;" + ";";
  
  fields.put("INDEX_NAME", "INDEX_NAME".toLowerCase());
  fields.put("BBG_TICKER_NAME", "BBG_TICKER_NAME".toLowerCase());
  fields.put("INDEX_CORE_VERSION", "INDEX_CORE_VERSION".toLowerCase());
  fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
  fields.put("CREATED_DATE", "CREATED_DATE".toLowerCase());
  fields.put("CREATED_BY", "CREATED_BY".toLowerCase());
  


}
}