package tables;

public class HistoricalWmPutSchedule extends AbstractTable {

  static {

    addChildClasses(1, HistoricalWmPutSchedule.class);
  }

  public HistoricalWmPutSchedule() {
    tableNameOracle = "HISTORICAL_WM_PUT_SCHEDULE";
    tableNamePostgres = "historical_wm_put_schedule";
    
    tableCreaterQuery = "CREATE TABLE" + "public.historical_wm_put_schedule" + "(" +
        "    id double precision NOT NULL," +
        "   entity_id character varying," +
        "   as_of_date timestamp without time zone," +
        "  put_date timestamp without time zone," +
        " put_amount double precision," +
        "  is_active character(1)," +
        " CONSTRAINT historical_wm_put_schedule_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.historical_wm_put_schedule OWNER TO postgres;" + ";";
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
  fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
  fields.put("PUT_DATE", "PUT_DATE".toLowerCase());
  fields.put("PUT_AMOUNT", "PUT_AMOUNT".toLowerCase());
  fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
}
}