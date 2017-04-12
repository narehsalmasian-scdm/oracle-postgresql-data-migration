package tables;

public class Users extends AbstractTable {
  static {
    addChildClasses(0, Users.class);

  }

  public Users() {
    tableNameOracle = "USERS";
    tableNamePostgres = "USERS".toLowerCase();
    
    fields.put("USER_ID", "USER_ID".toLowerCase());
    fields.put("PASSWORD", "PASSWORD".toLowerCase());

  }
}