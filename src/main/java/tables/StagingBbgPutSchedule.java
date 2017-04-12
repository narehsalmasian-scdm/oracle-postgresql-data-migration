package tables;

public class StagingBbgPutSchedule extends AbstractTable {
  static {
    addChildClasses(0, StagingBbgPutSchedule.class);

  }

  public StagingBbgPutSchedule() {
    tableNameOracle = "STAGING_BBG_PUT_SCHEDULE";
    tableNamePostgres = "STAGING_BBG_PUT_SCHEDULE".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("PUT_DATE", "PUT_DATE".toLowerCase());
    fields.put("PUT_AMOUNT", "PUT_AMOUNT".toLowerCase());


    
  }
}
