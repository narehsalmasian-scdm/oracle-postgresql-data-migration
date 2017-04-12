package tables;

public class SecurityIssuer extends AbstractTable {
  static {
    addChildClasses(0, SecurityIssuer.class);

  }

  public SecurityIssuer() {
    tableNameOracle = "SECURITY_ISSUER";
    tableNamePostgres = "SECURITY_ISSUER".toLowerCase();
    
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("ISSUER_ID", "ISSUER_ID".toLowerCase());
    fields.put("SECURITY_VERSION", "SECURITY_VERSION".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
    
  }
}