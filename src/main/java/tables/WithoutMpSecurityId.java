package tables;

public class WithoutMpSecurityId extends AbstractTable {
  static {
    addChildClasses(0, WithoutMpSecurityId.class);

  }

  public WithoutMpSecurityId() {
    tableNameOracle = "WITHOUT_MP_SECURITY_ID";
    tableNamePostgres = "WITHOUT_MP_SECURITY_ID".toLowerCase();
    
    fields.put("ISIN", "ISIN".toLowerCase());


  }
}

