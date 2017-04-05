package tables;

public class BriefInfoData extends AbstractTable{

  static {
    addChildClasses(0, BriefInfoData.class);
  }

  public BriefInfoData() {
    tableNameOracle = "BRIEF_INFO_DATA";
    tableNamePostgres = "BRIEF_INFO_DATA".toLowerCase();

    fields.put("ID", "ID".toLowerCase());
    fields.put("REPORT_FILE_ID", "REPORT_FILE_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("REACTIVATED_COUNT", "REACTIVATED_COUNT".toLowerCase());
    fields.put("MATURED_COUNT", "MATURED_COUNT".toLowerCase());
    fields.put("NEW_COUNT", "NEW_COUNT".toLowerCase());
    fields.put("UPDATED_COUNT", "UPDATED_COUNT".toLowerCase());
    fields.put("RELISTED_COUNT", "RELISTED_COUNT".toLowerCase());
    fields.put("DELISTED_COUNT", "DELISTED_COUNT".toLowerCase());
    fields.put("TOTAL_INPUT_COUNT", "TOTAL_INPUT_COUNT".toLowerCase());
    fields.put("WARNING_COUNT", "WARNING_COUNT".toLowerCase());
    fields.put("PROCESSED_COUNT", "PROCESSED_COUNT".toLowerCase());
    
    
  }
}