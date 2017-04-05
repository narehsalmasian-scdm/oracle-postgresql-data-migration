package tables;

public class CalibrationMapping extends AbstractTable {

  static {
    addChildClasses(0, CalibrationMapping.class);
  }

  public CalibrationMapping() {
    tableNameOracle = "CALIBRATION_MAPPING";
    tableNamePostgres = "CALIBRATION_MAPPING".toLowerCase();

    fields.put("INDEX_NAME", "INDEX_NAME".toLowerCase());
    fields.put("BBG_TICKER_NAME", "BBG_TICKER_NAME".toLowerCase());
    fields.put("FORMULA", "FORMULA".toLowerCase());


  }
}
