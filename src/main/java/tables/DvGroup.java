package tables;

public class DvGroup extends  AbstractTable {

  static {
    addChildClasses(0, DvGroup.class);
  }

  public DvGroup() {
    tableNameOracle = "DV_GROUP";
    tableNamePostgres = "dv_group";
    
    tableCreaterQuery = "CREATE TABLE" + "public.dv_group" + "(" +
        "  id character varying NOT NULL," +
        "  security_id character varying," +
        "  element_id character varying," +
        "  field_name character varying," +
        "  group_name character varying," +
        "  CONSTRAINT dv_group_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.dv_group OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("ELEMENT_ID", "ELEMENT_ID".toLowerCase());
    fields.put("FIELD_NAME", "FIELD_NAME".toLowerCase());
    fields.put("GROUP_NAME", "GROUP_NAME".toLowerCase());

  }
}