package tables;

public class HistoricalWmSinkSchedule extends AbstractTable {

  static {

    addChildClasses(1, HistoricalWmSinkSchedule.class);
  }

  public HistoricalWmSinkSchedule() {
    tableNameOracle = "HISTORICAL_WM_SINK_SCHEDULE";
    tableNamePostgres = "historical_wm_sink_schedule";
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
  fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
  fields.put("SINK_DATE", "SINK_DATE".toLowerCase());
  fields.put("SINK_AMOUNT", "SINK_AMOUNT".toLowerCase());
  fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
}
}