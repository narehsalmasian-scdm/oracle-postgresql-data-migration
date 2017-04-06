package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorkflowController {
  
  @RequestMapping("/tables/count")
  public String getTableCount(Model model){
    model.addAttribute("tableCount", 15);
    return "tablesPage1.jsp";
  }

}
