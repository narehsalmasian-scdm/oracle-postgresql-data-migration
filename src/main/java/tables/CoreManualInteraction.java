package tables;

public class CoreManualInteraction extends AbstractTable {

  static {
    addChildClasses(0, CoreManualInteraction.class);
  }

  public CoreManualInteraction() {
    tableNameOracle = "COR_MANUAL_INTERACTION";
    tableNamePostgres = "cor_manual_interaction";

    fields.put("ID", "ID".toLowerCase());
    fields.put("ISIN", "ISIN".toLowerCase());
    fields.put("COUNTRY_OF_RISK", "COUNTRY_OF_RISK".toLowerCase());
    fields.put("OCCURENCIES", "OCCURENCIES".toLowerCase());
    fields.put("NOTIONAL_ISSUER", "NOTIONAL_ISSUER".toLowerCase());
    fields.put("NOTIONAL_ISSUER_NAME", "NOTIONAL_ISSUER_NAME".toLowerCase());

  }
}
