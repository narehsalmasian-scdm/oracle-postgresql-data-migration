package tables;

public class CsvUploadInfo extends  AbstractTable {

  static {
    addChildClasses(0, CsvUploadInfo.class);
  }

  public CsvUploadInfo() {
    tableNameOracle = "CSV_UPLOAD_INFO";
    tableNamePostgres = "csv_upload_info";

    fields.put("ISIN", "ISIN".toLowerCase());
    fields.put("STATUS", "STATUS".toLowerCase());
    fields.put("EMERGENCY_COLLATERAL", "EMERGENCY_COLLATERAL".toLowerCase());

  }
}