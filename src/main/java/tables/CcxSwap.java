package tables;

public class CcxSwap extends AbstractTable {

  static {
    addChildClasses(0, CcxSwap.class);
  }

  public CcxSwap() {
    tableNameOracle = "CCX_SWAP";
    tableNamePostgres = "ccx_swap";

    tableCreaterQuery = "CREATE TABLE" + "public.ccx_swap" + "(" +
        "   id character varying NOT NULL," +
        "   ccx_curve_name character varying," +
        "   symbol character varying," +
        "   swap_type character varying," +
        "   spot_offset double precision," +
        "   maturity character varying," +
        "   Leg1_Frequency" + " character varying," +
        "   leg1_dcc character varying," +
        "   leg1_roll_convention character varying," +
        "  leg1_discount_curve character varying," +
        "  leg1_forward_curve character varying," +
        "   leg2_frequency character varying," +
        "  leg2_dcc character varying," +
        "  leg2_roll_convention character varying," +
        "  leg2_forward_curve character varying," +
        "  leg2_discount_curve character varying," +
        "CONSTRAINT id PRIMARY KEY (id)" +
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.ccx_swap OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("SYMBOL", "SYMBOL".toLowerCase());
    fields.put("SWAP_TYPE", "SWAP_TYPE".toLowerCase());
    fields.put("SPOT_OFFSET", "SPOT_OFFSET".toLowerCase());
    fields.put("MATURITY", "MATURITY".toLowerCase());
    fields.put("LEG1_FREQUENCY", "LEG1_FREQUENCY".toLowerCase());
    fields.put("LEG1_DCC", "LEG1_DCC".toLowerCase());
    fields.put("LEG1_ROLL_CONVENTION", "LEG1_ROLL_CONVENTION".toLowerCase());
    fields.put("LEG1_FORWARD_CURVE", "LEG1_FORWARD_CURVE".toLowerCase());
    fields.put("LEG1_DISCOUNT_CURVE", "LEG1_DISCOUNT_CURVE".toLowerCase());
    fields.put("LEG2_FREQUENCY", "LEG2_FREQUENCY".toLowerCase());
    fields.put("LEG2_DCC", "LEG2_DCC".toLowerCase());
    fields.put("LEG2_ROLL_CONVENTION", "LEG2_ROLL_CONVENTION".toLowerCase());
    fields.put("LEG2_FORWARD_CURVE", "LEG2_FORWARD_CURVE".toLowerCase());
    fields.put("LEG2_DISCOUNT_CURVE", "LEG2_DISCOUNT_CURVE".toLowerCase());

  }
}
