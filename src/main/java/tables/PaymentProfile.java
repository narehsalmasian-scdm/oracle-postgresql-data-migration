package tables;

public class PaymentProfile extends AbstractTable {
  static {
    addChildClasses(0, PaymentProfile.class);

  }

  public PaymentProfile() {
    tableNameOracle = "PAYMENT_PROFILE";
    tableNamePostgres = "PAYMENT_PROFILE".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("PAYMENT_DATE", "PAYMENT_DATE".toLowerCase());
    fields.put("INTEREST", "INTEREST".toLowerCase());
    fields.put("PRINCIPAL", "PRINCIPAL".toLowerCase());
    fields.put("CAP", "CAP".toLowerCase());
    fields.put("FLOOR", "FLOOR".toLowerCase());
    fields.put("LEG_ID", "LEG_ID".toLowerCase());
    fields.put("SECURITY_VERSION", "SECURITY_VERSION".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
    

  }
}