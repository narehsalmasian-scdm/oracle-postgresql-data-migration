package tables;

public class ForwardCurveParams extends AbstractTable {

  static {

    addChildClasses(1, ForwardCurveParams.class);
  }

  public ForwardCurveParams() {
    tableNameOracle = "FORWARD_CURVE_PARAMS";
    tableNamePostgres = "forward_curve_params";
    
    tableCreaterQuery = "CREATE TABLE" + "public.forward_curve_params" + "(" +
        "   index_name character varying NOT NULL," +
        "  reference_date timestamp without time zone NOT NULL," +
        "    b0 double precision," +
        "   b1 double precision," +
        "     b2 double precision," +
        "     b3 double precision," +
        "   l0 double precision," +
         "   l1 double precision," +
       
         "  CONSTRAINT forward_curve_params_pkey PRIMARY KEY (index_name, reference_date)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.forward_curve_params OWNER TO postgres;" + ";";

    fields.put("INDEX_NAME", "INDEX_NAME".toLowerCase());
    fields.put("REFERENCE_DATE", "REFERENCE_DATE".toLowerCase());
    fields.put("B0", "B0".toLowerCase());
    fields.put("B1", "B1".toLowerCase());
    fields.put("B2", "B2".toLowerCase());
    fields.put("B3", "B3".toLowerCase());
    fields.put("L0", "L0".toLowerCase());
    fields.put("L1", "L1".toLowerCase());


    
    
  }

}
