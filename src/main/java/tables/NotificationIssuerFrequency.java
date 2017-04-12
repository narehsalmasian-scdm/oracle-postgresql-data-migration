package tables;

public class NotificationIssuerFrequency extends AbstractTable {
  static {
    addChildClasses(0, NotificationIssuerFrequency.class);

  }

  public NotificationIssuerFrequency() {
    tableNameOracle = "NOTIONAL_ISSUER_FREQUENCY";
    tableNamePostgres = "NOTIONAL_ISSUER_FREQUENCY".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("NOTIONAL_ISSUER", "NOTIONAL_ISSUER".toLowerCase());
    fields.put("COUNTRY_OF_RISK", "COUNTRY_OF_RISK".toLowerCase());
    fields.put("OCCURENCIES", "OCCURENCIES".toLowerCase());

  }
}
