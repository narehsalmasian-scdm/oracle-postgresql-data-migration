package tables;

public class EadbFileNames extends  AbstractTable {

  static {
    addChildClasses(0, EadbFileNames.class);
  }

  public EadbFileNames() {
    tableNameOracle = "EADB_FILE_NAMES";
    tableNamePostgres = "eadb_file_names";
    
    tableCreaterQuery = "CREATE TABLE" + "public.eadb_file_names" + "(" +
        "  id character varying NOT NULL," +
        " file_name character varying," +
        " file_id character varying," +
        "  creation_time character varying," +
        "   process_after_nabs_release character(1)," +
        "  CONSTRAINT eadb_file_names_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.eadb_file_names OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("FILE_NAME", "FILE_NAME".toLowerCase());
    fields.put("FILE_ID", "FILE_ID".toLowerCase());
    fields.put("CREATION_TIME", "CREATION_TIME".toLowerCase());
    fields.put("PROCESS_AFTER_NABS_RELEASE", "PROCESS_AFTER_NABS_RELEASE".toLowerCase());
    
  }
}