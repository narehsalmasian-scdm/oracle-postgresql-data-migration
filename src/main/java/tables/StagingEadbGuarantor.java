package tables;

public class StagingEadbGuarantor extends AbstractTable {
  static {
    addChildClasses(0, StagingEadbGuarantor.class);

  }

  public StagingEadbGuarantor() {
    tableNameOracle = "STAGING_EADB_GUARANTOR";
    tableNamePostgres = "STAGING_EADB_GUARANTOR".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("EADB_ID", "EADB_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("LT_GUARANTOR_RATING", "LT_GUARANTOR_RATING".toLowerCase());
    fields.put("LT_GUARANTOR_RATING_DATE", "LT_GUARANTOR_RATING_DATE".toLowerCase());
    fields.put("CODE", "CODE".toLowerCase());
    fields.put("GUARANTOR_NAME", "GUARANTOR_NAME".toLowerCase());
    fields.put("OTHER_NAME", "OTHER_NAME".toLowerCase());
    fields.put("RESIDENCE", "RESIDENCE".toLowerCase());
    fields.put("GUARANTOR_GROUP", "GUARANTOR_GROUP".toLowerCase());
    
    fields.put("MATURITY", "MATURITY".toLowerCase());
  }
}