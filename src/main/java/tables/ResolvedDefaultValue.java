package tables;

public class ResolvedDefaultValue extends AbstractTable {
  static {
    addChildClasses(0, ResolvedDefaultValue.class);

  }

  public ResolvedDefaultValue() {
    tableNameOracle = "REPORT_CONTAINER";
    tableNamePostgres = "REPORT_CONTAINER".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
    fields.put("FIELD_NAME", "FIELD_NAME".toLowerCase());
    fields.put("CREATED_DATE", "CREATED_DATE".toLowerCase());
    fields.put("CREATED_BY", "CREATED_BY".toLowerCase());

    
    
  }
}