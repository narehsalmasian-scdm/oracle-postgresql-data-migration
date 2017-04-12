package tables;

public class UserHelp extends AbstractTable {
  static {
    addChildClasses(0, TpValidationResults.class);

  }

  public UserHelp() {
    tableNameOracle = "USER_HELP";
    tableNamePostgres = "USER_HELP".toLowerCase();
    
    fields.put("FIELD_ID", "FIELD_ID".toLowerCase());
    fields.put("HELP_TEXT", "HELP_TEXT".toLowerCase());
  }
}