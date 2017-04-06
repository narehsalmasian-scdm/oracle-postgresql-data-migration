package tables;

public class CallShedule extends AbstractTable {

  static {
    addChildClasses(1, CallShedule.class);
  }

  public CallShedule() {
    tableNameOracle = "CALL_SCHEDULE";
    tableNamePostgres = "CALL_SCHEDULE".toLowerCase();

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