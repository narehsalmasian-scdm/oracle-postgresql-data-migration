package tables;

public class DefaultValueField extends  AbstractTable {

  static {
    addChildClasses(0, DefaultValueField.class);
  }

  public DefaultValueField() {
    tableNameOracle = "DEFAULT_VALUE_FIELD";
    tableNamePostgres = "default_value_field";
    
    tableCreaterQuery = "CREATE TABLE" + "public.default_value_field" + "(" +
        "  id character varying NOT NULL," +
        "   isin character varying," +
        " field_name character varying," +
        "  element_id character varying," +
        "  group_name character varying," +
        " CONSTRAINT default_value_field_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.default_value_field OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("ISIN", "ISIN".toLowerCase());
    fields.put("FIELD_NAME", "FIELD_NAME".toLowerCase());
    fields.put("ELEMENT_ID", "ELEMENT_ID".toLowerCase());

  }
}