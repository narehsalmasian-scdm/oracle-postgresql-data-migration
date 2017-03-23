package oracle_to_postgres;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import tables.AbstractTable;

public class App {
  public static void main(String[] args) {
    try {
      
      Map<Integer, List<Class<? extends AbstractTable>>> allTables = AbstractTable.getChildClasses();
      
      List<Integer> indexes = new LinkedList<Integer>(allTables.keySet());
      Collections.sort(indexes);
      
      Writer.openConnection();
      
      for(Integer index : indexes){
        List<Class<? extends AbstractTable>> classes = allTables.get(index);
        for(Class<? extends AbstractTable> childClass : classes){
          AbstractTable instance = childClass.newInstance();
          List<Map<String, Object>> rows = Read.read(instance);
          Writer.write(rows, instance);
        }
      }
      
      Writer.closeConnection();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
