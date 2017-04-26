package tables;

public class HistoricalEadbIssuer  extends AbstractTable {

  static {

    addChildClasses(1, HistoricalEadbIssuer.class);
  }

  public HistoricalEadbIssuer() {
    tableNameOracle = "HISTORICAL_EADB_ISSUER";
    tableNamePostgres = "historical_eadb_issuer";
    tableCreaterQuery = "CREATE TABLE" + "public.historical_eadb_issuer" + "(" +
        "    id character varying," +
        "   eadb_id character varying," +
        "   st_issuer_rating character varying," +
        "   st_issuer_rating_date timestamp without time zone," +
        " lt_issuer_rating character varying," +
        " lt_issuer_rating_date timestamp without time zone," +
        "   code character varying," +
        "  issuer_name character varying," +
        "  other_name character varying," +
        " residence character varying," +
        "   issuer_group character varying," +
        " pse character varying,"+
        "issuer_group_raw character varying,"+
       
        "CONSTRAINT historical_eadb_issuer_eadb_id_fkey FOREIGN KEY (eadb_id)"+
        " REFERENCES public.historical_eadb_data (id) MATCH SIMPLE"+
        "ON UPDATE NO ACTION ON DELETE NO ACTION"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.historical_eadb_issuer OWNER TO postgres;" + ";";
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("EADB_ID", "EADB_ID".toLowerCase());
  fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
  fields.put("ST_ISSUER_RATING", "ST_ISSUER_RATING".toLowerCase());
  fields.put("ST_ISSUER_RATING_DATE", "ST_ISSUER_RATING_DATE".toLowerCase());
  fields.put("LT_ISSUER_RATING", "LT_ISSUER_RATING".toLowerCase());
  fields.put("LT_ISSUER_RATING_DATE", "LT_ISSUER_RATING_DATE".toLowerCase());
  fields.put("CODE", "CODE".toLowerCase());
  fields.put("ISSUER_NAME", "ISSUER_NAME".toLowerCase());
  fields.put("OTHER_NAME", "OTHER_NAME".toLowerCase());
  fields.put("RESIDENCE", "RESIDENCE".toLowerCase());
  fields.put("ISSUER_GROUP", "ISSUER_GROUP".toLowerCase());
  fields.put("PSE", "PSE".toLowerCase());
  fields.put("ISSUER_GROUP_RAW", "ISSUER_GROUP_RAW".toLowerCase());


}
  
}
