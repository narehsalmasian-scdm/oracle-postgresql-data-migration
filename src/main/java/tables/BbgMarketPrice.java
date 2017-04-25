package tables;

public class BbgMarketPrice extends AbstractTable {

  static {
    addChildClasses(0, BbgMarketPrice.class);

  }

  public BbgMarketPrice() {
    tableNameOracle = "BBG_MARKET_PRICE";
    tableNamePostgres = "bbg_market_price";

    tableCreaterQuery = "CREATE TABLE" + "public.bbg_market_price" + "(" +
        "security_id character varying(255)," +
        "pricing_source_acronym character varying(50)," +
        "pricing_source_name character varying(100)," +
        "executable character(1)," +
        "benchmark_price character(1)," +
        "mp_for_entering_fep_process character(1)," +
        "price_type character varying(50)," +
        "total_score double precision," +
        "category_name character varying(255)," +
        "bid_price double precision," +
        "ask_price character varying," +
        "bidask_spread_in_percent double precision," +
        "bidask_score double precision," +
        "source_type character varying(100)," +
        "source_type_score double precision," +
        "bid_size double precision," +
        "ask_size double precision," +
        "traded_volume_in_percent double precision," +
        "monthly_volume_average double precision," +
        "weekly_volume_average double precision," +
        "traded_volume_score double precision," +
        "provider_update_date timestamp without time zone," +
        "provider_processing_date timestamp without time zone," +
        "elapse_time double precision," +
        "elapsed_time_category character varying(255)," +
        "elapsed_time_category_name character varying(255)," +
        "elapsed_time_score double precision," +
        "scored_mp character(1)," +
        "id bigint NOT NULL," +
        "CONSTRAINT bbg_market_price_pkey PRIMARY KEY (id)" +
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.bbg_market_price OWNER TO postgres;" + ";";

    fields.put("ID", "ID".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("PRICING_SOURCE_ACRONYM",
        "PRICING_SOURCE_ACRONYM".toLowerCase());
    fields.put("PRICING_SOURCE_NAME", "PRICING_SOURCE_NAME".toLowerCase());
    fields.put("EXECUTABLE", "EXECUTABLE".toLowerCase());
    fields.put("BENCHMARK_PRICE", "BENCHMARK_PRICE".toLowerCase());
    fields.put("MP_FOR_ENTERING_FEP_PROCESS",
        "MP_FOR_ENTERING_FEP_PROCESS".toLowerCase());
    fields.put("PRICE_TYPE", "PRICE_TYPE".toLowerCase());
    fields.put("TOTAL_SCORE", "TOTAL_SCORE".toLowerCase());
    fields.put("CATEGORY_NAME", "CATEGORY_NAME".toLowerCase());
    fields.put("BID_PRICE", "BID_PRICE".toLowerCase());
    fields.put("ASK_PRICE", "ASK_PRICE".toLowerCase());
    fields.put("BIDASK_SPREAD_IN_PERCENT",
        "BIDASK_SPREAD_IN_PERCENT".toLowerCase());
    fields.put("BIDASK_SCORE", "BIDASK_SCORE".toLowerCase());
    fields.put("SOURCE_TYPE", "SOURCE_TYPE".toLowerCase());
    fields.put("SOURCE_TYPE_SCORE", "SOURCE_TYPE_SCORE".toLowerCase());
    fields.put("BID_SIZE", "BID_SIZE".toLowerCase());
    fields.put("ASK_SIZE", "ASK_SIZE".toLowerCase());
    fields.put("TRADED_VOLUME_IN_PERCENT",
        "TRADED_VOLUME_IN_PERCENT".toLowerCase());
    fields.put("MONTHLY_VOLUME_AVERAGE",
        "MONTHLY_VOLUME_AVERAGE".toLowerCase());
    fields.put("WEEKLY_VOLUME_AVERAGE", "WEEKLY_VOLUME_AVERAGE".toLowerCase());
    fields.put("TRADED_VOLUME_SCORE", "TRADED_VOLUME_SCORE".toLowerCase());
    fields.put("PROVIDER_UPDATE_DATE", "PROVIDER_UPDATE_DATE".toLowerCase());
    fields.put("PROVIDER_PROCESSING_DATE",
        "PROVIDER_PROCESSING_DATE".toLowerCase());
    fields.put("ELAPSE_TIME", "ELAPSE_TIME".toLowerCase());
    fields.put("ELAPSED_TIME_CATEGORY", "ELAPSED_TIME_CATEGORY".toLowerCase());
    fields.put("ELAPSED_TIME_CATEGORY_NAME",
        "ELAPSED_TIME_CATEGORY_NAME".toLowerCase());
    fields.put("ELAPSED_TIME_SCORE", "ELAPSED_TIME_SCORE".toLowerCase());
    fields.put("SCORED_MP", "SCORED_MP".toLowerCase());

  }
}
