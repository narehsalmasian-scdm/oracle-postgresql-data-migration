package tables;

public class BacHisResults extends AbstractTable {
  static {
    addChildClasses(0, BacHisResults.class);

  }

  public BacHisResults() {
    tableNameOracle = "BAC_HIST_RESULTS";
    tableNamePostgres = "BAC_HIST_RESULTS".toLowerCase();

    fields.put("COUNTRY", "COUNTRY".toLowerCase());
    fields.put("SECTOR", "SECTOR".toLowerCase());
    fields.put("CURVES_IN_ORDER",
        "CURVES_IN_ORDER".toLowerCase());
    fields.put("FLUSH_TIMESTAMP", "FLUSH_TIMESTAMP".toLowerCase());
  }
}