package tables;

public class SecurityInfo extends AbstractTable {

  static {
    addChildClasses(0, SecurityInfo.class);
  }

  public SecurityInfo() {
    tableNameOracle = "SECURITY_INFO";
    tableNamePostgres = "security_info";

    fields.put("ID", "ID".toLowerCase());
    fields.put("VERSION", "VERSION".toLowerCase());
    fields.put("CREATED_DATE", "CREATED_DATE".toLowerCase());
    fields.put("CREATED_BY", "CREATED_BY".toLowerCase());
    

  }
}
