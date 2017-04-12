package tables;

public class VolatilityCube  extends AbstractTable {
  static {
    addChildClasses(0, VolatilityCube.class);

  }

  public VolatilityCube() {
    tableNameOracle = "VOLATILITY_CUBE";
    tableNamePostgres = "VOLATILITY_CUBE".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("YIELD_CURVE_ID", "YIELD_CURVE_ID".toLowerCase());
    fields.put("CUBE_DATE", "CUBE_DATE".toLowerCase());
    fields.put("DATA", "DATA".toLowerCase());

  }
}