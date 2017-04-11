package tables;

public class MidYield extends AbstractTable {
  static {
    addChildClasses(0, MidYield.class);

  }

  public MidYield() {
    tableNameOracle = "MID_YIELD";
    tableNamePostgres = "MID_YIELD".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("INDEX_ID", "INDEX_ID".toLowerCase());
    fields.put("FIXING_DATE","FIXING_DATE".toLowerCase());
    fields.put("MID_YIELD","MID_YIELD".toLowerCase());

  }
}