package tables;

public class SecurityCoreData extends AbstractTable {
  static {
    addChildClasses(0, SecurityCoreData.class);

  }

  public SecurityCoreData() {
    tableNameOracle = "SECURITY_CORE_DATA";
    tableNamePostgres = "SECURITY_CORE_DATA".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("EFFECTIVE_DATE", "EFFECTIVE_DATE".toLowerCase());
    fields.put("STATUS", "STATUS".toLowerCase());
    fields.put("CALL_STATUS", "CALL_STATUS".toLowerCase());
    fields.put("CALL_DATE", "CALL_DATE".toLowerCase());
    fields.put("FUNGE_STATUS", "FUNGE_STATUS".toLowerCase());
    fields.put("FUNGE_DATE", "FUNGE_DATE".toLowerCase());
    fields.put("INSOLVENT_ISSUER_INDICATION", "INSOLVENT_ISSUER_INDICATION".toLowerCase());
    fields.put("ECB_STATUS", "ECB_STATUS".toLowerCase());
    fields.put("EMERGENCY_COLLATERAL", "EMERGENCY_COLLATERAL".toLowerCase());
    
    fields.put("SENDER_CODE", "SENDER_CODE".toLowerCase());
    fields.put("SCB_OWN_USE", "SCB_OWN_USE".toLowerCase());
    fields.put("ORIGINAL_NOMINAL", "ORIGINAL_NOMINAL".toLowerCase());
    fields.put("NOMINAL_REDEMPTION", "NOMINAL_REDEMPTION".toLowerCase());
    fields.put("ISSUED_AMOUNT", "ISSUED_AMOUNT".toLowerCase());
    fields.put("OUTSTANDING_ISSUED_AMOUNT", "OUTSTANDING_ISSUED_AMOUNT".toLowerCase());
    fields.put("ISSUE_DATE", "ISSUE_DATE".toLowerCase());
    fields.put("ISSUE_PRICE", "ISSUE_PRICE".toLowerCase());
    fields.put("ASSET_NAME", "ASSET_NAME".toLowerCase());
    fields.put("ISIN_1", "ISIN_1".toLowerCase());
    
    fields.put("ISIN_2", "ISIN_2".toLowerCase());
    fields.put("CUSPI_1", "CUSPI_1".toLowerCase());
    fields.put("CUSPI_2", "CUSPI_2".toLowerCase());
    fields.put("ORN", "ORN".toLowerCase());
    fields.put("WKN", "WKN".toLowerCase());
    fields.put("DEFAULT_VALUE_PRICING", "DEFAULT_VALUE_PRICING".toLowerCase());
    fields.put("REFERENCE_MARKET", "REFERENCE_MARKET".toLowerCase());
    fields.put("ASSET_TYPE", "ASSET_TYPE".toLowerCase());
    fields.put("LIQUIDITY_CLASS", "LIQUIDITY_CLASS".toLowerCase());
    fields.put("PRICE_QUOTATION", "PRICE_QUOTATION".toLowerCase());
    
    fields.put("ISSUE_DESCRIPTION_BB", "ISSUE_DESCRIPTION_BB".toLowerCase());
    fields.put("ISSUE_DESCRIPTION_WM", "ISSUE_DESCRIPTION_WM".toLowerCase());
    fields.put("SENIORITY", "SENIORITY".toLowerCase());
    fields.put("LISTING_CURRENCY", "LISTING_CURRENCY".toLowerCase());
    fields.put("MATURITY", "MATURITY".toLowerCase());
    fields.put("FINAL_MATURITY", "FINAL_MATURITY".toLowerCase());
    fields.put("BUSINESS_DAY_CALENDAR", "BUSINESS_DAY_CALENDAR".toLowerCase());
    fields.put("PIKABLE", "PIKABLE".toLowerCase());
    fields.put("FIRST_COUPON", "FIRST_COUPON".toLowerCase());
    fields.put("LAST_COUPON", "LAST_COUPON".toLowerCase());
    
    fields.put("SECTOR", "SECTOR".toLowerCase());
    fields.put("COUNTRY_OF_RISK", "COUNTRY_OF_RISK".toLowerCase());
    fields.put("ASSET_RAT_EADB_S_T", "ASSET_RAT_EADB_S_T".toLowerCase());
    fields.put("ASSET_RAT_EADB_S_T_DATE", "ASSET_RAT_EADB_S_T_DATE".toLowerCase());
    fields.put("ASSET_RAT_EADB_L_T", "ASSET_RAT_EADB_L_T".toLowerCase());
    fields.put("ASSET_RAT_EADB_L_T_DATE", "ASSET_RAT_EADB_L_T_DATE".toLowerCase());
    fields.put("ASSET_RAT_MDYS_L_T", "ASSET_RAT_MDYS_L_T".toLowerCase());
    fields.put("ASSET_RAT_MDYS_L_T_DATE", "ASSET_RAT_MDYS_L_T_DATE".toLowerCase());
    fields.put("ASSET_RAT_FITCH_L_T", "ASSET_RAT_FITCH_L_T".toLowerCase());
    fields.put("ASSET_RAT_FITCH_L_T_DATE", "ASSET_RAT_FITCH_L_T_DATE".toLowerCase());
    
    fields.put("ASSET_RAT_SNP_L_T", "ASSET_RAT_SNP_L_T".toLowerCase());
    fields.put("ASSET_RAT_SNP_L_T_DATE", "ASSET_RAT_SNP_L_T_DATE".toLowerCase());
    fields.put("ASSET_RAT_DBRS_L_T", "ASSET_RAT_DBRS_L_T".toLowerCase());
    fields.put("ASSET_RAT_DBRS_L_T_DATE", "ASSET_RAT_DBRS_L_T_DATE".toLowerCase());
    fields.put("ISSUER_RAT_EADB_L_T", "ISSUER_RAT_EADB_L_T".toLowerCase());
    fields.put("ISSUER_RAT_EADB_L_T_DATE", "ISSUER_RAT_EADB_L_T_DATE".toLowerCase());
    fields.put("GUA_RAT_EADB_L_T", "GUA_RAT_EADB_L_T".toLowerCase());
    fields.put("GUA_RAT_EADB_L_T_DATE", "GUA_RAT_EADB_L_T_DATE".toLowerCase());
    fields.put("ISSUER_RAT_EADB_S_T", "ISSUER_RAT_EADB_S_T".toLowerCase());
    fields.put("CALCULATION_TYPE_DES", "CALCULATION_TYPE_DES".toLowerCase());
    
    fields.put("INTEREST_ACCRUAL_DATE", "INTEREST_ACCRUAL_DATE".toLowerCase());
    fields.put("STRIP_TYPE", "STRIP_TYPE".toLowerCase());
    fields.put("BASE_CPI_VALUE", "BASE_CPI_VALUE".toLowerCase());
    fields.put("INFLATION_INDEX_RATIO", "INFLATION_INDEX_RATIO".toLowerCase());
    fields.put("INFLATION_LINKED_TYPE", "INFLATION_LINKED_TYPE".toLowerCase());
    fields.put("INFLATION_INTERPOLATION", "INFLATION_INTERPOLATION".toLowerCase());
    fields.put("REFERENCE_CPI", "REFERENCE_CPI".toLowerCase());
    fields.put("INFLATION_LAG", "INFLATION_LAG".toLowerCase());
    fields.put("CURRENT_COUPON", "CURRENT_COUPON".toLowerCase());
    fields.put("CURRENT_PROVIDER_COUPON", "CURRENT_PROVIDER_COUPON".toLowerCase());
    
    fields.put("CURRENT_FACTOR", "CURRENT_FACTOR".toLowerCase());
    fields.put("CURRENT_PROVIDER_POOL_FACTOR", "CURRENT_PROVIDER_POOL_FACTOR".toLowerCase());
    fields.put("NEXT_CALL_DATE", "NEXT_CALL_DATE".toLowerCase());
    fields.put("NEXT_PUT_DATE", "NEXT_PUT_DATE".toLowerCase());
    fields.put("NEXT_PAYMENT_DATE", "NEXT_PAYMENT_DATE".toLowerCase());
    fields.put("OUTSTANDING_CURRENCY", "OUTSTANDING_CURRENCY".toLowerCase());
    fields.put("ORIG_ISSUED_CURRENCY", "ORIG_ISSUED_CURRENCY".toLowerCase());
    fields.put("PROSPECTUS", "PROSPECTUS".toLowerCase());
    fields.put("SINK_TYPE", "SINK_TYPE".toLowerCase());
    fields.put("SETUP_STATUS", "SETUP_STATUS".toLowerCase());
    
    fields.put("IS_MANUAL", "IS_MANUAL".toLowerCase());
    fields.put("FEP_DISSEMINATION_NEEDED", "FEP_DISSEMINATION_NEEDED".toLowerCase());
    fields.put("ASSET_RAT_SNP_S_T", "ASSET_RAT_SNP_S_T".toLowerCase());
    fields.put("ASSET_RAT_SNP_S_T_DATE", "ASSET_RAT_SNP_S_T_DATE".toLowerCase());
    fields.put("ISSUER_RAT_SNP_S_T", "ISSUER_RAT_SNP_S_T".toLowerCase());
    fields.put("ISSUER_RAT_SNP_S_T_DATE", "ISSUER_RAT_SNP_S_T_DATE".toLowerCase());
    fields.put("ISSUER_RAT_SNP_L_T", "ISSUER_RAT_SNP_L_T".toLowerCase());
    fields.put("ISSUER_RAT_SNP_L_T_DATE", "ISSUER_RAT_SNP_L_T_DATE".toLowerCase());
    fields.put("ASSET_RAT_MDYS_S_T", "ASSET_RAT_MDYS_S_T".toLowerCase());
    fields.put("ASSET_RAT_MDYS_S_T_DATE", "ASSET_RAT_MDYS_S_T_DATE".toLowerCase());
    
    fields.put("ISSUER_RAT_MDYS_S_T", "ISSUER_RAT_MDYS_S_T".toLowerCase());
    fields.put("ISSUER_RAT_MDYS_S_T_DATE", "ISSUER_RAT_MDYS_S_T_DATE".toLowerCase());
    fields.put("ISSUER_RAT_MDYS_L_T", "ISSUER_RAT_MDYS_L_T".toLowerCase());
    fields.put("ISSUER_RAT_MDYS_L_T_DATE", "ISSUER_RAT_MDYS_L_T_DATE".toLowerCase());
    fields.put("ASSET_RAT_FITCH_S_T", "ASSET_RAT_FITCH_S_T".toLowerCase());
    fields.put("ASSET_RAT_FITCH_S_T_DATE", "ASSET_RAT_FITCH_S_T_DATE".toLowerCase());
    fields.put("ISSUER_RAT_FITCH_S_T", "ISSUER_RAT_FITCH_S_T".toLowerCase());
    fields.put("ISSUER_RAT_FITCH_S_T_DATE", "ISSUER_RAT_FITCH_S_T_DATE".toLowerCase());
    fields.put("ISSUER_RAT_FITCH_L_T", "ISSUER_RAT_FITCH_L_T".toLowerCase());
    fields.put("ISSUER_RAT_FITCH_L_T_DATE", "ISSUER_RAT_FITCH_L_T_DATE".toLowerCase());
    
    fields.put("ASSET_RAT_DBRS_S_T", "ASSET_RAT_DBRS_S_T".toLowerCase());
    fields.put("ASSET_RAT_DBRS_S_T_DATE", "ASSET_RAT_DBRS_S_T_DATE".toLowerCase());
    fields.put("CREATED_DATE", "CREATED_DATE".toLowerCase());
    fields.put("CREATED_BY", "CREATED_BY".toLowerCase());
    fields.put("VERSION", "VERSION".toLowerCase());
    fields.put("IS_ACTIVE", "IS_ACTIVE".toLowerCase());
    fields.put("CLUSTER_RATING", "CLUSTER_RATING".toLowerCase());
    fields.put("CAP", "CAP".toLowerCase());
    fields.put("FLOOR", "FLOOR".toLowerCase());
    fields.put("CALLABLE", "CALLABLE".toLowerCase());
    
    fields.put("MAKE_WHOLE_CALL", "MAKE_WHOLE_CALL".toLowerCase());
    fields.put("PUTABLE", "PUTABLE".toLowerCase());
    fields.put("EXTENDIBLE", "EXTENDIBLE".toLowerCase());
    fields.put("EXTENDIBLE_BY_DEFAULT", "EXTENDIBLE_BY_DEFAULT".toLowerCase());
    fields.put("SINKABLE", "SINKABLE".toLowerCase());
    fields.put("AMORTIZING", "AMORTIZING".toLowerCase());
    fields.put("INFLATION", "INFLATION".toLowerCase());
    fields.put("FUNGIBLE", "FUNGIBLE".toLowerCase());
    fields.put("ISSUER_RAT_EADB_S_T_DATE", "ISSUER_RAT_EADB_S_T_DATE".toLowerCase());
    fields.put("START_ACCRUAL_DATE", "START_ACCRUAL_DATE".toLowerCase());
    
    fields.put("ISSUER_ULTIMATE_PARENT_NAME", "ISSUER_ULTIMATE_PARENT_NAME".toLowerCase());
    fields.put("ISSUER_ULTIMATE_PARENT_ID", "ISSUER_ULTIMATE_PARENT_ID".toLowerCase());
    fields.put("ISSUER_PARENT_NAME", "ISSUER_PARENT_NAME".toLowerCase());
    fields.put("ISSUER_PARENT_ID", "ISSUER_PARENT_ID".toLowerCase());
    fields.put("EXTENDIBLE_BY_BOND_HOLDER", "EXTENDIBLE_BY_BOND_HOLDER".toLowerCase());
    fields.put("EXTENDIBLE_BY_ISSUER", "EXTENDIBLE_BY_ISSUER".toLowerCase());
    fields.put("EADB_LISTED", "EADB_LISTED".toLowerCase());
    fields.put("PUT_TYPE", "PUT_TYPE".toLowerCase());
    fields.put("CALL_TYPE", "CALL_TYPE".toLowerCase());
    fields.put("CALIBRATION_BOND", "CALIBRATION_BOND".toLowerCase());
    
    fields.put("EXTENSION_TYPE", "EXTENSION_TYPE".toLowerCase());
    fields.put("EXPECTED_MATURATION", "EXPECTED_MATURATION".toLowerCase());
    fields.put("EXPECTED_DELISTING", "EXPECTED_DELISTING".toLowerCase());
    fields.put("ERROR_CODE", "ERROR_CODE".toLowerCase());
    fields.put("CALCULATION_TYPE", "CALCULATION_TYPE".toLowerCase());
    fields.put("INDICATOR_MULTILEG", "INDICATOR_MULTILEG".toLowerCase());
    fields.put("IMPLICIT_MULTILEG", "IMPLICIT_MULTILEG".toLowerCase());
    fields.put("INFLATION_INDEX_RATIO_FRML", "INFLATION_INDEX_RATIO_FRML".toLowerCase());
    fields.put("NOMINAL_REDEMPTION_FRML", "NOMINAL_REDEMPTION_FRML".toLowerCase());
    fields.put("IS_IN_MANUAL_INTERACTION", "IS_IN_MANUAL_INTERACTION".toLowerCase());
    fields.put("ERROR_CODE_FOR_DEFAULT_VALUE", "ERROR_CODE_FOR_DEFAULT_VALUE".toLowerCase());
    
    

    
    
  }
}