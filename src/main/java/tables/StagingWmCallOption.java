package tables;

public class StagingWmCallOption extends AbstractTable {
  static {
    addChildClasses(0, StagingWmCallOption.class);

  }

  public StagingWmCallOption() {
    tableNameOracle = "STAGING_WM_CALL_OPTION";
    tableNamePostgres = "STAGING_WM_CALL_OPTION".toLowerCase();
    
    fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("CALL_DATE", "CALL_DATE".toLowerCase());
    fields.put("STRIKE", "STRIKE".toLowerCase());
    fields.put("ID", "ID".toLowerCase());
    
  }
}