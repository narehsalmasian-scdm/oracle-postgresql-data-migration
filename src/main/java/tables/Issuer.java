package tables;

public class Issuer extends AbstractTable {

  static {

    addChildClasses(1, Issuer.class);
  }

  public Issuer() {
    tableNameOracle = "ISSUER";
    tableNamePostgres = "issuer";
    
    
    tableCreaterQuery = "CREATE TABLE" + " public.issuer" + "(" +
        "    id character varying NOT NULL," +
        "    name character varying," +
        "    issuer_group character varying," +
        "    code character varying," +
        "   residence character varying," +
        "  pse character varying," +
        "issuer_group_raw character varying,"+
        "  CONSTRAINT issuer_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE  public.issuer OWNER TO postgres;" + ";";
  
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("NAME", "NAME".toLowerCase());
  fields.put("ISSUER_GROUP", "ISSUER_GROUP".toLowerCase());
  fields.put("CODE", "CODE".toLowerCase());
  fields.put("RESIDENCE", "RESIDENCE".toLowerCase());
  fields.put("PSE", "PSE".toLowerCase());
  fields.put("ISSUER_GROUP_RAW", "ISSUER_GROUP_RAW".toLowerCase());
  


}
}