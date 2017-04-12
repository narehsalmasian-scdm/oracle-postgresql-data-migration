package tables;

public class SecurityComments  extends AbstractTable {
  static {
    addChildClasses(0, SecurityComments.class);

  }

  public SecurityComments() {
    tableNameOracle = "SECURITY_COMMENTS";
    tableNamePostgres = "SECURITY_COMMENTS".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("USER_ID", "USER_ID".toLowerCase());
    fields.put("COMMENT_TIME", "COMMENT_TIME".toLowerCase());
    fields.put("COMMENT_TEXT", "COMMENT_TEXT".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());

    
    
  }
}