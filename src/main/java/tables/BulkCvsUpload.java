package tables;

public class BulkCvsUpload extends AbstractTable {

  static {
    addChildClasses(0, BulkCvsUpload.class);
  }

  public BulkCvsUpload() {
    tableNameOracle = "BULK_CSV_UPLOAD";
    tableNamePostgres = "BULK_CSV_UPLOAD".toLowerCase();

    fields.put("ID", "ID".toLowerCase());
    fields.put("USER_ID", "USER_ID".toLowerCase());
    fields.put("STATUS", "STATUS".toLowerCase());
    fields.put("UPLOAD_DATE", "UPLOAD_DATE".toLowerCase());

  }
}
