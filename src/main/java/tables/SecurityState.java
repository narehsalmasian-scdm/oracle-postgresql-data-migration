package tables;

public class SecurityState extends AbstractTable {
  static {
    addChildClasses(0, SecurityState.class);

  }

  public SecurityState() {
    tableNameOracle = "SECURITY_STATE";
    tableNamePostgres = "SECURITY_STATE".toLowerCase();
    
    fields.put("ISIN", "ISIN".toLowerCase());
    fields.put("STATE", "STATE".toLowerCase());
    
  }
}