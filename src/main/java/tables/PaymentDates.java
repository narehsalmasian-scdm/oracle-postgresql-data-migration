package tables;

public class PaymentDates extends AbstractTable {
  static {
    addChildClasses(0, PaymentDates.class);

  }

  public PaymentDates() {
    tableNameOracle = "PAYMENT_DATES";
    tableNamePostgres = "PAYMENT_DATES".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("DIRTY_PAYMENT_DATE", "DIRTY_PAYMENT_DATE".toLowerCase());
    fields.put("CLEAN_PAYMENT_DATE", "CLEAN_PAYMENT_DATE".toLowerCase());
    fields.put("ACCRUAL_START_DATE", "ACCRUAL_START_DATE".toLowerCase());
    fields.put("ACCRUAL_END_DATE", "ACCRUAL_END_DATE".toLowerCase());
    fields.put("LEG_ID", "LEG_ID".toLowerCase());
    fields.put("SECURITY_VERSION", "SECURITY_VERSION".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
    

  }
}
