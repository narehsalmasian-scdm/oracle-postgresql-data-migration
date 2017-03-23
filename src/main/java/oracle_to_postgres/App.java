package oracle_to_postgres;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;

import tables.AdjustMO;
import tables.CapletCore;

/**
 * Hello world!
 */
public class App<T> {
  public static void main(String[] args) {
// OracleSqlReader reader = new OracleSqlReader();
// PostGreSqlWriter writer = new PostGreSqlWriter();
// try {
// List<Map<String, Object>> data = reader.selectRecordsFromDbUserTable();
// writer.write(data);
//
// } catch (Exception e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }

    try {
      AdjustMO adjustMO = new AdjustMO();
      List<Map<String, Object>> rows = Read.read(adjustMO);
      Writer.openConnection();
      Writer.write(rows, adjustMO);
      System.out.println(rows.size());
      Writer.closeConnection();

      CapletCore capletCore = new CapletCore();
      List<Map<String, Object>> rows = Read.read(capletCore);/////?
      Writer.openConnection();
      Writer.write(rows, capletCore);
      System.out.println(rows.size());
      Writer.closeConnection();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
