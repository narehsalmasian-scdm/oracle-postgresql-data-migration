package tables;

public class ForwardCurve extends AbstractTable {

  static {

    addChildClasses(1, ForwardCurve.class);
  }

  public ForwardCurve() {
    tableNameOracle = "FORWARD_CURVE";
    tableNamePostgres = "forward_curve";
    
    tableCreaterQuery = "CREATE TABLE" + "public.forward_curve" + "(" +
        "   index_name character varying NOT NULL," +
        "  curve_type character varying," +
        "   forward_type character varying," +
        "   object character varying," +
        "   nss_day_count_conversion character varying," +
        "    index_day_count_convention character varying," +
        "  tenor double precision," +
        
         "   tenor_code character varying," +
         " spot_offset double precision," +
         "  fixing_offset double precision," +
         "  currency character varying," +
         "   is_fake character(1)," +
         " CONSTRAINT forward_curve_pkey PRIMARY KEY (index_name)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.forward_curve OWNER TO postgres;" + ";";

    fields.put("INDEX_NAME", "INDEX_NAME".toLowerCase());
    fields.put("CURVE_TYPE", "CURVE_TYPE".toLowerCase());
    fields.put("FORWARDS_TYPE", "FORWARDS_TYPE".toLowerCase());
    fields.put("OBJECT", "OBJECT".toLowerCase());
    fields.put("NSS_DAY_COUNT_CONVENTION", "NSS_DAY_COUNT_CONVENTION".toLowerCase());
    fields.put("INDEX_DAY_COUNT_CONVENTION", "INDEX_DAY_COUNT_CONVENTION".toLowerCase());
    fields.put("TENOR", "TENOR".toLowerCase());
    fields.put("TENOR_CODE", "TENOR_CODE".toLowerCase());
    fields.put("SPOT_OFFSET", "SPOT_OFFSET".toLowerCase());
    fields.put("FIXING_OFFSET", "FIXING_OFFSET".toLowerCase());
    fields.put("CURRENCY", "CURRENCY".toLowerCase());
    fields.put("IS_FAKE", "IS_FAKE".toLowerCase());

    
    
  }

}
