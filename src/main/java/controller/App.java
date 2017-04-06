package controller;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import services.db.oracle.OracleReader;
import services.db.postgres.OracleWriter;
import tables.AbstractTable;

public class App {
  final static Logger logger = Logger.getLogger(App.class);

  // force load of all table classes to have have their static blocks worked
  // TODO: find another way to do this
  static {
    try {
//      Class.forName("tables.AdjustMO");
//      Class.forName("tables.AiValidationResults");
//      Class.forName("tables.BacHisResults");

      //      Class.forName("tables.BacResults");
//      Class.forName("tables.BbgMarketPrice");
//      Class.forName("tables.BbgTicker");
      
//      Class.forName("tables.BriefInfoData");
//      Class.forName("tables.BulkCvsUpload");
//      Class.forName("tables.CalibrationMapping");
//      Class.forName("tables.CalibrationResult");
      Class.forName("tables.CallShedule");
      Class.forName("tables.SecurityInfo");
//      Class.forName("tables.CapletCore");
//      Class.forName("tables.CapletTickers");
//      Class.forName("tables.ExtensionSchedule");
//      Class.forName("tables.SecurityCluster");
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    try {
      Map<Integer, List<Class<? extends AbstractTable>>> allTables = AbstractTable.getChildClasses();

      List<Integer> indexes = new LinkedList<Integer>(allTables.keySet());
      Collections.sort(indexes);

      OracleWriter.openConnection();

      for (Integer index : indexes) {
        List<Class<? extends AbstractTable>> classes = allTables.get(index);
        for (Class<? extends AbstractTable> childClass : classes) {
          AbstractTable instance = childClass.newInstance();
          List<Map<String, Object>> rows = OracleReader.read(instance);
          OracleWriter.write(rows, instance);
        }
      }

      Set<String> types = OracleReader.types;
    
      for (String type : types) {
        System.out.println(type);
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      OracleWriter.closeConnection();
    }

  }
}
