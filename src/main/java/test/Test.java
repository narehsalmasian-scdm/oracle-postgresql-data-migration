package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import tables.CallShedule;

public class Test {
  
  public static void  main(String[] args) throws Exception {
    
    Map <String,Object> map = new HashMap<String,Object>();
    map = PostgresRead.read(new CallShedule(), "2753");
    for(Entry<String, Object> entry:map.entrySet()){
        System.out.println(entry.getKey() + " "+ entry.getValue());
    }
  }

}
  
