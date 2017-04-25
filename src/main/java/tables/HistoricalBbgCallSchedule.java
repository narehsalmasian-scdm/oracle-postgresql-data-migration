package tables;

public class HistoricalBbgCallSchedule  extends AbstractTable {

  static {

    addChildClasses(1, HistoricalBbgCallSchedule.class);
  }

  public HistoricalBbgCallSchedule() {
    tableNameOracle = "HISTORICAL_BBG_CALL_SCHEDULE";
    tableNamePostgres = "historical_bbg_call_schedule";
    
    tableCreaterQuery = "CREATE TABLE" + "public.historical_bbg_call_schedule" + "(" +
        "  id double precision NOT NULL," +
        "   entity_id character varying," +
        "  as_of_date timestamp without time zone," +
        " call_date timestamp without time zone," +
        " strike double precision," +
        " is_active character(1)," +
        "  CONSTRAINT historical_bbg_call_schedule_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.historical_bbg_call_schedule OWNER TO postgres;" + ";";


    fields.put("ID", "ID".toLowerCase());
    fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("CALL_DATE", "CALL_DATE".toLowerCase());
    fields.put("STRIKE", "STRIKE".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());

  }

} 