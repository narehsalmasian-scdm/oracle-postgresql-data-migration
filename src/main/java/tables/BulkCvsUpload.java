package tables;

public class BulkCvsUpload extends AbstractTable {

  static {
    addChildClasses(0, BulkCvsUpload.class);
  }

  public BulkCvsUpload() {
    tableNameOracle = "BULK_CSV_UPLOAD";
    tableNamePostgres = "BULK_CSV_UPLOAD".toLowerCase();
    
    tableCreaterQuery = "CREATE TABLE" + "public.bulk_csv_uploaded" + "(" +
        " id character varying(255) NOT NULL," +
        " user_id character varying(255)," +
        " status text," +
        "upload_date timestamp without time zone," +
        "CONSTRAINT bulk_csv_uploaded_pkey PRIMARY KEY (id)" +
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.bulk_csv_uploaded OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("USER_ID", "USER_ID".toLowerCase());
    fields.put("STATUS", "STATUS".toLowerCase());
    fields.put("UPLOAD_DATE", "UPLOAD_DATE".toLowerCase());

  }
}
