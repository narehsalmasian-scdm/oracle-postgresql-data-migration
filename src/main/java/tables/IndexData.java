package tables;

public class IndexData extends AbstractTable {

  static {

    addChildClasses(1, IndexData.class);
  }

  public IndexData() {
    tableNameOracle = "INDEX_DATA";
    tableNamePostgres = "index_data";
    
    tableCreaterQuery = "CREATE TABLE" + "public.index_data" + "(" +
        "  index_name character varying NOT NULL," +
        "  px_bid double precision," +
        "  px_ask double precision," +
        " last_update timestamp without time zone," +
        " index_core_version double precision NOT NULL," +
        " error_code character varying," +
        " is_active character(1)," +
        " created_date timestamp without time zone NOT NULL," +
        " is_il character(1),"+
        "px_last double precision,"+
        " CONSTRAINT index_data_pkey PRIMARY KEY (index_name, index_core_version, created_date)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.index_data OWNER TO postgres;" + ";";
  
  fields.put("INDEX_NAME", "INDEX_NAME".toLowerCase());
  fields.put("PX_BID", "PX_BID".toLowerCase());
  fields.put("PX_ASK", "PX_ASK".toLowerCase());
  fields.put("LAST_UPDATE", "LAST_UPDATE".toLowerCase());
  fields.put("INDEX_CORE_VERSION", "INDEX_CORE_VERSION".toLowerCase());
  fields.put("ERROR_CODE", "ERROR_CODE".toLowerCase());
  fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
  fields.put("CREATED_DATE", "CREATED_DATE".toLowerCase());
  fields.put("IS_IL", "IS_IL".toLowerCase());
  fields.put("PX_LAST", "PX_LASTs".toLowerCase());


}
}