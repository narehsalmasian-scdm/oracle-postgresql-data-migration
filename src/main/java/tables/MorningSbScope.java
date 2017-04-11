package tables;

public class MorningSbScope extends AbstractTable {
  static {
    addChildClasses(0, MorningSbScope.class);

  }

  public MorningSbScope() {
    tableNameOracle = "MORNING_SB_SCOPE";
    tableNamePostgres = "MORNING_SB_SCOPE".toLowerCase();
    fields.put("ISIN", "ISIN".toLowerCase());
  }
}
