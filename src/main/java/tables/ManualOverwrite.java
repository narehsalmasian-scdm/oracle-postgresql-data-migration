package tables;

public class ManualOverwrite extends AbstractTable {
  static {
    addChildClasses(0, ManualOverwrite.class);

  }

  public ManualOverwrite() {
    tableNameOracle = "MANUAL_OVERWRITE";
    tableNamePostgres = "MANUAL_OVERWRITE".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("ISIN", "ISIN".toLowerCase());
    fields.put("COLUMN_NAME","COLUMN_NAME".toLowerCase());
    fields.put("R_B_VALUE","R_B_VALUE".toLowerCase());

  }
}