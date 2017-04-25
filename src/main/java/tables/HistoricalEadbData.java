package tables;

public class HistoricalEadbData extends AbstractTable {

  static {

    addChildClasses(1, HistoricalEadbData.class);
  }

  public HistoricalEadbData() {
    tableNameOracle = "HISTORICAL_EADB_DATA";
    tableNamePostgres = "historical_eadb_data";
    
    tableCreaterQuery = "CREATE TABLE" + "public.historical_eadb_data" + "(" +
        "   id character varying NOT NULL," +
        "    isin character varying," +
        "   as_of_date timestamp without time zone," +
        "     data text," +
        "     status character varying," +
        "   asset_name character varying," +
        "   emergency_collateral character(1)," +
        "  asset_type character varying," +
        "  liquidity_class character varying," +
        " issuer_country character varying," +
        " maturity timestamp without time zone," +
        "  orn character varying," +
        "  sender_code character varying," +
        "  scb_own_use character varying," +
        " outstanding_issued_amount double precision," +
        " issue_date timestamp without time zone," +
        "   issue_price double precision," +
        "  reference_market character varying," +
        "  st_asset_rating character varying," +
        "    st_asset_rating_issue_date timestamp without time zone," +
        "  lt_asset_rating character varying," +
        "  lt_asset_rating_issue_date timestamp without time zone," +
        "  callable character varying," +
        "  putable character varying," +
        " extendible character varying," +
        "  sinkable character varying," +
        "  frequency double precision," +
        "  price_quotation character varying," +
        "  denomination character varying," +
        "  ecb_status character varying," +
        " inflation_linked character varying,"+
        " coupon_definition character varying,"+
        "   coupon_rate double precision,"+
        " CONSTRAINT historical_eadb_data_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.historical_eadb_data OWNER TO postgres;" + ";";
    

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