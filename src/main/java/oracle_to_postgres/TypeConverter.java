package oracle_to_postgres;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.joda.time.DateTime;

import oracle.sql.TIMESTAMP;

public abstract class TypeConverter {

  public static Object convert(Object object) throws SQLException {

    if (object instanceof TIMESTAMP) {
      TIMESTAMP oracleDate = ((TIMESTAMP) object);
      Long longValue = oracleDate.timestampValue().getTime();
      Timestamp sqlDt = new Timestamp(longValue);
      return sqlDt;
    } else if (object instanceof String) {
    } else if (object instanceof BigDecimal) {
    }
    return object;

  }

}
