package tables;

public class CcxCore extends AbstractTable {

  static {
    addChildClasses(0, CcxCore.class);
  }

  public CcxCore() {
    tableNameOracle = "CCX_CORE";
    tableNamePostgres = "ccx_core";
    
    tableCreaterQuery = "CREATE TABLE" + "public.ccx_core" + "(" +
        " id character varying NOT NULL," +
        " ccx_curve_name character varying," +
        "  type character varying," +
        "  forwards_type character varying," +
        "  day_count_conversion character varying," +
        "  object character varying," +
        "  currency character varying," +
        "CONSTRAINT ccx_core_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.ccx_core OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("CCX_CURVE_NAME", "CCX_CURVE_NAME".toLowerCase());
    fields.put("TYPE", "TYPE".toLowerCase());
    fields.put("FORWARDS_TYPE", "FORWARDS_TYPE".toLowerCase());
    fields.put("DAY_COUNT_CONVENTION", "DAY_COUNT_CONVENTION".toLowerCase());
    fields.put("OBJECT", "OBJECT".toLowerCase());
    fields.put("CURRENCY", "CURRENCY".toLowerCase());


  }
}
