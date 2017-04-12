package tables;

public class TheoreticalPrice extends AbstractTable {
  static {
    addChildClasses(0, TheoreticalPrice.class);

  }

  public TheoreticalPrice() {
    tableNameOracle = "THEORETICAL_PRICE";
    tableNamePostgres = "THEORETICAL_PRICE".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("PRICE", "PRICE".toLowerCase());
    fields.put("POOL_FACTOR", "POOL_FACTOR".toLowerCase());
    fields.put("ACCRUED_INTEREST", "ACCRUED_INTEREST".toLowerCase());
    fields.put("IS_DISSEMINATED", "IS_DISSEMINATED".toLowerCase());
    fields.put("IS_VALIDATED", "IS_VALIDATED".toLowerCase());
    fields.put("INDEX_RATIO", "INDEX_RATIO".toLowerCase());
    fields.put("IS_RECALC_NEEDED", "IS_RECALC_NEEDED".toLowerCase());
    
    fields.put("IS_MANUAL_UPLOAD", "IS_MANUAL_UPLOAD".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
    fields.put("CURRENT_ACCRUED_INTEREST", "CURRENT_ACCRUED_INTEREST".toLowerCase());
    fields.put("DIRTY_PRICE", "DIRTY_PRICE".toLowerCase());
    fields.put("DIRTY_PRICE_UNDERLYING", "DIRTY_PRICE_UNDERLYING".toLowerCase());
    fields.put("DIRTY_PRICE_NO_CAP_FLOOR", "DIRTY_PRICE_NO_CAP_FLOOR".toLowerCase());
  }
}