package tables;

public class GeneratedRequestReply  extends AbstractTable {

  static {

    addChildClasses(1, GeneratedRequestReply.class);
  }

  public GeneratedRequestReply() {
    tableNameOracle = "GENERATED_REQUEST_REPLY";
    tableNamePostgres = "generated_request_reply";
    
    tableCreaterQuery = "CREATE TABLE" + "public.generated_request_reply" + "(" +
        "  id character varying NOT NULL," +
        "  type character varying," +
        "    as_of_date timestamp without time zone," +
        "   data text," +
       
         "   CONSTRAINT generated_request_reply_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.generated_request_reply OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("TYPE", "TYPE".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("DATA", "DATA".toLowerCase());


    
    
  }

} 