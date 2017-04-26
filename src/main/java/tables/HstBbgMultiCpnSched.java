package tables;

public class HstBbgMultiCpnSched  extends AbstractTable {

  static {

    addChildClasses(1, HstBbgMultiCpnSched.class);
  }

  public HstBbgMultiCpnSched() {
    tableNameOracle = "HST_BBG_MULTI_CPN_SCHED";
    tableNamePostgres = "hst_bbg_multi_cpn_sched";
    
    tableCreaterQuery = "CREATE TABLE" + "public.hst_bbg_multi_cpn_sched" + "(" +
        "   id double precision NOT NULL," +
        "   entity_id character varying," +
        "  mcs_date timestamp without time zone," +
        "  mcs_amount double precision," +
        " as_of_date timestamp without time zone," +
        " CONSTRAINT hst_bbg_multi_cpn_sched_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.hst_bbg_multi_cpn_sched OWNER TO postgres;" + ";";
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
  fields.put("MCS_DATE", "MCS_DATE".toLowerCase());
  fields.put("MCS_AMOUNT", "MCS_AMOUNT".toLowerCase());
  fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());

}
}