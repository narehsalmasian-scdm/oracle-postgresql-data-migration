package tables;

public class EadbFileNames extends  AbstractTable {

  static {
    addChildClasses(0, EadbFileNames.class);
  }

  public EadbFileNames() {
    tableNameOracle = "EADB_FILE_NAMES";
    tableNamePostgres = "eadb_file_names";

    fields.put("ID", "ID".toLowerCase());
    fields.put("FILE_NAME", "FILE_NAME".toLowerCase());
    fields.put("FILE_ID", "FILE_ID".toLowerCase());
    fields.put("CREATION_TIME", "CREATION_TIME".toLowerCase());
    fields.put("PROCESS_AFTER_NABS_RELEASE", "PROCESS_AFTER_NABS_RELEASE".toLowerCase());
    
  }
}