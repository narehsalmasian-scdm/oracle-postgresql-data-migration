package tables;

public class StagingBbgCallSchedule extends AbstractTable {
  static {
    addChildClasses(0, StagingBbgCallSchedule.class);

  }

  public StagingBbgCallSchedule() {
    tableNameOracle = "STAGING_BBG_CALL_SCHEDULE";
    tableNamePostgres = "STAGING_BBG_CALL_SCHEDULE".toLowerCase();
    
    fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("CALL_DATE", "CALL_DATE".toLowerCase());
    fields.put("STRIKE", "STRIKE".toLowerCase());
    fields.put("ID", "ID".toLowerCase());

    
  }
}