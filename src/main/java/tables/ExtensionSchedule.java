package tables;

public class ExtensionSchedule extends AbstractTable {

  static {

    addChildClasses(1, ExtensionSchedule.class);
  }

  public ExtensionSchedule() {
    tableNameOracle = "EXTENSION_SCHEDULE";
    tableNamePostgres = "extension_Schedule";

    fields.put("ID", "ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("EXT_DATE", "EXT_DATE".toLowerCase());
    fields.put("EXT_TYPE", "EXT_TYPE".toLowerCase());
    fields.put("SECURITY_VERSION", "SECURITY_VERSION".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
    fields.put("STRIKE", "STRIKE".toLowerCase());
  }

}
