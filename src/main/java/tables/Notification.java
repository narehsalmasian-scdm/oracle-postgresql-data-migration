package tables;

public class Notification extends AbstractTable {
  static {
    addChildClasses(0, Notification.class);

  }

  public Notification() {
    tableNameOracle = "NOTIFICATION";
    tableNamePostgres = "NOTIFICATION".toLowerCase();
    fields.put("NOTIFICATION_ID", "NOTIFICATION_ID".toLowerCase());
    fields.put("PERFORMER_ID", "PERFORMER_ID".toLowerCase());
    fields.put("NOTIFICATION_SEVERITY", "NOTIFICATION_SEVERITY".toLowerCase());
    fields.put("NOTIFICATION_TEXT", "NOTIFICATION_TEXT".toLowerCase());
    fields.put("CREATE_TIME", "CREATE_TIME".toLowerCase());
    fields.put("NOTIFICATION_TYPE", "NOTIFICATION_TYPE".toLowerCase());
    fields.put("BULK_UPLOAD_ID", "BULK_UPLOAD_ID".toLowerCase());
    
  }
}
