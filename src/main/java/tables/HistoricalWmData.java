package tables;

public class HistoricalWmData extends AbstractTable {

  static {

    addChildClasses(1, HistoricalWmData.class);
  }

  public HistoricalWmData() {
    tableNameOracle = "HISTORICAL_WM_DATA_ID_NN";
    tableNamePostgres = "historical_wm_data_id_nn";
    
    
    tableCreaterQuery = "CREATE TABLE" + "public.historical_wm_data" + "(" +
        "   id character varying NOT NULL," +
        "   isin character varying," +
        "   as_of_date timestamp without time zone," +
        "  data text," +
        "     pool_factor double precision," +
        "   interest_rate_percentage double precision," +
        "   redemption_price double precision," +
        " issue_amount double precision," +
        " outstanding_amount double precision," +
        "  issue_date timestamp without time zone," +
        "   issue_price double precision," +
        "   security_short_description character varying," +
        "   securities_type_specifics character varying," +
        "   wkn character varying," +
        " interest_rate_identifier character varying," +
        "  interest_rate_identifier_short character varying," +
        "   interest_rate_identifier_multi double precision," +
        "   ranking character varying," +
        "    settlement_currency character varying," +
        "    last_redemption_date timestamp without time zone," +
        "   deviating_interest_period character varying," +
        "   mdy_st_asset_rating character varying," +
        "  mdy_st_asset_rating_date timestamp without time zone," +
        "  snp_st_asset_rating character varying," +
        "   snp_st_asset_rating_date timestamp without time zone," +
        "  dbrs_st_asset_rating character varying," +
        "   dbrs_st_asset_rating_date timestamp without time zone," +
        "   mdy_st_issuer_rating character varying," +
        "  mdy_st_issuer_rating_date timestamp without time zone," +
        " ftc_st_issuer_rating character varying," +
        " ftc_st_issuer_rating_date timestamp without time zone," +
        " snp_st_issuer_rating character varying," +
        " snp_st_issuer_rating_date timestamp without time zone," +
        " mdy_lt_asset_rating character varying," +
        "  mdy_lt_asset_rating_date timestamp without time zone," +
        "  ftc_lt_asset_rating character varying," +
        "  ftc_lt_asset_rating_date timestamp without time zone," +
        "   snp_lt_asset_rating character varying," +
        "  snp_lt_asset_rating_date timestamp without time zone," +
        "  dbrs_lt_asset_rating character varying," +
        "  dbrs_lt_asset_rating_date timestamp without time zone," +
        "  mdy_lt_issuer_rating character varying," +
        "  mdy_lt_issuer_rating_date timestamp without time zone," +
        "   ftc_lt_issuer_rating character varying," +
        "   ftc_lt_issuer_rating_date timestamp without time zone," +
        "  snp_lt_issuer_rating character varying," +
        "  snp_lt_issuer_rating_date timestamp without time zone," +
        "   maximum_interest_rate double precision," +
        "    minimum_interest_rate double precision," +
        "   call_option_type character varying," +
        "   special_call_type character varying," +
        "   put_option_type double precision," +
        "   creditor_prolongation_date timestamp without time zone," +
        "    debtor_prolongation_date timestamp without time zone," +
        "   prolongation_identifier double precision," +
        "  conversation_pool_factor character varying," +
        "   interest_phases double precision," +
        "  interbank_offered_rate_spread double precision," +
        "   interest_rate_linkage_isin character varying," +
        "   interest double precision," +
        "   bgn_of_interest_payment_period timestamp without time zone," +
        "   end_of_interest_payment_period timestamp without time zone," +
        "  day_count_convention character varying," +
        " interest_payment_period character varying," +

        "     interest_rate_fixing_day_cnt double precision," +
        "     interest_payment_date_month character varying," +
        "    interest_payment_date double precision," +
        "    interest_payment_date_prsp double precision," +
        "    first_coupon_date timestamp without time zone," +
        "   country_iso character varying," +
        "   custody_settlement_currency character varying," +
        "    product_type_segmentation character varying," +
        "   product_category_segmentation character varying," +
        "    sector_code character varying," +
        "   issuer_category character varying," +
        "   origina_lissuer character varying," +
        "      current_issuer character varying," +
        "     short_term_european_paper character varying," +
        "    guarantor character varying," +
        "     type_of_clause character varying," +
        "   type_of_guarantee character varying," +
        "    further_security character varying," +
        "     guarantor_identifier character varying," +
        "   type_of_collateralisation character varying," +
        "    issuer_name character varying," +
        "    issuer_industry character varying," +
        "   issuer_country_iso3166 character varying," +
        "    last_coupon_irregularity character varying," +
        "    insolvent_issuer_indication double precision," +
        "   ftc_st_asset_rating character varying," +
        "    ftc_st_asset_rating_date timestamp without time zone," +

        "    guarantor_percentage double precision," +
       
        " CONSTRAINT historical_wm_data_pkey PRIMARY KEY (id)"+
        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.historical_wm_data OWNER TO postgres;" + ";";
  
  fields.put("ID", "ID".toLowerCase());
  fields.put("ISIN", "ISIN".toLowerCase());
  fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
  fields.put("DATA", "DATA".toLowerCase());
  fields.put("POOL_FACTOR", "POOL_FACTOR".toLowerCase());
  fields.put("INTEREST_RATE_PERCENTAGE", "INTEREST_RATE_PERCENTAGE".toLowerCase());
  fields.put("REDEMPTION_PRICE", "REDEMPTION_PRICE".toLowerCase());
  fields.put("ISSUE_AMOUNT", "ISSUE_AMOUNT".toLowerCase());
  fields.put("OUTSTANDING_AMOUNT", "OUTSTANDING_AMOUNT".toLowerCase());
  fields.put("ISSUE_DATE", "ISSUE_DATE".toLowerCase());
  fields.put("ISSUE_PRICE", "ISSUE_PRICE".toLowerCase());
  fields.put("SECURITY_SHORT_DESCRIPTION", "SECURITY_SHORT_DESCRIPTION".toLowerCase());
  fields.put("SECURITIES_TYPE_SPECIFICS", "SECURITIES_TYPE_SPECIFICS".toLowerCase());
  fields.put("WKN", "WKN".toLowerCase());
  fields.put("INTEREST_RATE_IDENTIFIER", "INTEREST_RATE_IDENTIFIER".toLowerCase());
  fields.put("INTEREST_RATE_IDENTIFIER_SHORT", "INTEREST_RATE_IDENTIFIER_SHORT".toLowerCase());
  fields.put("INTEREST_RATE_IDENTIFIER_MULTI", "INTEREST_RATE_IDENTIFIER_MULTI".toLowerCase());
  fields.put("RANKING", "RANKING".toLowerCase());
  fields.put("SETTLEMENT_CURRENCY", "SETTLEMENT_CURRENCY".toLowerCase());
  fields.put("LAST_REDEMPTION_DATE", "LAST_REDEMPTION_DATE".toLowerCase());
  fields.put("DEVIATING_INTEREST_PERIOD", "DEVIATING_INTEREST_PERIOD".toLowerCase());
  fields.put("MDY_ST_ASSET_RATING", "MDY_ST_ASSET_RATING".toLowerCase());
  fields.put("MDY_ST_ASSET_RATING_DATE", "MDY_ST_ASSET_RATING_DATE".toLowerCase());
  fields.put("SNP_ST_ASSET_RATING", "SNP_ST_ASSET_RATING".toLowerCase());
  fields.put("SNP_ST_ASSET_RATING_DATE", "SNP_ST_ASSET_RATING_DATE".toLowerCase());
  fields.put("DBRS_ST_ASSET_RATING", "DBRS_ST_ASSET_RATING".toLowerCase());
  fields.put("DBRS_ST_ASSET_RATING_DATE", "DBRS_ST_ASSET_RATING_DATE".toLowerCase());
  fields.put("MDY_ST_ISSUER_RATING", "MDY_ST_ISSUER_RATING".toLowerCase());
  fields.put("MDY_ST_ISSUER_RATING_DATE", "MDY_ST_ISSUER_RATING_DATE".toLowerCase());
  fields.put("FTC_ST_ISSUER_RATING", "FTC_ST_ISSUER_RATING".toLowerCase());
  fields.put("FTC_ST_ISSUER_RATING_DATE", "FTC_ST_ISSUER_RATING_DATE".toLowerCase());
  fields.put("SNP_ST_ISSUER_RATING", "SNP_ST_ISSUER_RATING".toLowerCase());
  fields.put("SNP_ST_ISSUER_RATING_DATE", "SNP_ST_ISSUER_RATING_DATE".toLowerCase());
  fields.put("MDY_LT_ASSET_RATING", "MDY_LT_ASSET_RATING".toLowerCase());
  fields.put("MDY_LT_ASSET_RATING_DATE", "MDY_LT_ASSET_RATING_DATE".toLowerCase());
  fields.put("FTC_LT_ASSET_RATING", "FTC_LT_ASSET_RATING".toLowerCase());
  fields.put("FTC_LT_ASSET_RATING_DATE", "FTC_LT_ASSET_RATING_DATE".toLowerCase());
  fields.put("SNP_LT_ASSET_RATING", "SNP_LT_ASSET_RATING".toLowerCase());
  fields.put("SNP_LT_ASSET_RATING_DATE", "SNP_LT_ASSET_RATING_DATE".toLowerCase());
  fields.put("DBRS_LT_ASSET_RATING", "DBRS_LT_ASSET_RATING".toLowerCase());
  fields.put("DBRS_LT_ASSET_RATING_DATE", "DBRS_LT_ASSET_RATING_DATE".toLowerCase());
  fields.put("MDY_LT_ISSUER_RATING", "MDY_LT_ISSUER_RATING".toLowerCase());
  fields.put("MDY_LT_ISSUER_RATING_DATE", "MDY_LT_ISSUER_RATING_DATE".toLowerCase());
  fields.put("FTC_LT_ISSUER_RATING", "FTC_LT_ISSUER_RATING".toLowerCase());
  fields.put("FTC_LT_ISSUER_RATING_DATE", "FTC_LT_ISSUER_RATING_DATE".toLowerCase());
  fields.put("SNP_LT_ISSUER_RATING", "SNP_LT_ISSUER_RATING".toLowerCase());
  fields.put("SNP_LT_ISSUER_RATING_DATE", "SNP_LT_ISSUER_RATING_DATE".toLowerCase());
  fields.put("MAXIMUM_INTEREST_RATE", "MAXIMUM_INTEREST_RATE".toLowerCase());
  fields.put("MINIMUM_INTEREST_RATE", "MINIMUM_INTEREST_RATE".toLowerCase());
  fields.put("CALL_OPTION_TYPE", "CALL_OPTION_TYPE".toLowerCase());
  fields.put("SPECIAL_CALL_TYPE", "SPECIAL_CALL_TYPE".toLowerCase());
  fields.put("PUT_OPTION_TYPE", "PUT_OPTION_TYPE".toLowerCase());
  fields.put("CREDITOR_PROLONGATION_DATE", "CREDITOR_PROLONGATION_DATE".toLowerCase());
  fields.put("DEBTOR_PROLONGATION_DATE", "DEBTOR_PROLONGATION_DATE".toLowerCase());
  fields.put("PROLONGATION_IDENTIFIER", "PROLONGATION_IDENTIFIER".toLowerCase());
  fields.put("CONVERSATION_POOL_FACTOR", "CONVERSATION_POOL_FACTOR".toLowerCase());
  fields.put("INTEREST_PHASES", "INTEREST_PHASES".toLowerCase());
  fields.put("INTERBANK_OFFERED_RATE_SPREAD", "INTERBANK_OFFERED_RATE_SPREAD".toLowerCase());
  fields.put("INTEREST_RATE_LINKAGE_ISIN", "INTEREST_RATE_LINKAGE_ISIN".toLowerCase());
  fields.put("INTEREST", "INTEREST".toLowerCase());
  fields.put("BGN_OF_INTEREST_PAYMENT_PERIOD", "BGN_OF_INTEREST_PAYMENT_PERIOD".toLowerCase());
  fields.put("END_OF_INTEREST_PAYMENT_PERIOD", "END_OF_INTEREST_PAYMENT_PERIOD".toLowerCase());
  fields.put("DAY_COUNT_CONVENTION", "DAY_COUNT_CONVENTION".toLowerCase());
  fields.put("INTEREST_PAYMENT_PERIOD", "INTEREST_PAYMENT_PERIOD".toLowerCase());
  fields.put("INTEREST_RATE_FIXING_DAY_CNT", "INTEREST_RATE_FIXING_DAY_CNT".toLowerCase());
  fields.put("INTEREST_PAYMENT_DATE_MONTH", "INTEREST_PAYMENT_DATE_MONTH".toLowerCase());
  fields.put("INTEREST_PAYMENT_DATE", "INTEREST_PAYMENT_DATE".toLowerCase());
  fields.put("INTEREST_PAYMENT_DATE_PRSP", "INTEREST_PAYMENT_DATE_PRSP".toLowerCase());
  fields.put("FIRST_COUPON_DATE", "FIRST_COUPON_DATE".toLowerCase());
  fields.put("COUNTRY_ISO", "COUNTRY_ISO".toLowerCase());
  fields.put("CUSTODY_SETTLEMENT_CURRENCY", "CUSTODY_SETTLEMENT_CURRENCY".toLowerCase());
  fields.put("PRODUCT_TYPE_SEGMENTATION", "PRODUCT_TYPE_SEGMENTATION".toLowerCase());
  fields.put("PRODUCT_CATEGORY_SEGMENTATION", "PRODUCT_CATEGORY_SEGMENTATION".toLowerCase());
  fields.put("SECTOR_CODE", "SECTOR_CODE".toLowerCase());
  fields.put("ISSUER_CATEGORY", "ISSUER_CATEGORY".toLowerCase());
  fields.put("ORIGINA_LISSUER", "ORIGINA_LISSUER".toLowerCase());
  fields.put("CURRENT_ISSUER", "CURRENT_ISSUER".toLowerCase());
  fields.put("SHORT_TERM_EUROPEAN_PAPER", "SHORT_TERM_EUROPEAN_PAPER".toLowerCase());
  fields.put("GUARANTOR", "GUARANTOR".toLowerCase());
  fields.put("TYPE_OF_CLAUSE", "TYPE_OF_CLAUSE".toLowerCase());
  fields.put("TYPE_OF_GUARANTEE", "TYPE_OF_GUARANTEE".toLowerCase());
  fields.put("FURTHER_SECURITY", "FURTHER_SECURITY".toLowerCase());
  fields.put("GUARANTOR_IDENTIFIER", "GUARANTOR_IDENTIFIER".toLowerCase());
  fields.put("TYPE_OF_COLLATERALISATION", "TYPE_OF_COLLATERALISATION".toLowerCase());
  fields.put("ISSUER_NAME", "ISSUER_NAME".toLowerCase());
  fields.put("ISSUER_INDUSTRY", "ISSUER_INDUSTRY".toLowerCase());
  fields.put("ISSUER_COUNTRY_ISO3166", "ISSUER_COUNTRY_ISO3166".toLowerCase());
  fields.put("LAST_COUPON_IRREGULARITY", "LAST_COUPON_IRREGULARITY".toLowerCase());
  fields.put("INSOLVENT_ISSUER_INDICATION", "INSOLVENT_ISSUER_INDICATION".toLowerCase());
  fields.put("FTC_ST_ASSET_RATING", "FTC_ST_ASSET_RATING".toLowerCase());
  fields.put("FTC_ST_ASSET_RATING_DATE", "FTC_ST_ASSET_RATING_DATE".toLowerCase());
  fields.put("GUARANTOR_PERCENTAGE", "GUARANTOR_PERCENTAGE".toLowerCase());

}
  
}
