package tables;

public class EcComparisonHistResults extends  AbstractTable {

  static {
    addChildClasses(0, EcComparisonHistResults.class);
  }

  public EcComparisonHistResults() {
    tableNameOracle = "EC_COMPARISON_HIST_RESULTS";
    tableNamePostgres = "ec_comparison_hist_results";

    fields.put("COUNTRY", "COUNTRY".toLowerCase());
    fields.put("SECTOR", "SECTOR".toLowerCase());
    fields.put("IS_CONSISTENT", "IS_CONSISTENT".toLowerCase());
    fields.put("FAILURE_YEAR_FRACTION", "FAILURE_YEAR_FRACTION".toLowerCase());
    fields.put("REASON", "REASON".toLowerCase());
    fields.put("FLUSH_TIMESTAMP", "FLUSH_TIMESTAMP".toLowerCase());
    
    
  }
}
