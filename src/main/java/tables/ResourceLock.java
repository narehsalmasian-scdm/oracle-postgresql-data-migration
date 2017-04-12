package tables;

public class ResourceLock extends AbstractTable {
  static {
    addChildClasses(0, ResourceLock.class);

  }

  public ResourceLock() {
    tableNameOracle = "RESOURCE_LOCK";
    tableNamePostgres = "RESOURCE_LOCK".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("RESOURCE_NAME", "RESOURCE_NAME".toLowerCase());
    fields.put("USER_ID", "USER_ID".toLowerCase());
    fields.put("TYPE", "TYPE".toLowerCase());
    fields.put("CREATED_DATE", "CREATED_DATE".toLowerCase());

    
    
  }
}