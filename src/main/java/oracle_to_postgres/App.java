package oracle_to_postgres;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.joda.time.DateTime;

import tables.AbstractTable;
import tables.AdjustMO;

/**
 * Hello world!
 */
public class App<T> {
  public static void main(String[] args) {
    try {
      Set<Class<? extends AbstractTable>> allTables = AbstractTable.getChildClasses();
      
      
      AdjustMO adjustMO = new AdjustMO();
      List<Map<String, Object>> rows = Read.read(adjustMO);
      Writer.openConnection();
      Writer.write(rows, adjustMO);
      System.out.println(rows.size());
      Writer.closeConnection();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
