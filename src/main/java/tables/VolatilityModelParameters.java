package tables;

public class VolatilityModelParameters extends AbstractTable {
  static {
    addChildClasses(0, VolatilityModelParameters.class);

  }

  public VolatilityModelParameters() {
    tableNameOracle = "VOLATILITY_MODEL_PARAMETERS";
    tableNamePostgres = "VOLATILITY_MODEL_PARAMETERS".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("A", "A".toLowerCase());
    fields.put("B", "B".toLowerCase());
    fields.put("C", "C".toLowerCase());
    fields.put("D", "D".toLowerCase());
    fields.put("VOLATILITY_MODEL", "VOLATILITY_MODEL".toLowerCase());
    fields.put("SURFACE_NAME", "SURFACE_NAME".toLowerCase());
    fields.put("REFERENCE_DATE", "REFERENCE_DATE".toLowerCase());

  }
}
