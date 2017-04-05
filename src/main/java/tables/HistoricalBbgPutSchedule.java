package tables;

public class HistoricalBbgPutSchedule  extends AbstractTable {

  static {

    addChildClasses(1, HistoricalBbgPutSchedule.class);
  }

  public HistoricalBbgPutSchedule() {
    tableNameOracle = "HISTORICAL_BBG_PUT_SCHEDULE";
    tableNamePostgres = "historical_bbg_put_schedule";

    fields.put("ID", "ID".toLowerCase());
    fields.put("ENTITY_ID", "ENTITY_ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("PUT_DATE", "PUT_DATE".toLowerCase());
    fields.put("PUT_AMOUNT", "PUT_AMOUNT".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());

  }

} 