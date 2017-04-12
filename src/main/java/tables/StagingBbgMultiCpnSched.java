package tables;

public class StagingBbgMultiCpnSched extends AbstractTable {
  static {
    addChildClasses(0, StagingBbgMultiCpnSched.class);

  }

  public StagingBbgMultiCpnSched() {
    tableNameOracle = "STAGING_BBG_MULTI_CPN_SCHED";
    tableNamePostgres = "STAGING_BBG_MULTI_CPN_SCHED".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("MCS_DATE", "MCS_DATE".toLowerCase());
    fields.put("MCS_AMOUNT", "MCS_AMOUNT".toLowerCase());


    
  }
}
