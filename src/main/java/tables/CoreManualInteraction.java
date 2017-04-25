package tables;

public class CoreManualInteraction extends AbstractTable {

  static {
    addChildClasses(0, CoreManualInteraction.class);
  }

  public CoreManualInteraction() {
    tableNameOracle = "COR_MANUAL_INTERACTION";
    tableNamePostgres = "cor_manual_interaction";
    
    tableCreaterQuery = "CREATE TABLE" + "public.core_manual_interaction" + "(" +
        "   id character varying NOT NULL," +
        "   isin character varying," +
        "  country_of_risk character varying," +
        "   occurencies double precision," +
        "   national_user character varying," +
        "   national_user_name character varying," +
        "CONSTRAINT core_manual_interaction_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.core_manual_interaction OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("ISIN", "ISIN".toLowerCase());
    fields.put("COUNTRY_OF_RISK", "COUNTRY_OF_RISK".toLowerCase());
    fields.put("OCCURENCIES", "OCCURENCIES".toLowerCase());
    fields.put("NOTIONAL_ISSUER", "NOTIONAL_ISSUER".toLowerCase());
    fields.put("NOTIONAL_ISSUER_NAME", "NOTIONAL_ISSUER_NAME".toLowerCase());

  }
}
