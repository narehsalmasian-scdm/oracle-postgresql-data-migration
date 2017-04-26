package tables;

public class IndexFixings extends AbstractTable {

  static {

    addChildClasses(1, IndexFixings.class);
  }

  public IndexFixings() {
    tableNameOracle = "INDEX_FIXINGS";
    tableNamePostgres = "index_fixings";
    
    tableCreaterQuery = "CREATE TABLE" + "public.index_fixings" + "(" +
        "  isin character varying NOT NULL," +
        "   as_of_date timestamp without time zone NOT NULL," +
        "  fixing double precision," +
        " CONSTRAINT index_fixings_pkey PRIMARY KEY (isin, as_of_date)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.index_fixings OWNER TO postgres;" + ";";
  
  fields.put("ISIN", "ISIN".toLowerCase());
  fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
  fields.put("FIXING", "FIXING".toLowerCase());
  


}
}