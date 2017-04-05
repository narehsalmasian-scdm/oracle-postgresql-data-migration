package tables;

public class ForwardCurveParams extends AbstractTable {

  static {

    addChildClasses(1, ForwardCurveParams.class);
  }

  public ForwardCurveParams() {
    tableNameOracle = "FORWARD_CURVE_PARAMS";
    tableNamePostgres = "forward_curve_params";

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
