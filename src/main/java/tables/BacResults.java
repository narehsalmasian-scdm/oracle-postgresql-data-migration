package tables;

public class BacResults extends AbstractTable{
  
  static {
    addChildClasses(0, BacResults.class);

  }
   public BacResults(){
     tableNameOracle = "BAC_RESULTS";
     tableNamePostgres = "BAC_RESULTS".toLowerCase();

     fields.put("COUNTRY", "COUNTRY".toLowerCase());
     fields.put("SECTOR", "SECTOR".toLowerCase());
     fields.put("CURVES_IN_ORDER", "CURVES_IN_ORDER".toLowerCase());
   }
  
}
