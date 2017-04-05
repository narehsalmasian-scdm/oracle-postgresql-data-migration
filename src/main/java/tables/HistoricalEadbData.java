package tables;

public class HistoricalEadbData extends AbstractTable {

  static {

    addChildClasses(1, HistoricalEadbData.class);
  }

  public HistoricalEadbData() {
    tableNameOracle = "HISTORICAL_EADB_DATA";
    tableNamePostgres = "historical_eadb_data";

    fields.put("ID", "ID".toLowerCase());
    fields.put("ISIN", "ISIN".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("DATA", "DATA".toLowerCase());
    fields.put("STATUS", "STATUS".toLowerCase());
    fields.put("ASSET_NAME", "ASSET_NAME".toLowerCase());
    fields.put("EMERGENCY_COLLATERAL", "EMERGENCY_COLLATERAL".toLowerCase());
    fields.put("ASSET_TYPE", "ASSET_TYPE".toLowerCase());
    fields.put("LIQUIDITY_CLASS", "LIQUIDITY_CLASS".toLowerCase());
    fields.put("ISSUER_COUNTRY", "ISSUER_COUNTRY".toLowerCase());
    fields.put("MATURITY", "MATURITY".toLowerCase());
    fields.put("ORN", "ORN".toLowerCase());
    fields.put("SENDER_CODE", "SENDER_CODE".toLowerCase());
    fields.put("SCB_OWN_USE", "SCB_OWN_USE".toLowerCase());
    fields.put("OUTSTANDING_ISSUED_AMOUNT", "OUTSTANDING_ISSUED_AMOUNT".toLowerCase());
    fields.put("ISSUE_DATE", "ISSUE_DATE".toLowerCase());
    fields.put("ISSUE_PRICE", "ISSUE_PRICE".toLowerCase());
    fields.put("REFERENCE_MARKET", "REFERENCE_MARKET".toLowerCase());
    fields.put("ST_ASSET_RATING", "ST_ASSET_RATING".toLowerCase());
    fields.put("ST_ASSET_RATING_ISSUE_DATE", "ST_ASSET_RATING_ISSUE_DATE".toLowerCase());
    fields.put("LT_ASSET_RATING", "LT_ASSET_RATING".toLowerCase());
    fields.put("LT_ASSET_RATING_ISSUE_DATE", "LT_ASSET_RATING_ISSUE_DATE".toLowerCase());
    fields.put("CALLABLE", "CALLABLE".toLowerCase());
    fields.put("PUTABLE", "PUTABLE".toLowerCase());
    fields.put("EXTENDIBLE", "EXTENDIBLE".toLowerCase());
    fields.put("SINKABLE", "SINKABLE".toLowerCase());
    fields.put("FREQUENCY", "FREQUENCY".toLowerCase());
    fields.put("PRICE_QUOTATION", "PRICE_QUOTATION".toLowerCase());
    fields.put("DENOMINATION", "DENOMINATION".toLowerCase());
    fields.put("ECB_STATUS", "ECB_STATUS".toLowerCase());
    fields.put("INFLATION_LINKED", "INFLATION_LINKED".toLowerCase());
    fields.put("COUPON_DEFINITION", "COUPON_DEFINITION".toLowerCase());
    fields.put("COUPON_RATE", "COUPON_RATE".toLowerCase());
    
  }
}