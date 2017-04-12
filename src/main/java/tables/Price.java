package tables;

public class Price extends AbstractTable {
  static {
    addChildClasses(0, Price.class);

  }

  public Price() {
    tableNameOracle = "PRICE";
    tableNamePostgres = "PRICE".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("TYPE", "TYPE".toLowerCase());
    fields.put("PRICE", "PRICE".toLowerCase());
    fields.put("IS_DISSEMINATED", "IS_DISSEMINATED".toLowerCase());
    
    

  }
}