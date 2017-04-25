package tables;

public class EcComparisonResults extends  AbstractTable {

  static {
    addChildClasses(0, EcComparisonResults.class);
  }

  public EcComparisonResults() {
    tableNameOracle = "EC_COMPARISON_RESULTS";
    tableNamePostgres = "ec_comparison_results";
    
    tableCreaterQuery = "CREATE TABLE" + "public.ec_comparison_results" + "(" +
        "  country character varying NOT NULL," +
        " sector character varying NOT NULL," +
        " is_consistent character(1)," +
        " failure_year_fraction double precision," +
        " reason character varying," +
        " CONSTRAINT ec_comparison_results_pkey PRIMARY KEY (sector, country)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.ec_comparison_results OWNER TO postgres;" + ";";


    fields.put("COUNTRY", "COUNTRY".toLowerCase());
    fields.put("SECTOR", "SECTOR".toLowerCase());
    fields.put("IS_CONSISTENT", "IS_CONSISTENT".toLowerCase());
    fields.put("FAILURE_YEAR_FRACTION", "FAILURE_YEAR_FRACTION".toLowerCase());
    fields.put("REASON", "REASON".toLowerCase());
    
    
  }
}

