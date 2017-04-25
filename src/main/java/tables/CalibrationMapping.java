package tables;

public class CalibrationMapping extends AbstractTable {

  static {
    addChildClasses(0, CalibrationMapping.class);
  }

  public CalibrationMapping() {
    tableNameOracle = "CALIBRATION_MAPPING";
    tableNamePostgres = "CALIBRATION_MAPPING".toLowerCase();
    
    tableCreaterQuery = "CREATE TABLE" + "public.calibration_mapping" + "(" +
        " index_name character varying(30) NOT NULL," +
        " bbg_ticker_name character varying(20) NOT NULL," +
        " formula character varying(500)," +
        "CONSTRAINT calibration_mapping_pkey PRIMARY KEY (index_name, bbg_ticker_name)" +
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.calibration_mapping OWNER TO postgres;" + ";";

    fields.put("INDEX_NAME", "INDEX_NAME".toLowerCase());
    fields.put("BBG_TICKER_NAME", "BBG_TICKER_NAME".toLowerCase());
    fields.put("FORMULA", "FORMULA".toLowerCase());


  }
}
