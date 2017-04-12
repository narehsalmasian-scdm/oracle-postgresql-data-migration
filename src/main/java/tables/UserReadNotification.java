package tables;

public class UserReadNotification extends AbstractTable {
  static {
    addChildClasses(0, UserReadNotification.class);

  }

  public UserReadNotification() {
    tableNameOracle = "USER_READ_NOTIFICATION";
    tableNamePostgres = "USER_READ_NOTIFICATION".toLowerCase();
    
    fields.put("USER_READ_NOTIFICATION_ID", "USER_READ_NOTIFICATION_ID".toLowerCase());
    fields.put("USER_ID", "USER_ID".toLowerCase());
    fields.put("NOTIFICATION_ID", "NOTIFICATION_ID".toLowerCase());
  }
}