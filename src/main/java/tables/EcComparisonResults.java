package tables;

public class EcComparisonResults extends  AbstractTable {

  static {
    addChildClasses(0, EcComparisonResults.class);
  }

  public EcComparisonResults() {
    tableNameOracle = "EC_COMPARISON_RESULTS";
    tableNamePostgres = "ec_comparison_results";

    fields.put("COUNTRY", "COUNTRY".toLowerCase());
    fields.put("SECTOR", "SECTOR".toLowerCase());
    fields.put("IS_CONSISTENT", "IS_CONSISTENT".toLowerCase());
    fields.put("FAILURE_YEAR_FRACTION", "FAILURE_YEAR_FRACTION".toLowerCase());
    fields.put("REASON", "REASON".toLowerCase());
    
    
  }
}

