package tables;

public class EconomicConsistency extends  AbstractTable {

  static {
    addChildClasses(0, EconomicConsistency.class);
  }

  public EconomicConsistency() {
    tableNameOracle = "ECONOMIC_CONSISTENCY";
    tableNamePostgres = "economic_consistency";

    fields.put("ID", "ID".toLowerCase());
    fields.put("SECTOR", "SECTOR".toLowerCase());
    fields.put("COUNTRY", "COUNTRY".toLowerCase());
    fields.put("RANKING", "RANKING".toLowerCase());
    fields.put("STEP_2", "STEP_2".toLowerCase());
    fields.put("STEP_3", "STEP_3".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    
    
  }
}
