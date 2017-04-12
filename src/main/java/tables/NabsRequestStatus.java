package tables;

public class NabsRequestStatus extends AbstractTable {
  static {
    addChildClasses(0, NabsRequestStatus.class);

  }

  public NabsRequestStatus() {
    tableNameOracle = "NABS_REQUEST_STATUS";
    tableNamePostgres = "NABS_REQUEST_STATUS".toLowerCase();
    fields.put("REQUEST_ID", "REQUEST_ID".toLowerCase());
    fields.put("REQUEST_TYPE", "REQUEST_TYPE".toLowerCase());
    fields.put("REQUEST_DATE_TIME", "REQUEST_DATE_TIME".toLowerCase());
    fields.put("REQUEST_DATA", "REQUEST_DATA".toLowerCase());
    fields.put("STORAGE_STATUS", "STORAGE_STATUS".toLowerCase());
    
  }
}
