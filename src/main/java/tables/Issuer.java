package tables;

public class Issuer extends AbstractTable {

  static {

    addChildClasses(1, Issuer.class);
  }

  public Issuer() {
    tableNameOracle = "ISSUER";
    tableNamePostgres = "issuer";
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("NAME", "NAME".toLowerCase());
  fields.put("ISSUER_GROUP", "ISSUER_GROUP".toLowerCase());
  fields.put("CODE", "CODE".toLowerCase());
  fields.put("RESIDENCE", "RESIDENCE".toLowerCase());
  fields.put("PSE", "PSE".toLowerCase());
  fields.put("ISSUER_GROUP_RAW", "ISSUER_GROUP_RAW".toLowerCase());
  


}
}