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
    fields.put("CALLABLE", "CALLABLE".toLowerCase());
    fields.put("MAKE_WHOLE_CAL", "MAKE_WHOLE_CAL".toLowerCase());
    fields.put("PUTABLE", "PUTABLE".toLowerCase());
    fields.put("EXTENDIBLE", "EXTENDIBLE".toLowerCase());
    fields.put("EXTENDIBLE_BY_DEFAULT", "EXTENDIBLE_BY_DEFAULT".toLowerCase());
    fields.put("SINKABLE", "SINKABLE".toLowerCase());
    fields.put("AMORTIZING", "AMORTIZING".toLowerCase());
    fields.put("INFLATION", "INFLATION".toLowerCase());
    fields.put("FUNGIBLE", "FUNGIBLE".toLowerCase());
    fields.put("LEG_ID", "LEG_ID".toLowerCase());
    addChildClasses(0, AdjustMO.class);
  }

}
