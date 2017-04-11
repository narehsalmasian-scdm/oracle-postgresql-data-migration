package tables;

public class ModelParameters extends AbstractTable {
  static {
    addChildClasses(0, ModelParameters.class);

  }

  public ModelParameters() {
    tableNameOracle = "MODEL_PARAMETERS";
    tableNamePostgres = "MODEL_PARAMETERS".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("MONTE_CARLO_NUMBER_OF_PATHS",
        "MONTE_CARLO_NUMBER_OF_PATHS".toLowerCase());
    fields.put("MONTE_CARLO_NUMBER_OF_FACTORS",
        "MONTE_CARLO_NUMBER_OF_FACTORS".toLowerCase());
    fields.put("TIME_DISCRET_START", "TIME_DISCRET_START".toLowerCase());
    fields.put("TIME_DISCRET_NUMBER_OF_STEPS",
        "TIME_DISCRET_NUMBER_OF_STEPS".toLowerCase());
    fields.put("TIME_DISCRET_STEP", "TIME_DISCRET_STEP".toLowerCase());
    fields.put("TENOR_DISCRET_START", "TENOR_DISCRET_START".toLowerCase());
    fields.put("TENOR_DISCRET_NUMBER_OF_STEPS",
        "TENOR_DISCRET_NUMBER_OF_STEPS".toLowerCase());

    fields.put("TENOR_DISCRET_STEP", "TENOR_DISCRET_STEP".toLowerCase());
    fields.put("NUMERAIRE_CURRENCY", "NUMERAIRE_CURRENCY".toLowerCase());
    fields.put("NUMERAIRE_MEASURE", "NUMERAIRE_MEASURE".toLowerCase());
    fields.put("FORWARD_CURVE", "FORWARD_CURVE".toLowerCase());

    fields.put("VOLATILITY_SURFACE", "VOLATILITY_SURFACE".toLowerCase());
    fields.put("VOLATILITY_MODEL", "VOLATILITY_MODEL".toLowerCase());
    fields.put("SWAPTION_VOLATILITY_SURFACE",
        "SWAPTION_VOLATILITY_SURFACE".toLowerCase());

  }
}