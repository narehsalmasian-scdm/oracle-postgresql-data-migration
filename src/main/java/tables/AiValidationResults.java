package tables;

public class AiValidationResults extends AbstractTable {
  static {
    addChildClasses(0, AiValidationResults.class);

  }

  public AiValidationResults() {
    tableNameOracle = "AI_VALIDATION_RESULTS";
    tableNamePostgres = "ai_validation_results";

    fields.put("ID", "ID".toLowerCase());
    fields.put("TP_ID", "TP_ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("ISSUER_NAME", "ISSUER_NAME".toLowerCase());
    fields.put("CURRENT_B_DAY", "CURRENT_B_DAY".toLowerCase());
    fields.put("PREVIOUS_B_DAY", "PREVIOUS_B_DAY".toLowerCase());
    fields.put("DIFF_HISTORIC_AI", "DIFF_HISTORIC_AI".toLowerCase());
    fields.put("DIFF_HISTORIC_AI_P", "DIFF_HISTORIC_AI_P".toLowerCase());
    fields.put("CURRENT_AI", "CURRENT_AI".toLowerCase());
    fields.put("PREVIOUS_AI", "PREVIOUS_AI".toLowerCase());
    fields.put("IS_VALIDATED", "IS_VALIDATED".toLowerCase());
}
}

