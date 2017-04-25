package tables;

public class EconomicConsistency extends  AbstractTable {

  static {
    addChildClasses(0, EconomicConsistency.class);
  }

  public EconomicConsistency() {
    tableNameOracle = "ECONOMIC_CONSISTENCY";
    tableNamePostgres = "economic_consistency";
    
    tableCreaterQuery = "CREATE TABLE" + "public.economic_consistency" + "(" +
        "    id character varying NOT NULL," +
        " sector character varying," +
        " country character varying," +
        " ranking character varying," +
        " step_2 character varying," +
        "step_3 character varying,"+
        "as_of_date timestamp without time zone,"+
        "  CONSTRAINT economic_consistency_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.economic_consistency OWNER TO postgres;" + ";";


    fields.put("ID", "ID".toLowerCase());
    fields.put("SECTOR", "SECTOR".toLowerCase());
    fields.put("COUNTRY", "COUNTRY".toLowerCase());
    fields.put("RANKING", "RANKING".toLowerCase());
    fields.put("STEP_2", "STEP_2".toLowerCase());
    fields.put("STEP_3", "STEP_3".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    
    
  }
}
