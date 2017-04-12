package tables;

public class SecurityOriginator extends AbstractTable {
  static {
    addChildClasses(0, SecurityOriginator.class);

  }

  public SecurityOriginator() {
    tableNameOracle = "SECURITY_ORIGINATOR";
    tableNamePostgres = "SECURITY_ORIGINATOR".toLowerCase();
    
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("ORIGINATOR_ID", "ORIGINATOR_ID".toLowerCase());
    fields.put("SECURITY_VERSION", "SECURITY_VERSION".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
    
  }
}