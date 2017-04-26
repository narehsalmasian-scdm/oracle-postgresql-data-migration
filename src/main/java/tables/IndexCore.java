package tables;

public class IndexCore extends AbstractTable {

  static {

    addChildClasses(1, IndexCore.class);
  }

  public IndexCore() {
    tableNameOracle = "INDEX_CORE";
    tableNamePostgres = "index_core";
    
    tableCreaterQuery = "CREATE TABLE" + "public.index_core" + "(" +
        "   id double precision NOT NULL," +
        "    leading_ticker character varying," +
        "  version double precision NOT NULL," +
        "   package_name character varying," +
        " is_active character(1)," +
        "   created_date timestamp without time zone," +
        "  created_by character varying," +
        " px character varying," +
        "  CONSTRAINT index_core_pkey PRIMARY KEY (version, index_name)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.index_core OWNER TO postgres;" + ";";
  
  
  fields.put("INDEX_NAME", "INDEX_NAME".toLowerCase());
  fields.put("LEADING_TICKER", "LEADING_TICKER".toLowerCase());
  fields.put("VERSION", "VERSION".toLowerCase());
  fields.put("PACKAGE_NAME", "PACKAGE_NAME".toLowerCase());
  fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
  fields.put("CREATED_DATE", "CREATED_DATE".toLowerCase());
  fields.put("CREATED_BY", "CREATED_BY".toLowerCase());
  fields.put("PX", "PX".toLowerCase());

}
}