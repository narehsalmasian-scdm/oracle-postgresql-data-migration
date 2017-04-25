package tables;

public class FepPrice extends AbstractTable {

  static {

    addChildClasses(1, FepPrice.class);
  }

  public FepPrice() {
    tableNameOracle = "FEP_PRICE";
    tableNamePostgres = "fep_price";
    
    tableCreaterQuery = "CREATE TABLE" + "public.fep_price" + "(" +
        "   id double precision NOT NULL," +
        "    security_id character varying," +
        "   as_of_date timestamp without time zone," +
        "    clean_price double precision," +
        "   accrued_interest double precision," +
        "   pool_factor double precision," +
        "  fep_type character varying," +
        
         "  clean_price_diss double precision," +
         "  accrued_interest_diss double precision," +
         "  warning_code character varying," +
         "  clean_price_md double precision," +
         "  accrued_interest_md double precision," +
         "   clean_price_inflation double precision," +
         "  accrued_interest_inflation double precision," +
         " CONSTRAINT fep_price_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.fep_price OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("CLEAN_PRICE", "CLEAN_PRICE".toLowerCase());
    fields.put("ACCRUED_INTEREST", "ACCRUED_INTEREST".toLowerCase());
    fields.put("POOL_FACTOR", "POOL_FACTOR".toLowerCase());
    fields.put("FEP_TYPE", "FEP_TYPE".toLowerCase());
    fields.put("CLEAN_PRICE_DISS", "CLEAN_PRICE_DISS".toLowerCase());
    fields.put("ACCRUED_INTEREST_DISS", "ACCRUED_INTEREST_DISS".toLowerCase());
    fields.put("WARNING_CODE", "WARNING_CODE".toLowerCase());
    fields.put("CLEAN_PRICE_MD", "CLEAN_PRICE_MD".toLowerCase());
    fields.put("ACCRUED_INTEREST_MD", "ACCRUED_INTEREST_MD".toLowerCase());
    fields.put("CLEAN_PRICE_INFLATION", "CLEAN_PRICE_INFLATION".toLowerCase());
    fields.put("ACCRUED_INTEREST_INFLATION", "ACCRUED_INTEREST_INFLATION".toLowerCase());
    
    
  }

}
