package tables;

public class BacResults extends AbstractTable{
  
  static {
    addChildClasses(0, BacResults.class);

  }
   public BacResults(){
     tableNameOracle = "BAC_RESULTS";
     tableNamePostgres = "BAC_RESULTS".toLowerCase();
     tableCreaterQuery = "CREATE TABLE" + "public.bac_results" +
         "("
         + " country character varying(55) NOT NULL,"+
        " sector character varying(55) NOT NULL,"
         + "curves_in_order character varying(55),"+
         "CONSTRAINT bac_results_pkey PRIMARY KEY (country, sector)"
         +
         ")"
         + "WITH (OIDS=FALSE);"
         + "ALTER TABLE public.bac_results OWNER TO postgres;" + ";";

     fields.put("COUNTRY", "COUNTRY".toLowerCase());
     fields.put("SECTOR", "SECTOR".toLowerCase());
     fields.put("CURVES_IN_ORDER", "CURVES_IN_ORDER".toLowerCase());
   }
  
}
