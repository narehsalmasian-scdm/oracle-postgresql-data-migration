package tables;

public class YieldCurve extends AbstractTable {
  static {
    addChildClasses(0, YieldCurve.class);

  }

  public YieldCurve() {
    tableNameOracle = "YIELD_CURVE";
    tableNamePostgres = "YIELD_CURVE".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("NAME", "NAME".toLowerCase());
    fields.put("BLOOMBERG_ID", "BLOOMBERG_ID".toLowerCase());
    fields.put("DESCRIPTION", "DESCRIPTION".toLowerCase());
  }
}
