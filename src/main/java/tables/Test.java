package tables;

public class Test  extends AbstractTable {
  static {
    addChildClasses(0, Test.class);

  }

  public Test() {
    tableNameOracle = "TEST";
    tableNamePostgres = "TEST".toLowerCase();
    
    fields.put("TEST_COLUMN", "TEST_COLUMN".toLowerCase());
  }
}