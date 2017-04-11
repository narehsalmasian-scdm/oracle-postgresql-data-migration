package tables;

public class ManualInteraction extends AbstractTable {
  static {
    addChildClasses(0, ManualInteraction.class);

  }

  public ManualInteraction() {
    tableNameOracle = "MANUAL_INTERACTION";
    tableNamePostgres = "MANUAL_INTERACTION".toLowerCase();
    fields.put("ISIN", "ISIN".toLowerCase());
    fields.put("IS_CREATION", "IS_CREATION".toLowerCase());
    fields.put("FIELDS","FIELDS".toLowerCase());

  }
}