package tables;

public class LockFlag extends AbstractTable {
  static {
    addChildClasses(0, LockFlag.class);

  }

  public LockFlag() {
    tableNameOracle = "LOCK_FLAG";
    tableNamePostgres = "LOCK_FLAG".toLowerCase();
    
    tableCreaterQuery = "CREATE TABLE" + "  public.lock_flag" + "(" +
        "    is_activated character varying" +
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE  public.lock_flag OWNER TO postgres;" + ";";
  
    fields.put("IS_ACTIVATED", "IS_ACTIVATED".toLowerCase());
}
}
