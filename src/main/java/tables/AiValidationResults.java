package tables;

public class AiValidationResults extends AbstractTable {
  static {
    addChildClasses(0, AiValidationResults.class);

  }

  public AiValidationResults() {
    tableNameOracle = "AI_VALIDATION_RESULTS";
    tableNamePostgres = "ai_validation_results";
    
    
    tableCreaterQuery = "CREATE TABLE" + "public.ai_validation_results " +
        "("
        + " id double precision NOT NULL,"+
       " tp_id double precision" + ","
        + "security_id character varying(255)" + ","+
        "issuer_name character varying(255)" + "," +
        "diff_historic_ai double precision" + "," +
        "diff_historic_ai_p double precision" + "," +
        "current_ai double precision" + ","+
        "previous_ai double precision" + "," +
        "current_b_day timestamp(6) without time zone,"+
        "is_validated character(1),"+
       "  previous_b_day timestamp(6) without time zone,"+
        "CONSTRAINT ai_validation_results_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLEpublic.ai_validation_results OWNER TO postgres;" + ";";
    

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

