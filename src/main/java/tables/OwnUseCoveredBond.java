package tables;

public class OwnUseCoveredBond extends AbstractTable {
  static {
    addChildClasses(0, OwnUseCoveredBond.class);

  }

  public OwnUseCoveredBond() {
    tableNameOracle = "OWN_USE_COVERED_BOND";
    tableNamePostgres = "OWN_USE_COVERED_BOND".toLowerCase();
    fields.put("ISIN", "ISIN".toLowerCase());

  }
}
