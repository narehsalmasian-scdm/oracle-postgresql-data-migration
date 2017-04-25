package tables;

public class CapletCore extends AbstractTable {

  static {
    addChildClasses(0, CapletCore.class);

  }

  public CapletCore() {
    tableNameOracle = "CAPLET_CORE";
    tableNamePostgres = "caplet_core";
    
    tableCreaterQuery = "CREATE TABLE" + "public.caplet_core" + "(" +
        " caplet_name character varying," +
        "caplet_type character varying," +
        " volatility_type character varying," +
        "  caplet_index character varying," +
        "  day_count_convention character varying," +
        " tenor_code character varying," +
        " discount_curve character varying," +
        " forward_curve character varying" +
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.caplet_core OWNER TO postgres;" + ";";

    fields.put("CAPLET_NAME", "CAPLET_NAME".toLowerCase());
    fields.put("CAPLET_TYPE", "CAPLET_TYPE".toLowerCase());
    fields.put("CAPLET_INDEX", "CAPLET_INDEX".toLowerCase());
    fields.put("DAY_COUNT_CONVENTION", "DAY_COUNT_CONVENTION".toLowerCase());
    fields.put("TENOR_CODE", "TENOR_CODE".toLowerCase());
    fields.put("DISCOUNT_CURVE", "DISCOUNT_CURVE".toLowerCase());
    fields.put("FORWARD_CURVE", "FORWARD_CURVE".toLowerCase());
  }
}
