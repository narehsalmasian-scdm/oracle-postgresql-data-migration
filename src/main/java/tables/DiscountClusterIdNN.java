package tables;

public class DiscountClusterIdNN extends  AbstractTable {

  static {
    addChildClasses(0, DiscountClusterIdNN.class);
  }

  public DiscountClusterIdNN() {
    tableNameOracle = "DISCOUNT_CLUSTER";
    tableNamePostgres = "discount_cluster";
    
    tableCreaterQuery = "CREATE TABLE" + "public.discount_cluster" + "(" +
        "  id character varying NOT NULL," +
        "  as_of_date timestamp without time zone," +
        "  name character varying," +
        "  is_broad character(1)," +
        "   b0 double precision," +
        "   b1 double precision," +
        "   b2 double precision," +
        "   b3 double precision," +
        "   bl0 double precision," +
        "   bl1 double precision," +
        " CONSTRAINT discount_cluster_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.discount_cluster OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("NAME", "NAME".toLowerCase());
    fields.put("IS_BROAD", "IS_BROAD".toLowerCase());
    fields.put("B0", "B0".toLowerCase());
    fields.put("B1", "B1".toLowerCase());
    fields.put("B2", "B2".toLowerCase());
    fields.put("B3", "B3".toLowerCase());
    fields.put("L0", "L0".toLowerCase());
    fields.put("L1", "L1".toLowerCase());


  }
}