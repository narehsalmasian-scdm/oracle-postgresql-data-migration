package tables;

public class StagingBbgStaticData extends AbstractTable {
  static {
    addChildClasses(0, StagingBbgStaticData.class);

  }

  public StagingBbgStaticData() {
    tableNameOracle = "STAGING_BBG_STATIC_DATA";
    tableNamePostgres = "STAGING_BBG_STATIC_DATA".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("ISIN", "ISIN".toLowerCase());
    fields.put("AS_OF_DATE", "AS_OF_DATE".toLowerCase());
    fields.put("ID_ISIN2", "ID_ISIN2".toLowerCase());
    fields.put("ID_CUSIP", "ID_CUSIP".toLowerCase());
    fields.put("CALLED", "CALLED".toLowerCase());
    fields.put("CALLED_DT", "CALLED_DT".toLowerCase());
    fields.put("NXT_CALL_DT", "NXT_CALL_DT".toLowerCase());
    fields.put("FIRST_CPN_DT", "FIRST_CPN_DT".toLowerCase());
    fields.put("AMT_ISSUED", "AMT_ISSUED".toLowerCase());
    
    fields.put("AMT_OUTSTANDING", "AMT_OUTSTANDING".toLowerCase());
    fields.put("ISSUE_DT", "ISSUE_DT".toLowerCase());
    fields.put("ISSUE_PX", "ISSUE_PX".toLowerCase());
    fields.put("DES_NOTES", "DES_NOTES".toLowerCase());
    fields.put("TRADE_CRNCY", "TRADE_CRNCY".toLowerCase());
    fields.put("CRNCY", "CRNCY".toLowerCase());
    fields.put("MATURITY", "MATURITY".toLowerCase());
    fields.put("FINAL_MATURITY", "FINAL_MATURITY".toLowerCase());
    fields.put("CALENDAR_CODE", "CALENDAR_CODE".toLowerCase());
    fields.put("FLT_CPN_CONVENTION", "FLT_CPN_CONVENTION".toLowerCase());
    
    fields.put("FIRST_CPN_PERIOD_TYP", "FIRST_CPN_PERIOD_TYP".toLowerCase());
    fields.put("LAST_CPN_PERIOD_TYP", "LAST_CPN_PERIOD_TYP".toLowerCase());
    fields.put("ASSET_NAME", "ASSET_NAME".toLowerCase());
    fields.put("CPN_CAP", "CPN_CAP".toLowerCase());
    fields.put("CPN_FLOOR", "CPN_FLOOR".toLowerCase());
    fields.put("CALLABLE", "CALLABLE".toLowerCase());
    fields.put("PUTABLE", "PUTABLE".toLowerCase());
    fields.put("EXTENDIBLE", "EXTENDIBLE".toLowerCase());
    fields.put("SINKABLE", "SINKABLE".toLowerCase());
    fields.put("DDIS_CURRENCY", "DDIS_CURRENCY".toLowerCase());
    
    fields.put("DAY_CNT_DES", "DAY_CNT_DES".toLowerCase());
    fields.put("CPN_FREQ", "CPN_FREQ".toLowerCase());
    fields.put("SINKING_FUND_FACTOR", "SINKING_FUND_FACTOR".toLowerCase());
    fields.put("MOST_RECENT_REPORTED_FACTOR", "MOST_RECENT_REPORTED_FACTOR".toLowerCase());
    fields.put("FLT_DAYS_PRIOR", "FLT_DAYS_PRIOR".toLowerCase());
    fields.put("FLT_PAY_DAY", "FLT_PAY_DAY".toLowerCase());
    fields.put("EX_DIV_DAYS", "EX_DIV_DAYS".toLowerCase());
    fields.put("CPN_RATE_FIX_METH", "CPN_RATE_FIX_METH".toLowerCase());
    fields.put("PAYING_INDEX_SET_AT_END", "PAYING_INDEX_SET_AT_END".toLowerCase());
    fields.put("REDEMP_VAL", "REDEMP_VAL".toLowerCase());
    
    fields.put("MULTI_CPN_SCHEDULE", "MULTI_CPN_SCHEDULE".toLowerCase());
    fields.put("STRUCTURED_NOTE_CPN_FORMULA", "STRUCTURED_NOTE_CPN_FORMULA".toLowerCase());
    fields.put("COLLAT_TYP", "COLLAT_TYP".toLowerCase());
    fields.put("PAYMENT_RANK", "PAYMENT_RANK".toLowerCase());
    fields.put("MAKE_WHOLE_CALL", "MAKE_WHOLE_CALL".toLowerCase());
    fields.put("INFLATION_LINKED_INDICATOR", "INFLATION_LINKED_INDICATOR".toLowerCase());
    fields.put("COUPON", "COUPON".toLowerCase());
    fields.put("BASIC_SPREAD", "BASIC_SPREAD".toLowerCase());
    fields.put("RESET_IDX", "RESET_IDX".toLowerCase());
    fields.put("FLT_BENCH_MULTIPLIER", "FLT_BENCH_MULTIPLIER".toLowerCase());
    fields.put("CNTRY_OF_RISK", "CNTRY_OF_RISK".toLowerCase());
    fields.put("CALC_TYP_DES", "CALC_TYP_DES".toLowerCase());
    
    fields.put("INT_ACC_DT", "INT_ACC_DT".toLowerCase());
    fields.put("STRIP_TYPE", "STRIP_TYPE".toLowerCase());
    fields.put("BASE_CPI", "BASE_CPI".toLowerCase());
    fields.put("INTERPOLATION_FOR_COUPON_CALC", "INTERPOLATION_FOR_COUPON_CALC".toLowerCase());
    fields.put("INFLATION_LINKER_CATEGORY", "INFLATION_LINKER_CATEGORY".toLowerCase());
    fields.put("DUAL_CRNCY", "DUAL_CRNCY".toLowerCase());
    fields.put("REDEMP_CRNCY", "REDEMP_CRNCY".toLowerCase());
    fields.put("CPN_CRNCY", "CPN_CRNCY".toLowerCase());
    fields.put("INFLATION_LAG", "INFLATION_LAG".toLowerCase());
    fields.put("ERROR_CODE", "ERROR_CODE".toLowerCase());
    
    fields.put("DATA", "DATA".toLowerCase());
    fields.put("CPN_TYPE", "CPN_TYPE".toLowerCase());
    fields.put("CPN_TYPE_MAPPED", "CPN_TYPE_MAPPED".toLowerCase());
    fields.put("FUNGE_CUSIP", "FUNGE_CUSIP".toLowerCase());
    fields.put("ISSUER_ULTIMATE_PARENT_NAME", "ISSUER_ULTIMATE_PARENT_NAME".toLowerCase());
    fields.put("ISSUER_ULTIMATE_PARENT_ID", "ISSUER_ULTIMATE_PARENT_ID".toLowerCase());
    fields.put("ISSUER_PARENT_NAME", "ISSUER_PARENT_NAME".toLowerCase());
    fields.put("ISSUER_PARENT_ID", "ISSUER_PARENT_ID".toLowerCase());
    fields.put("PUT_TYPE", "PUT_TYPE".toLowerCase());
    fields.put("CALL_TYPE", "CALL_TYPE".toLowerCase());
    
    fields.put("ISSUER", "ISSUER".toLowerCase());
    fields.put("CALC_TYP", "CALC_TYP".toLowerCase());
    fields.put("BOND_TO_EQY_TICKER", "BOND_TO_EQY_TICKER".toLowerCase());
    fields.put("CALL_DAYS_NOTICE", "CALL_DAYS_NOTICE".toLowerCase());
    fields.put("COUPON_CONVENTIONS", "COUPON_CONVENTIONS".toLowerCase());
    fields.put("COUPON_AS_OF_DATE", "COUPON_AS_OF_DATE".toLowerCase());
    fields.put("EX_DIV_CALENDAR", "EX_DIV_CALENDAR".toLowerCase());
    fields.put("FLT_PAY_HOLIDAY_CDR", "FLT_PAY_HOLIDAY_CDR".toLowerCase());
    fields.put("GUARANTOR", "GUARANTOR".toLowerCase());
    fields.put("GUARANTORS_LIST", "GUARANTORS_LIST".toLowerCase());
    
    fields.put("GUARANTY_LEVEL", "GUARANTY_LEVEL".toLowerCase());
    fields.put("ISSUER_ID", "ISSUER_ID".toLowerCase());
    fields.put("GUARANTOR_ID", "GUARANTOR_ID".toLowerCase());
    fields.put("IDX_RATIO", "IDX_RATIO".toLowerCase());
    fields.put("IS_STILL_CALLABLE", "IS_STILL_CALLABLE".toLowerCase());
    fields.put("ISSUER_INDUSTRY", "ISSUER_INDUSTRY".toLowerCase());
    fields.put("MTY_TYPE", "MTY_TYPE".toLowerCase());
    fields.put("MULTI_COUPON_SCHEDULE_TYPE", "MULTI_COUPON_SCHEDULE_TYPE".toLowerCase());
    fields.put("NEXT_COUPON_DATE", "NEXT_COUPON_DATE".toLowerCase());
    fields.put("PARENT_OBLIGOR_ID", "PARENT_OBLIGOR_ID".toLowerCase());
    
    fields.put("PARENT_TICKER", "PARENT_TICKER".toLowerCase());
    fields.put("PREVIOUS_COUPON_DATE", "PREVIOUS_COUPON_DATE".toLowerCase());
    fields.put("PUT_DAYS_NOTICE", "PUT_DAYS_NOTICE".toLowerCase());
    fields.put("REFERENCE_CPI", "REFERENCE_CPI".toLowerCase());
    fields.put("REFERENCE_INDEX", "REFERENCE_INDEX".toLowerCase());
    fields.put("STRUCTIRED_NOTE", "STRUCTIRED_NOTE".toLowerCase());
    fields.put("STR_NOTE_CPN_FORMULA_JSON", "STR_NOTE_CPN_FORMULA_JSON".toLowerCase());
    fields.put("SINK_SCHEDULE_AMT_TYP", "SINK_SCHEDULE_AMT_TYP".toLowerCase());

    


    
  }
}
