package tables;

public class HistoricalBbgCallSchedule  extends AbstractTable {

  static {

    addChildClasses(1, HistoricalBbgCallSchedule.class);
  }

  public HistoricalBbgCallSchedule() {
    tableNameOracle = "HISTORICAL_BBG_CALL_SCHEDULE";
    tableNamePostgres = "historical_bbg_call_schedule";

    fields.put("ID", "ID".toLowerCase());
    fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("CALL_DATE", "CALL_DATE".toLowerCase());
    fields.put("STRIKE", "STRIKE".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());

  }

} 