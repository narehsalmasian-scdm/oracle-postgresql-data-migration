package tables;

public class SinkSchedule extends AbstractTable {
  static {
    addChildClasses(0, SinkSchedule.class);

  }

  public SinkSchedule() {
    tableNameOracle = "SINK_SCHEDULE";
    tableNamePostgres = "SINK_SCHEDULE".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("SINK_DATE", "SINK_DATE".toLowerCase());
    fields.put("SINK_TYPE", "SINK_TYPE".toLowerCase());
    fields.put("STRIKE", "STRIKE".toLowerCase());
    fields.put("SECURITY_VERSION", "SECURITY_VERSION".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
    
  }
}