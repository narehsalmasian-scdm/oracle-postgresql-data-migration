package tables;

public class HistoricalEadbOriginator extends AbstractTable {

  static {

    addChildClasses(1, HistoricalEadbOriginator.class);
  }

  public HistoricalEadbOriginator() {
    tableNameOracle = "HISTORICAL_EADB_ORIGINATOR";
    tableNamePostgres = "historical_eadb_originator";
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("EADB_ID", "EADB_ID".toLowerCase());
  fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
  fields.put("VALUE", "VALUE".toLowerCase());
  fields.put("NAME", "NAME".toLowerCase());
  fields.put("COUNTRY_OF_INCORP", "COUNTRY_OF_INCORP".toLowerCase());
  fields.put("ROLE", "ROLE".toLowerCase());
  


}
  
}
