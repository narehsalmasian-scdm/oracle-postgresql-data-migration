package tables;

public class UserRoles extends AbstractTable {
  static {
    addChildClasses(0, UserRoles.class);

  }

  public UserRoles() {
    tableNameOracle = "USER_ROLES";
    tableNamePostgres = "USER_ROLES".toLowerCase();
    
    fields.put("USER_ID", "USER_ID".toLowerCase());
    fields.put("USER_ROLE", "USER_ROLE".toLowerCase());

  }
}