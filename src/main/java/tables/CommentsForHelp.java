package tables;

public class CommentsForHelp extends AbstractTable {

  static {
    addChildClasses(0, CommentsForHelp.class);
  }

  public CommentsForHelp() {
    tableNameOracle = "COMMENTS_FOR_HELP";
    tableNamePostgres = "comments_for_help";

    fields.put("ID", "ID".toLowerCase());
    fields.put("FIELD_ID", "FIELD_ID".toLowerCase());
    fields.put("USER_ID", "USER_ID".toLowerCase());
    fields.put("COMMENT_TIME", "COMMENT_TIME".toLowerCase());
    fields.put("COMMENT_TEXT", "COMMENT_TEXT".toLowerCase());


  }
}
