package tables;

public class CorrelationModelParameters extends AbstractTable {

  static {
    addChildClasses(0, CorrelationModelParameters.class);
  }

  public CorrelationModelParameters() {
    tableNameOracle = "CORRELATION_MODEL_PARAMETERS";
    tableNamePostgres = "correlation_model_parameters";
    
    tableCreaterQuery = "CREATE TABLE" + "public.correlation_model_parameters" + "(" +
        "   id double precision NOT NULL," +
        "   number_of_factors double precision," +
        "  correlation_decay double precision," +
        "    name character varying," +
        "   reference_date date," +
        "   correlation_model_type character varying," +
        "CONSTRAINT correlation_model_parameters_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.correlation_model_parameters OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("NUMBER_OF_FACTORS", "NUMBER_OF_FACTORS".toLowerCase());
    fields.put("CORRELATION_DECAY", "CORRELATION_DECAY".toLowerCase());
    fields.put("NAME", "NAME".toLowerCase());
    fields.put("REFERENCE_DATE", "REFERENCE_DATE".toLowerCase());
    fields.put("CORRELATION_MODEL_TYPE", "CORRELATION_MODEL_TYPE".toLowerCase());

  }
}

