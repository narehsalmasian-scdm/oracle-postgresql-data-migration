package tables;

public class IndexCurve  extends AbstractTable {

  static {

    addChildClasses(1, IndexCurve.class);
  }

  public IndexCurve() {
    tableNameOracle = "INDEX_CURVE";
    tableNamePostgres = "index_curve";
    
    tableCreaterQuery = "CREATE TABLE" + "public.index_curve" + "(" +
        "  id character varying NOT NULL," +
        "  index_curve_name character varying," +
        "  type character varying," +
        " forwards_type character varying," +
        "  forwards_fixing_type character varying," +
        "  forwards_fixing_lag character varying," +
        "  forwards_ticker character varying," +
        "  forwards_ticker_lag double precision," +
        " bloomberg_name character varying,"+
        " CONSTRAINT index_curve_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.index_curve OWNER TO postgres;" + ";";
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("INDEX_CURVE_NAME", "INDEX_CURVE_NAME".toLowerCase());
  fields.put("TYPE", "TYPE".toLowerCase());
  fields.put("FORWARDS_TYPE", "FORWARDS_TYPE".toLowerCase());
  fields.put("FORWARDS_FIXING_TYPE", "FORWARDS_FIXING_TYPE".toLowerCase());
  fields.put("FORWARDS_FIXING_LAG", "FORWARDS_FIXING_LAG".toLowerCase());
  fields.put("FORWARDS_TICKER", "FORWARDS_TICKER".toLowerCase());
  fields.put("FORWARDS_TICKER_LAG", "FORWARDS_TICKER_LAG".toLowerCase());
  fields.put("BLOOMBERG_NAME", "BLOOMBERG_NAME".toLowerCase());


}
}