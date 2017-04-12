package tables;

public class SwaptionCore  extends AbstractTable {
  static {
    addChildClasses(0, SwaptionCore.class);

  }

  public SwaptionCore() {
    tableNameOracle = "SWAPTION_CORE";
    tableNamePostgres = "SWAPTION_CORE".toLowerCase();
    
    fields.put("SWAPTION_NAME", "SWAPTION_NAME".toLowerCase());
    fields.put("SWAPTION_TYPE", "SWAPTION_TYPE".toLowerCase());
    fields.put("VOLATILITY_TYPE", "VOLATILITY_TYPE".toLowerCase());
    fields.put("SWAPTION_INDEX", "SWAPTION_INDEX".toLowerCase());
    fields.put("DAY_COUNT_CONVENTION", "DAY_COUNT_CONVENTION".toLowerCase());
    fields.put("TENOR_CODE", "TENOR_CODE".toLowerCase());
    fields.put("DISCOUNT_CURVE", "DISCOUNT_CURVE".toLowerCase());
    fields.put("FORWARD_CURVE", "FORWARD_CURVE".toLowerCase());
  }
}