package tables;

public class CommentsForHelp extends AbstractTable {

  static {
    addChildClasses(0, CommentsForHelp.class);
  }

  public CommentsForHelp() {
    tableNameOracle = "COMMENTS_FOR_HELP";
    tableNamePostgres = "comments_for_help";
    
    tableCreaterQuery = "CREATE TABLE" + "public.comments_for_help" + "(" +
        "   id character varying," +
        "   field_id character varying," +
        "   user_id character varying," +
        "   comment_time timestamp without time zone," +
        "   comment_text character varying" +
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.comments_for_help OWNER TO postgres;" + ";";
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("FIELD_ID", "FIELD_ID".toLowerCase());
    fields.put("USER_ID", "USER_ID".toLowerCase());
    fields.put("COMMENT_TIME", "COMMENT_TIME".toLowerCase());
    fields.put("COMMENT_TEXT", "COMMENT_TEXT".toLowerCase());


  }
}
