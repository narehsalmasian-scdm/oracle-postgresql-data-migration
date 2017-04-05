package tables;

public class IndexFixings extends AbstractTable {

  static {

    addChildClasses(1, IndexFixings.class);
  }

  public IndexFixings() {
    tableNameOracle = "INDEX_FIXINGS";
    tableNamePostgres = "index_fixings";
  
  fields.put("ISIN", "ISIN".toLowerCase());
  fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
  fields.put("FIXING", "FIXING".toLowerCase());
  


}
}