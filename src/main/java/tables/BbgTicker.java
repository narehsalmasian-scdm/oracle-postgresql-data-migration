package tables;

public class BbgTicker extends AbstractTable{

  static {
    addChildClasses(0, BbgTicker.class);
  }

  public BbgTicker() {
    tableNameOracle = "BBG_TICKER";
    tableNamePostgres = "BBG_TICKER".toLowerCase();

    fields.put("BBG_TICKER", "BBG_TICKER".toLowerCase());
    fields.put("BBG_GROUP", "BBG_GROUP".toLowerCase());
    fields.put("BBG_SOURCE", "BBG_SOURCE".toLowerCase());
    fields.put("RESOLVED", "RESOLVED".toLowerCase());
    fields.put("SWAP_TYPE", "SWAP_TYPE".toLowerCase());
    fields.put("SPOT_OFFSET", "SPOT_OFFSET".toLowerCase());
    fields.put("MATURITY", "MATURITY".toLowerCase());
    fields.put("FLOAT_LEG_FREQ", "FLOAT_LEG_FREQ".toLowerCase());
    fields.put("FLOAT_LEG_DCC", "FLOAT_LEG_DCC".toLowerCase());
    fields.put("FLOAT_LEG_ROLL_CONV", "FLOAT_LEG_ROLL_CONV".toLowerCase());
    fields.put("FIX_LEG_FREQ", "FIX_LEG_FREQ".toLowerCase());
    fields.put("FIX_LEG_DCC", "FIX_LEG_DCC".toLowerCase());
    fields.put("FIX_LEG_ROLL_CONV", "FIX_LEG_ROLL_CONV".toLowerCase());
    fields.put("START_OFFSET", "START_OFFSET".toLowerCase());
    
  }
}

