package tables;

public class ScheduleManualOverWrite  extends AbstractTable {
  static {
    addChildClasses(0, ScheduleManualOverWrite.class);

  }

  public ScheduleManualOverWrite() {
    tableNameOracle = "SCHEDULE_MANUAL_OVERWRITE";
    tableNamePostgres = "SCHEDULE_MANUAL_OVERWRITE".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("SCHEDULE_DATE", "SCHEDULE_DATE".toLowerCase());
    fields.put("SCHEDULE_TYPE", "SCHEDULE_TYPE".toLowerCase());
    fields.put("SCHEDULE_KIND", "SCHEDULE_KIND".toLowerCase());
    fields.put("SCHEDULE_STRIKE", "SCHEDULE_STRIKE".toLowerCase());
    fields.put("SCHEDULE_START_DATE", "SCHEDULE_START_DATE".toLowerCase());
    fields.put("SCHEDULE_END_DATE", "SCHEDULE_END_DATE".toLowerCase());

    
    
  }
}