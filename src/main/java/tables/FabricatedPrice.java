package tables;

public class FabricatedPrice extends AbstractTable {

  static {

    addChildClasses(1, FabricatedPrice.class);
  }

  public FabricatedPrice() {
    tableNameOracle = "FABRICATED_PRICE";
    tableNamePostgres = "fabricated_price";
    tableCreaterQuery = "CREATE TABLE" + "public.fabricated_price" + "(" +
        "   isin character varying NOT NULL," +
        "CONSTRAINT fabricated_price_pkey PRIMARY KEY (isin)"+
        ")"+
         "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.fabricated_price OWNER TO postgres;" + ";";

    fields.put("ISIN", "ISIN".toLowerCase());
    
  }

}

