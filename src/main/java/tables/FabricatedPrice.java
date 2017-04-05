package tables;

public class FabricatedPrice extends AbstractTable {

  static {

    addChildClasses(1, FabricatedPrice.class);
  }

  public FabricatedPrice() {
    tableNameOracle = "FABRICATED_PRICE";
    tableNamePostgres = "fabricated_price";

    fields.put("ISIN", "ISIN".toLowerCase());
    
  }

}

