package tables;

public class GeneratedRequestReply  extends AbstractTable {

  static {

    addChildClasses(1, GeneratedRequestReply.class);
  }

  public GeneratedRequestReply() {
    tableNameOracle = "GENERATED_REQUEST_REPLY";
    tableNamePostgres = "generated_request_reply";

    fields.put("ID", "ID".toLowerCase());
    fields.put("TYPE", "TYPE".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("DATA", "DATA".toLowerCase());


    
    
  }

} 