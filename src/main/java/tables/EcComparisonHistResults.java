package tables;

public class EcComparisonHistResults extends  AbstractTable {

  static {
    addChildClasses(0, EcComparisonHistResults.class);
  }

  public EcComparisonHistResults() {
    tableNameOracle = "EC_COMPARISON_HIST_RESULTS";
    tableNamePostgres = "ec_comparison_hist_results";
    
    tableCreaterQuery = "CREATE TABLE" + "public.ec_comparison_hist_results" + "(" +
        "  country character varying NOT NULL," +
        " sector character varying NOT NULL," +
        " is_consistent character(1)," +
        " failure_year_fraction double precision," +
        " reason character varying," +
        " flush_timestamp timestamp without time zone NOT NULL,"+
        "CONSTRAINT ec_comparison_hist_results_pkey PRIMARY KEY (country, sector, flush_timestamp)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.ec_comparison_hist_results OWNER TO postgres;" + ";";


    fields.put("COUNTRY", "COUNTRY".toLowerCase());
    fields.put("SECTOR", "SECTOR".toLowerCase());
    fields.put("IS_CONSISTENT", "IS_CONSISTENT".toLowerCase());
    fields.put("FAILURE_YEAR_FRACTION", "FAILURE_YEAR_FRACTION".toLowerCase());
    fields.put("REASON", "REASON".toLowerCase());
    fields.put("FLUSH_TIMESTAMP", "FLUSH_TIMESTAMP".toLowerCase());
    
    
  }
}
