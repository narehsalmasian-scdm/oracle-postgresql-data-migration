package tables;

public class CountryCdsSpread extends AbstractTable {

  static {
    addChildClasses(0, CountryCdsSpread.class);
  }

  public CountryCdsSpread() {
    tableNameOracle = "COUNTRY_CDS_SPREAD";
    tableNamePostgres = "country_cds_spread";
    
    tableCreaterQuery = "CREATE TABLE" + "public.country_cds_spread" + "(" +
        "   id character varying NOT NULL," +
        "   as_of_date timestamp without time zone," +
        "  country_code character varying," +
        "    spread double precision," +
        "   is_confirmed character(1)," +
        "    user_id character varying," +
        " CONSTRAINT country_cds_spread_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.country_cds_spread OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("COUNTRY_CODE", "COUNTRY_CODE".toLowerCase());
    fields.put("SPREAD", "SPREAD".toLowerCase());
    fields.put("IS_CONFIRMED", "IS_CONFIRMED".toLowerCase());
    fields.put("USER_ID", "USER_ID".toLowerCase());

  }
}