package tables;

public class HistoricalEadbGuarantor extends AbstractTable {

  static {

    addChildClasses(1, HistoricalEadbGuarantor.class);
  }

  public HistoricalEadbGuarantor() {
    tableNameOracle = "HISTORICAL_EADB_GUARANTOR";
    tableNamePostgres = "historical_eadb_guarantor";
    
    tableCreaterQuery = "CREATE TABLE" + "public.historical_eadb_guarantor" + "(" +
        "   id character varying," +
        "   eadb_id character varying NOT NULL," +
        "   as_of_date timestamp without time zone," +
        "   lt_guarantor_rating character varying," +
        " lt_guarantor_rating_date timestamp without time zone," +
        "  code character varying," +
        "   guarantor_name character varying," +
        "   other_name character varying," +
        " residence character varying," +
        " guarantor_group character varying," +
        "  pse character varying," +
       
        "CONSTRAINT historical_eadb_guarantor_pkey PRIMARY KEY (eadb_id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.historical_eadb_guarantor OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("EADB_ID", "EADB_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("LT_GUARANTOR_RATING", "LT_GUARANTOR_RATING".toLowerCase());
    fields.put("LT_GUARANTOR_RATING_DATE", "LT_GUARANTOR_RATING_DATE".toLowerCase());
    fields.put("CODE", "CODE".toLowerCase());
    fields.put("GUARANTOR_NAME", "GUARANTOR_NAME".toLowerCase());
    fields.put("OTHER_NAME", "OTHER_NAME".toLowerCase());
    fields.put("RESIDENCE", "RESIDENCE".toLowerCase());
    fields.put("GUARANTOR_GROUP", "GUARANTOR_GROUP".toLowerCase());
    fields.put("PSE", "PSE".toLowerCase());
  }
  }