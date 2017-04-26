package tables;

public class HistoricalEadbOriginator extends AbstractTable {

  static {

    addChildClasses(1, HistoricalEadbOriginator.class);
  }

  public HistoricalEadbOriginator() {
    tableNameOracle = "HISTORICAL_EADB_ORIGINATOR";
    tableNamePostgres = "historical_eadb_originator";
    
    tableCreaterQuery = "CREATE TABLE" + "public.historical_eadb_originator" + "(" +
        "   id character varying," +
        "  eadb_id character varying," +
        "  as_of_date timestamp without time zone," +
        "  value character varying," +
        "  name character varying," +
        "   country_of_incorp character varying," +
        "     role character varying," +
       
        " CONSTRAINT historical_eadb_originator_eadb_id_fkey FOREIGN KEY (eadb_id)"+
        "  REFERENCES public.historical_eadb_data (id) MATCH SIMPLE"+
        " ON UPDATE NO ACTION ON DELETE NO ACTION"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.historical_eadb_originator OWNER TO postgres;" + ";";
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("EADB_ID", "EADB_ID".toLowerCase());
  fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
  fields.put("VALUE", "VALUE".toLowerCase());
  fields.put("NAME", "NAME".toLowerCase());
  fields.put("COUNTRY_OF_INCORP", "COUNTRY_OF_INCORP".toLowerCase());
  fields.put("ROLE", "ROLE".toLowerCase());
  


}
  
}
