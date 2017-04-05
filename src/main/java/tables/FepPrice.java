package tables;

public class FepPrice extends AbstractTable {

  static {

    addChildClasses(1, FepPrice.class);
  }

  public FepPrice() {
    tableNameOracle = "FEP_PRICE";
    tableNamePostgres = "fep_price";

    fields.put("ID", "ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("CLEAN_PRICE", "CLEAN_PRICE".toLowerCase());
    fields.put("ACCRUED_INTEREST", "ACCRUED_INTEREST".toLowerCase());
    fields.put("POOL_FACTOR", "POOL_FACTOR".toLowerCase());
    fields.put("FEP_TYPE", "FEP_TYPE".toLowerCase());
    fields.put("CLEAN_PRICE_DISS", "CLEAN_PRICE_DISS".toLowerCase());
    fields.put("ACCRUED_INTEREST_DISS", "ACCRUED_INTEREST_DISS".toLowerCase());
    fields.put("WARNING_CODE", "WARNING_CODE".toLowerCase());
    fields.put("CLEAN_PRICE_MD", "CLEAN_PRICE_MD".toLowerCase());
    fields.put("ACCRUED_INTEREST_MD", "ACCRUED_INTEREST_MD".toLowerCase());
    fields.put("CLEAN_PRICE_INFLATION", "CLEAN_PRICE_INFLATION".toLowerCase());
    fields.put("ACCRUED_INTEREST_INFLATION", "ACCRUED_INTEREST_INFLATION".toLowerCase());
    
    
  }

}
