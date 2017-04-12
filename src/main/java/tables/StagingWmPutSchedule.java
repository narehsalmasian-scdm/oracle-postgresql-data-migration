package tables;

public class StagingWmPutSchedule extends AbstractTable {
  static {
    addChildClasses(0, StagingWmPutSchedule.class);

  }

  public StagingWmPutSchedule() {
    tableNameOracle = "STAGING_WM_PUT_SCHEDULE";
    tableNamePostgres = "STAGING_WM_PUT_SCHEDULE".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("PUT_DATE", "PUT_DATE".toLowerCase());
    fields.put("PUT_AMOUNT", "PUT_AMOUNT".toLowerCase());
  }
}