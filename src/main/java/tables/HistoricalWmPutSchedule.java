package tables;

public class HistoricalWmPutSchedule extends AbstractTable {

  static {

    addChildClasses(1, HistoricalWmPutSchedule.class);
  }

  public HistoricalWmPutSchedule() {
    tableNameOracle = "HISTORICAL_WM_PUT_SCHEDULE";
    tableNamePostgres = "historical_wm_put_schedule";
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
  fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
  fields.put("PUT_DATE", "PUT_DATE".toLowerCase());
  fields.put("PUT_AMOUNT", "PUT_AMOUNT".toLowerCase());
  fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
}
}