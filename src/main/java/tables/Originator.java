package tables;

public class Originator extends AbstractTable {
  static {
    addChildClasses(0, Originator.class);

  }

  public Originator() {
    tableNameOracle = "ORIGINATOR";
    tableNamePostgres = "ORIGINATOR".toLowerCase();
    fields.put("ID", "ID".toLowerCase());
    fields.put("NAME", "NAME".toLowerCase());
    fields.put("CODE", "CODE".toLowerCase());
    fields.put("COUNTRY_OF_INCORP", "COUNTRY_OF_INCORP".toLowerCase());
    fields.put("ROLE", "ROLE".toLowerCase());

  }
}
