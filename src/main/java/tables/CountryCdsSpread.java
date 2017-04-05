package tables;

public class CountryCdsSpread extends AbstractTable {

  static {
    addChildClasses(0, CountryCdsSpread.class);
  }

  public CountryCdsSpread() {
    tableNameOracle = "COUNTRY_CDS_SPREAD";
    tableNamePostgres = "country_cds_spread";

    fields.put("ID", "ID".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("COUNTRY_CODE", "COUNTRY_CODE".toLowerCase());
    fields.put("SPREAD", "SPREAD".toLowerCase());
    fields.put("IS_CONFIRMED", "IS_CONFIRMED".toLowerCase());
    fields.put("USER_ID", "USER_ID".toLowerCase());

  }
}