package tables;

public class LockFlag extends AbstractTable {
  static {
    addChildClasses(0, LockFlag.class);

  }

  public LockFlag() {
    tableNameOracle = "LOCK_FLAG";
    tableNamePostgres = "LOCK_FLAG".toLowerCase();
    fields.put("IS_ACTIVATED", "IS_ACTIVATED".toLowerCase());
}
}
