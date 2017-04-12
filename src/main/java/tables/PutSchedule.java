package tables;

public class PutSchedule extends AbstractTable {
  static {
    addChildClasses(0, PutSchedule.class);

  }

  public PutSchedule() {
    tableNameOracle = "PUT_SCHEDULE";
    tableNamePostgres = "PUT_SCHEDULE".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("PUT_DATE", "PUT_DATE".toLowerCase());
    fields.put("PUT_TYPE", "PUT_TYPE".toLowerCase());
    fields.put("STRIKE", "STRIKE".toLowerCase());
    fields.put("SECURITY_VERSION", "SECURITY_VERSION".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
    fields.put("START_DATE", "START_DATE".toLowerCase());
    fields.put("END_DATE", "END_DATE".toLowerCase());

    
    

  }
}