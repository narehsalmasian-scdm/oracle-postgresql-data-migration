package tables;

public class CorrelationModelParameters extends AbstractTable {

  static {
    addChildClasses(0, CorrelationModelParameters.class);
  }

  public CorrelationModelParameters() {
    tableNameOracle = "CORRELATION_MODEL_PARAMETERS";
    tableNamePostgres = "correlation_model_parameters";

    fields.put("ID", "ID".toLowerCase());
    fields.put("NUMBER_OF_FACTORS", "NUMBER_OF_FACTORS".toLowerCase());
    fields.put("CORRELATION_DECAY", "CORRELATION_DECAY".toLowerCase());
    fields.put("NAME", "NAME".toLowerCase());
    fields.put("REFERENCE_DATE", "REFERENCE_DATE".toLowerCase());
    fields.put("CORRELATION_MODEL_TYPE", "CORRELATION_MODEL_TYPE".toLowerCase());

  }
}

