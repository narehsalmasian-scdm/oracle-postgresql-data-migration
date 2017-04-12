package tables;

public class TpValidationResults extends AbstractTable {
  static {
    addChildClasses(0, TpValidationResults.class);

  }

  public TpValidationResults() {
    tableNameOracle = "TP_VALIDATION_RESULTS";
    tableNamePostgres = "TP_VALIDATION_RESULTS".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("TP_ID", "TP_ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("ISSUER_NAME", "ISSUER_NAME".toLowerCase());
    fields.put("CURRENT_B_DAY", "CURRENT_B_DAY".toLowerCase());
    fields.put("PREVIOUS_B_DAY", "PREVIOUS_B_DAY".toLowerCase());
    fields.put("DIFF_HISTORIC_TP", "DIFF_HISTORIC_TP".toLowerCase());
    fields.put("DIFF_HISTORIC_TP_P", "DIFF_HISTORIC_TP_P".toLowerCase());
    fields.put("DIFF_MP", "DIFF_MP".toLowerCase());
    fields.put("DIFF_MP_P", "DIFF_MP_P".toLowerCase());
    
    fields.put("CURRENT_TP", "CURRENT_TP".toLowerCase());
    fields.put("PREVIOUS_TP", "PREVIOUS_TP".toLowerCase());
    fields.put("CURRENT_MP", "CURRENT_MP".toLowerCase());
    fields.put("IS_VALIDATED", "IS_VALIDATED".toLowerCase());
  }
}