package tables;

public class CalibrationResult extends AbstractTable {

  static {
    addChildClasses(0, CalibrationResult.class);
  }

  public CalibrationResult() {
    tableNameOracle = "CALIBRATION_RESULT";
    tableNamePostgres = "CALIBRATION_RESULT".toLowerCase();

    fields.put("NAME", "NAME".toLowerCase());
    fields.put("B0", "B0".toLowerCase());
    fields.put("B1", "B1".toLowerCase());
    fields.put("B0", "B0".toLowerCase());
    fields.put("B1", "B1".toLowerCase());
    fields.put("B2", "B2".toLowerCase());
    fields.put("B3", "B3".toLowerCase());
    fields.put("L0", "L0".toLowerCase());
    fields.put("L1", "L1".toLowerCase());



  }
}
