package tables;

public class SecurityGuarantor extends AbstractTable {
  static {
    addChildClasses(0, SecurityGuarantor.class);

  }

  public SecurityGuarantor() {
    tableNameOracle = "SECURITY_GUARANTOR";
    tableNamePostgres = "SECURITY_GUARANTOR".toLowerCase();
    
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("GUARANTOR_ID", "GUARANTOR_ID".toLowerCase());
    fields.put("SECURITY_VERSION", "SECURITY_VERSION".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
    
  }
}