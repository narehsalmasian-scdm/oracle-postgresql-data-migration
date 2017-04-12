package tables;

public class StagingBbgSinkSchedule extends AbstractTable {
  static {
    addChildClasses(0, StagingBbgSinkSchedule.class);

  }

  public StagingBbgSinkSchedule() {
    tableNameOracle = "STAGING_BBG_SINK_SCHEDULE";
    tableNamePostgres = "STAGING_BBG_SINK_SCHEDULE".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("SINK_DATE", "SINK_DATE".toLowerCase());
    fields.put("SINK_AMOUNT", "SINK_AMOUNT".toLowerCase());


    
  }
}
