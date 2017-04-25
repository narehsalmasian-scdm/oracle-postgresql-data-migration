package tables;

public class Guarantor extends AbstractTable {

  static {

    addChildClasses(1, Guarantor.class);
  }

  public Guarantor() {
    tableNameOracle = "GUARANTOR";
    tableNamePostgres = "guarantor";
    
    tableCreaterQuery = "CREATE TABLE" + "public.guarantor" + "(" +
        "  id character varying NOT NULL," +
        "   percentage double precision," +
        "   reference_entity_id character varying," +
        "   guarantor_group character varying," +
        "    code character varying," +
        "   residence character varying," +
        "   other_name character varying," +
        "  pse character varying," +
        " CONSTRAINT guarantor_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.guarantor OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("PERCENTAGE", "PERCENTAGE".toLowerCase());
    fields.put("REFERENCE_ENTITY_ID", "REFERENCE_ENTITY_ID".toLowerCase());
    fields.put("GUARANTOR_GROUP", "GUARANTOR_GROUP".toLowerCase());
    fields.put("CODE", "CODE".toLowerCase());
    fields.put("RESIDENCE", "RESIDENCE".toLowerCase());
    fields.put("OTHER_NAME", "OTHER_NAME".toLowerCase());
    fields.put("PSE", "PSE".toLowerCase());

  }

} 