package services.db;

import java.util.List;
import java.util.Map;

import tables.AbstractTable;

public class WorkflowService {
  private static Map<Integer, List<Class<? extends AbstractTable>>> allTables = AbstractTable.getChildClasses();

  public boolean cleanDB() {
    
    return true;
  }
  
  public boolean transferData(){
    
    
    return true;
  }
  
  
}
