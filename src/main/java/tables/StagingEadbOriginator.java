package tables;

public class StagingEadbOriginator extends AbstractTable {
  static {
    addChildClasses(0, StagingEadbOriginator.class);

  }

  public StagingEadbOriginator() {
    tableNameOracle = "STAGING_EADB_ORIGINATOR";
    tableNamePostgres = "STAGING_EADB_ORIGINATOR".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("EADB_ID", "EADB_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("VALUE", "VALUE".toLowerCase());
    fields.put("NAME", "NAME".toLowerCase());
    fields.put("COUNTRY_OF_INCORP", "COUNTRY_OF_INCORP".toLowerCase());
    fields.put("ROLE", "ROLE".toLowerCase());
   
  }
}