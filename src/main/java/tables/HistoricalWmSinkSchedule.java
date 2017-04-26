package tables;

public class HistoricalWmSinkSchedule extends AbstractTable {

  static {

    addChildClasses(1, HistoricalWmSinkSchedule.class);
  }

  public HistoricalWmSinkSchedule() {
    tableNameOracle = "HISTORICAL_WM_SINK_SCHEDULE";
    tableNamePostgres = "historical_wm_sink_schedule";
    
    tableCreaterQuery = "CREATE TABLE" + "public.historical_wm_sink_schedule" + "(" +
        "   id double precision NOT NULL," +
        "   entity_id character varying," +
        "   as_of_date timestamp without time zone," +
        "  sink_date timestamp without time zone," +
        " sink_amount double precision," +
        "   is_active character(1)," +
        " CONSTRAINT historical_wm_sink_schedule_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.historical_wm_sink_schedule OWNER TO postgres;" + ";";
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
  fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
  fields.put("SINK_DATE", "SINK_DATE".toLowerCase());
  fields.put("SINK_AMOUNT", "SINK_AMOUNT".toLowerCase());
  fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
}
}