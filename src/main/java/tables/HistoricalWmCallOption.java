package tables;

public class HistoricalWmCallOption extends AbstractTable {

  static {

    addChildClasses(1, HistoricalWmCallOption.class);
  }

  public HistoricalWmCallOption() {
    tableNameOracle = "HISTORICAL_WM_CALL_OPTION";
    tableNamePostgres = "historical_wm_call_option";
    
    tableCreaterQuery = "CREATE TABLE" + "public.historical_wm_call_option" + "(" +
        "   id double precision NOT NULL," +
        "   entity_id character varying," +
        "   as_of_date timestamp without time zone," +
        "   call_date timestamp without time zone," +
        "  strike double precision," +
        " is_active character(1)," +
       
        "CONSTRAINT historical_wm_call_option_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.historical_wm_call_option OWNER TO postgres;" + ";";
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
  fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
  fields.put("CALL_DATE", "CALL_DATE".toLowerCase());
  fields.put("STRIKE", "STRIKE".toLowerCase());
  fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());

  


}
  
}