package tables;

public class BacHisResults extends AbstractTable {
  static {
    addChildClasses(0, BacHisResults.class);

  }

  public BacHisResults() {
    tableNameOracle = "BAC_HIST_RESULTS";
    tableNamePostgres = "BAC_HIST_RESULTS".toLowerCase();
    tableCreaterQuery = "CREATE TABLE" + " public.bac_hist_results " +
        "("
        + " country character varying(55) NOT NULL" + ","
        + "sector character varying(255) NOT NULL," +
        "curves_in_order character varying(255) NOT NULL," +
        "flush_timestamp timestamp(6) without time zone NOT NULL," +
        "CONSTRAINT bac_hist_results_pkey PRIMARY KEY (country, sector, flush_timestamp)"
        +
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.bac_hist_results OWNER TO postgres;" + ";";

    fields.put("COUNTRY", "COUNTRY".toLowerCase());
    fields.put("SECTOR", "SECTOR".toLowerCase());
    fields.put("CURVES_IN_ORDER",
        "CURVES_IN_ORDER".toLowerCase());
    fields.put("FLUSH_TIMESTAMP", "FLUSH_TIMESTAMP".toLowerCase());
  }
}