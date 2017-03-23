package tables;

public class AdjustMO extends AbstractTable{
  static {
    tableNameOracle = "ADJUST_MO";
    tableNamePostgres = "adjust_mo";
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("PAYMENT_DATE", "PAYMENT_DATE".toLowerCase());
    fields.put("INTEREST", "INTEREST".toLowerCase());
    fields.put("PRINCIPAL", "PRINCIPAL".toLowerCase());
    fields.put("CAP", "CAP".toLowerCase());
    fields.put("FLOOR", "FLOOR".toLowerCase());

    addChildClasses(0, AdjustMO.class);
  }

}
