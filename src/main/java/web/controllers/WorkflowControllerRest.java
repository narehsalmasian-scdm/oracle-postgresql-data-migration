package web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkflowControllerRest {
  
  @RequestMapping("/rest/tables/count")
  public Map<String, Integer> getTableCount(Model model){
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("key1", 10);
    map.put("key2", 20);
    return map;
  }

}
