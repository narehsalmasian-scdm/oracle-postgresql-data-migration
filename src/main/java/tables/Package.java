package tables;

public class Package extends AbstractTable {
  static {
    addChildClasses(0, Package.class);

  }

  public Package() {
    tableNameOracle = "PACKAGE";
    tableNamePostgres = "PACKAGE".toLowerCase();
    fields.put("PACKAGE_NAME", "PACKAGE_NAME".toLowerCase());

  }
}
