package tables;

public class Model extends AbstractTable {
  static {
    addChildClasses(0, Model.class);

  }

  public Model() {
    tableNameOracle = "MODEL";
    tableNamePostgres = "MODEL".toLowerCase();
    fields.put("NAME", "NAME".toLowerCase());
    fields.put("MODEL_PARAMS", "MODEL_PARAMS".toLowerCase());
    fields.put("CORRELATION_MODEL_PARAMS","CORRELATION_MODEL_PARAMS".toLowerCase());
    fields.put("VOLATILITY_MODEL_PARAMS","VOLATILITY_MODEL_PARAMS".toLowerCase());

  }
}