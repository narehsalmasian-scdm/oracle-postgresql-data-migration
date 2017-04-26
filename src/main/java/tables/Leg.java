package tables;

public class Leg extends AbstractTable {
  static {
    addChildClasses(0, Leg.class);

  }

  public Leg() {
    tableNameOracle = "LEG";
    tableNamePostgres = "LEG".toLowerCase();
    
    tableCreaterQuery = "CREATE TABLE" + "public.leg" + "(" +
        "    id character varying NOT NULL," +
        "   security_id character varying," +
        "   type character varying," +
        "   formula character varying," +
        "   payment_currency character varying," +
        "  start_date timestamp without time zone," +

        "     end_date timestamp without time zone," +
        "  day_count_convention character varying," +
        "  payment_frequency character varying," +
        "  payment_distribution character varying," +
        "  fixing_days_prior double precision," +
        "  payment_month character varying," +

        "    payment_day double precision," +
        "    ex_coupon_lag double precision," +
        "   fixing_method character varying," +
        "    coupon_usage character varying," +
        "    first_payment_date timestamp without time zone," +
        "   floor double precision," +

        "   cap double precision," +
        "   applicable character(1)," +
        "  security_version double precision NOT NULL," +
        "   is_active character(1)," +
        "  created_date timestamp without time zone," +
        "  created_by character varying," +
        "   business_day_convention character varying," +
        "   is_fpd_resolved character(1)," +
        "  CONSTRAINT leg_pkey PRIMARY KEY (id, security_version)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.leg OWNER TO postgres;" + ";";
    

    fields.put("ID", "ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("TYPE",
        "TYPE".toLowerCase());
    fields.put("FORMULA", "FORMULA".toLowerCase());
    fields.put("PAYMENT_CURRENCY", "PAYMENT_CURRENCY".toLowerCase());
    fields.put("START_DATE", "START_DATE".toLowerCase());
    fields.put("END_DATE",
        "END_DATE".toLowerCase());
    fields.put("DAY_COUNT_CONVENTION", "DAY_COUNT_CONVENTION".toLowerCase());
    fields.put("PAYMENT_FREQUENCY", "PAYMENT_FREQUENCY".toLowerCase());
    fields.put("PAYMENT_DISTRIBUTION", "PAYMENT_DISTRIBUTION".toLowerCase());
    fields.put("FIXING_DAYS_PRIOR",
        "FIXING_DAYS_PRIOR".toLowerCase());
    fields.put("PAYMENT_MONTH", "PAYMENT_MONTH".toLowerCase());
    fields.put("PAYMENT_DAY", "PAYMENT_DAY".toLowerCase());
    fields.put("EX_COUPON_LAG", "EX_COUPON_LAG".toLowerCase());
    fields.put("FIXING_METHOD",
        "FIXING_METHOD".toLowerCase());
    fields.put("COUPON_USAGE", "COUPON_USAGE".toLowerCase()); 
    
    fields.put("FIRST_PAYMENT_DATE", "FIRST_PAYMENT_DATE".toLowerCase());
    fields.put("FLOOR", "FLOOR".toLowerCase());
    fields.put("CAP",
        "CAP".toLowerCase());
    fields.put("APPLICABLE", "APPLICABLE".toLowerCase());
    
   fields.put("SECURITY_VERSION", "SECURITY_VERSION".toLowerCase()); 
    
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
    fields.put("CREATED_DATE", "CREATED_DATE".toLowerCase());
    fields.put("CREATED_BY",
        "CREATED_BY".toLowerCase());
    fields.put("BUSINESS_DAY_CONVENTION", "BUSINESS_DAY_CONVENTION".toLowerCase());
    fields.put("IS_FPD_RESOLVED", "IS_FPD_RESOLVED".toLowerCase());
  }
}