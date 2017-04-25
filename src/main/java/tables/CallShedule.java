package tables;

public class CallShedule extends AbstractTable {

  static {
    addChildClasses(1, CallShedule.class);
  }

  public CallShedule() {
    tableNameOracle = "CALL_SCHEDULE";
    tableNamePostgres = "CALL_SCHEDULE".toLowerCase();
    
    tableCreaterQuery = "CREATE TABLE" + "public.call_schedule" + "(" +
        " id character varying," +
        "security_id character varying," +
        " call_date timestamp without time zone," +
        " call_type character varying," +
        " strike double precision," +
        " security_version double precision," +
        " is_active character(1)," +
        " start_date timestamp without time zone," +
        " end_date timestamp without time zone," +
        "CONSTRAINT call_schedule_security_id_fkey FOREIGN KEY (security_id)"+
        "REFERENCES public.security_info (id) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION" +
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.call_schedule OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("CALL_DATE", "CALL_DATE".toLowerCase());
    fields.put("CALL_TYPE", "CALL_TYPE".toLowerCase());
    fields.put("STRIKE", "STRIKE".toLowerCase());
    fields.put("SECURITY_VERSION", "SECURITY_VERSION".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
    fields.put("START_DATE", "START_DATE".toLowerCase());
    fields.put("END_DATE", "END_DATE".toLowerCase());



  }
}