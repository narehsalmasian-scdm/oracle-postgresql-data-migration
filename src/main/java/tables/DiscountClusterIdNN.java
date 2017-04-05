package tables;

public class DiscountClusterIdNN extends  AbstractTable {

  static {
    addChildClasses(0, DiscountClusterIdNN.class);
  }

  public DiscountClusterIdNN() {
    tableNameOracle = "DISCOUNT_CLUSTER";
    tableNamePostgres = "discount_cluster";

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