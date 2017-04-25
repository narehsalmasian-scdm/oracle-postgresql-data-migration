package tables;

public class BriefInfoData extends AbstractTable{

  static {
    addChildClasses(0, BriefInfoData.class);
  }

  public BriefInfoData() {
    tableNameOracle = "BRIEF_INFO_DATA";
    tableNamePostgres = "BRIEF_INFO_DATA".toLowerCase();
    
    tableCreaterQuery = "CREATE TABLE" + "public.brief_info_data" + "(" +
        "id character varying(255) NOT NULL," +
        "report_file_id character varying(255)," +
        "as_of_date timestamp without time zone," +
        "reactivated_count integer," +
        "matured_count integer," +
        "new_count integer," +
        "updated_count integer," +
        "relisted_count integer," +
        " delisted_count integer," +
        " total_input_count integer," +
        " warning_count integer," +
        "processed_count integer," +
        "CONSTRAINT brief_info_data_pkey PRIMARY KEY (id)" +
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.brief_info_data OWNER TO postgres;" + ";";

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