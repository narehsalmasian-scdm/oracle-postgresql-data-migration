package tables;

public class CcxCore extends AbstractTable {

  static {
    addChildClasses(0, CcxCore.class);
  }

  public CcxCore() {
    tableNameOracle = "CCX_CORE";
    tableNamePostgres = "ccx_core";

    fields.put("ID", "ID".toLowerCase());
    fields.put("CCX_CURVE_NAME", "CCX_CURVE_NAME".toLowerCase());
    fields.put("TYPE", "TYPE".toLowerCase());
    fields.put("FORWARDS_TYPE", "FORWARDS_TYPE".toLowerCase());
    fields.put("DAY_COUNT_CONVENTION", "DAY_COUNT_CONVENTION".toLowerCase());
    fields.put("OBJECT", "OBJECT".toLowerCase());
    fields.put("CURRENCY", "CURRENCY".toLowerCase());


  }
}
