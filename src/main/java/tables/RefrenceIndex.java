package tables;

public class RefrenceIndex  extends AbstractTable {
  static {
    addChildClasses(0, RefrenceIndex.class);

  }

  public RefrenceIndex() {
    tableNameOracle = "REFERENCE_INDEX";
    tableNamePostgres = "REFERENCE_INDEX".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("YIELD_CURVE_ID", "YIELD_CURVE_ID".toLowerCase());
    fields.put("NAME", "NAME".toLowerCase());
    fields.put("BLOOMBERG_ID", "BLOOMBERG_ID".toLowerCase());
    fields.put("TENOR", "TENOR".toLowerCase());
    fields.put("DAY_COUNT_CONVENTION", "DAY_COUNT_CONVENTION".toLowerCase());
    fields.put("PAYMENT_FREQUENCY", "PAYMENT_FREQUENCY".toLowerCase());
    
    
  }
}
