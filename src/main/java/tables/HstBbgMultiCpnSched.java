package tables;

public class HstBbgMultiCpnSched  extends AbstractTable {

  static {

    addChildClasses(1, HstBbgMultiCpnSched.class);
  }

  public HstBbgMultiCpnSched() {
    tableNameOracle = "HST_BBG_MULTI_CPN_SCHED";
    tableNamePostgres = "hst_bbg_multi_cpn_sched";
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
  fields.put("MCS_DATE", "MCS_DATE".toLowerCase());
  fields.put("MCS_AMOUNT", "MCS_AMOUNT".toLowerCase());
  fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());

}
}