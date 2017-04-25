package tables;

public class AdjustMO extends AbstractTable {
  static {
    addChildClasses(0, AdjustMO.class);
  }

  public AdjustMO() {
    tableNameOracle = "ADJUST_MO";
    tableNamePostgres = "adjust_mo";
    
    tableCreaterQuery = "CREATE TABLE" + " public.adjust_mo " +
        "("
        + "id bigint NOT NULL,"+
       " principal double precision" + ","
        + "cap double precision" + ","+
        "floor double precision" + "," +
        "callable double precision" + "," +
        "make_whole_call double precision" + "," +
        "putable double precision" + ","+
        "extendible double precision" + "," +
        "extendible_by_default double precision,"+
        "sinkable double precision,"+
       " amortizing double precision,"+
        "inflation double precision,"+
        "fungible double precision,"+
        "leg_id character varying(255),"+
        "payment_date timestamp without time zone,"+
        "interest character varying(4000)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.adjust_mo OWNER TO postgres;" + ";";
    
    
    
    
    fields.clear();
    fields.put("ID", "ID".toLowerCase());
    fields.put("PAYMENT_DATE", "PAYMENT_DATE".toLowerCase());
    fields.put("INTEREST", "INTEREST".toLowerCase());
    fields.put("PRINCIPAL", "PRINCIPAL".toLowerCase());
    fields.put("CAP", "CAP".toLowerCase());
    fields.put("FLOOR", "FLOOR".toLowerCase());
    fields.put("CALLABLE", "CALLABLE".toLowerCase());
    fields.put("MAKE_WHOLE_CALL", "MAKE_WHOLE_CALL".toLowerCase());
    fields.put("PUTABLE", "PUTABLE".toLowerCase());
    fields.put("EXTENDIBLE", "EXTENDIBLE".toLowerCase());
    fields.put("EXTENDIBLE_BY_DEFAULT", "EXTENDIBLE_BY_DEFAULT".toLowerCase());
    fields.put("SINKABLE", "SINKABLE".toLowerCase());
    fields.put("AMORTIZING", "AMORTIZING".toLowerCase());
    fields.put("INFLATION", "INFLATION".toLowerCase());
    fields.put("FUNGIBLE", "FUNGIBLE".toLowerCase());
    fields.put("LEG_ID", "LEG_ID".toLowerCase());
  }
}
