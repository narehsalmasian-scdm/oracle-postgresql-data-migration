package tables;

public class ReportContainer extends AbstractTable {
  static {
    addChildClasses(0, ReportContainer.class);

  }

  public ReportContainer() {
    tableNameOracle = "REPORT_CONTAINER";
    tableNamePostgres = "REPORT_CONTAINER".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("DATA", "DATA".toLowerCase());
    fields.put("TYPE", "TYPE".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());

    
    
  }
}