package tables;

public class CsvUploadInfo extends  AbstractTable {

  static {
    addChildClasses(0, CsvUploadInfo.class);
  }

  public CsvUploadInfo() {
    tableNameOracle = "CSV_UPLOAD_INFO";
    tableNamePostgres = "csv_upload_info";
    
    tableCreaterQuery = "CREATE TABLE" + "public.csv_upload_info" + "(" +
        "   isin character varying NOT NULL," +
        "   status character varying," +
        "  emergency_collateral character(1)," +
        " CONSTRAINT csv_upload_info_pkey PRIMARY KEY (isin)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.csv_upload_info OWNER TO postgres;" + ";";

    fields.put("ISIN", "ISIN".toLowerCase());
    fields.put("STATUS", "STATUS".toLowerCase());
    fields.put("EMERGENCY_COLLATERAL", "EMERGENCY_COLLATERAL".toLowerCase());

  }
}