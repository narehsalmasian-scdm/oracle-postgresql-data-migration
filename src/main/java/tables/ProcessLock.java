package tables;

public class ProcessLock extends AbstractTable {
  static {
    addChildClasses(0, ProcessLock.class);

  }

  public ProcessLock() {
    tableNameOracle = "PROCESS_LOCK";
    tableNamePostgres = "PROCESS_LOCK".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("PROCESS_NAME", "PROCESS_NAME".toLowerCase());
    fields.put("USER_ID", "USER_ID".toLowerCase());
    fields.put("TYPE", "TYPE".toLowerCase());
    fields.put("CREATED_DATE", "CREATED_DATE".toLowerCase());

    
    

  }
}