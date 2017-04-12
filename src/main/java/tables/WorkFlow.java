package tables;

public class WorkFlow extends AbstractTable {
  static {
    addChildClasses(0, WorkFlow.class);

  }

  public WorkFlow() {
    tableNameOracle = "WORKFLOW";
    tableNamePostgres = "WORKFLOW".toLowerCase();
    
    fields.put("ID", "ID".toLowerCase());
    fields.put("UPDATE_NOT_EXPECTED_TIME", "UPDATE_NOT_EXPECTED_TIME".toLowerCase());
    fields.put("BUSINESS_DAY", "BUSINESS_DAY".toLowerCase());
    fields.put("BUSINESS_DAY_CHANGE_TIMESTAMP", "BUSINESS_DAY_CHANGE_TIMESTAMP".toLowerCase());
    fields.put("IS_CURRENT", "IS_CURRENT".toLowerCase());
    fields.put("IS_EADB_RECEIVED", "IS_EADB_RECEIVED".toLowerCase());
    fields.put("IS_MP_REQUEST_PERMITTED", "IS_MP_REQUEST_PERMITTED".toLowerCase());
    fields.put("IS_FP_UPLOAD_PERMITTED", "IS_FP_UPLOAD_PERMITTED".toLowerCase());
    fields.put("IS_OUCB_UPLOAD_PERMITTED", "IS_OUCB_UPLOAD_PERMITTED".toLowerCase());
    fields.put("IS_NABS_RELEASE_PERMITTED", "IS_NABS_RELEASE_PERMITTED".toLowerCase());
    
    fields.put("TP_INFO_DISSEMINATED", "TP_INFO_DISSEMINATED".toLowerCase());
    fields.put("IS_NABS_RELEASE_SENT", "IS_NABS_RELEASE_SENT".toLowerCase());
    fields.put("IS_EADB_UPDATE_NOT_EXPECTED", "IS_EADB_UPDATE_NOT_EXPECTED".toLowerCase());
    fields.put("IS_EC_ACTIVATED", "IS_EC_ACTIVATED".toLowerCase());
    fields.put("IS_UNEXPECTED_EADB_RECEIVED", "IS_UNEXPECTED_EADB_RECEIVED".toLowerCase());
    fields.put("PROCESS_EADB_AFTER_RELEASE", "PROCESS_EADB_AFTER_RELEASE".toLowerCase());
    fields.put("UNPROCESSED_EADBS_EXIST", "UNPROCESSED_EADBS_EXIST".toLowerCase());
    fields.put("IS_BBG_SD_REC_MW", "IS_BBG_SD_REC_MW".toLowerCase());
    fields.put("IS_BBG_SD_REC_AW", "IS_BBG_SD_REC_AW".toLowerCase());
    fields.put("IS_WM_SD_REC_MW", "IS_WM_SD_REC_MW".toLowerCase());
    
    fields.put("IS_WM_SD_REC_AW", "IS_WM_SD_REC_AW".toLowerCase());
    fields.put("IS_BBG_SD_SENT_MW", "IS_BBG_SD_SENT_MW".toLowerCase());
    fields.put("IS_BBG_SD_SENT_AW", "IS_BBG_SD_SENT_AW".toLowerCase());
    fields.put("IS_WM_SD_SENT_MW", "IS_WM_SD_SENT_MW".toLowerCase());
    fields.put("IS_WM_SD_SENT_AW", "IS_WM_SD_SENT_AW".toLowerCase());
    fields.put("TP_VARIATION_PERCENTAGE", "TP_VARIATION_PERCENTAGE".toLowerCase());
    fields.put("IS_BBG_MD_SENT_AW", "IS_BBG_MD_SENT_AW".toLowerCase());
    fields.put("IS_BBG_MD_SENT_MW", "IS_BBG_MD_SENT_MW".toLowerCase());
    fields.put("IS_BBG_MD_REC_AW", "IS_BBG_MD_REC_AW".toLowerCase());
    fields.put("IS_BBG_MD_REC_MW", "IS_BBG_MD_REC_MW".toLowerCase());
    
    fields.put("IS_GENERATED_BBG_MD_SENT", "IS_GENERATED_BBG_MD_SENT".toLowerCase());
    fields.put("IS_BBG_MARKET_DATA_PERMITED", "IS_BBG_MARKET_DATA_PERMITED".toLowerCase());
    fields.put("MP_VARIATION_PERCENTAGE", "MP_VARIATION_PERCENTAGE".toLowerCase());
    fields.put("AI_VARIATION_PERCENTAGE", "AI_VARIATION_PERCENTAGE".toLowerCase());
    fields.put("IS_BBG_MP_SENT_AW", "IS_BBG_MP_SENT_AW".toLowerCase());
    fields.put("IS_BBG_MP_SENT_MW", "IS_BBG_MP_SENT_MW".toLowerCase());
    fields.put("IS_BBG_MP_REC_AW", "IS_BBG_MP_REC_AW".toLowerCase());
    fields.put("IS_BBG_MP_REC_MW", "IS_BBG_MP_REC_MW".toLowerCase());
    fields.put("IS_BBG_MP_SENT_CR", "IS_BBG_MP_SENT_CR".toLowerCase());
    fields.put("IS_BBG_MP_REC_CR", "IS_BBG_MP_REC_CR".toLowerCase());
    
    fields.put("IS_SB_PERFORMED_MW", "IS_SB_PERFORMED_MW".toLowerCase());
    fields.put("IS_COR_DONE_MW", "IS_COR_DONE_MW".toLowerCase());
    fields.put("IS_RATING_AGGREGATED_MW", "IS_RATING_AGGREGATED_MW".toLowerCase());
    fields.put("IS_BCC_DONE_MW", "IS_BCC_DONE_MW".toLowerCase());
    fields.put("IS_SCC_DONE_MW", "IS_SCC_DONE_MW".toLowerCase());
    fields.put("IS_PRICING_DONE_MW", "IS_PRICING_DONE_MW".toLowerCase());
    fields.put("IS_TP_VALIDATION_START_MW", "IS_TP_VALIDATION_START_MW".toLowerCase());
    fields.put("IS_AI_VALIDATION_START_MW", "IS_AI_VALIDATION_START_MW".toLowerCase());
    fields.put("IS_SB_PERFORMED_AW", "IS_SB_PERFORMED_AW".toLowerCase());
    fields.put("IS_MP_GENERATED_AW", "IS_MP_GENERATED_AW".toLowerCase());
    
    fields.put("IS_COR_DONE_AW", "IS_COR_DONE_AW".toLowerCase());
    fields.put("IS_RATING_AGGREGATED_AW", "IS_RATING_AGGREGATED_AW".toLowerCase());
    
    fields.put("IS_PRICING_DONE_AW", "IS_PRICING_DONE_AW".toLowerCase());
    fields.put("IS_TP_VALIDATION_START_AW", "IS_TP_VALIDATION_START_AW".toLowerCase());
    fields.put("IS_AI_VALIDATION_START_AW", "IS_AI_VALIDATION_START_AW".toLowerCase());
    fields.put("SKIP_CALIBRATION", "SKIP_CALIBRATION".toLowerCase());
    fields.put("IS_ECONOM_CONS_DONE_MW", "IS_ECONOM_CONS_DONE_MW".toLowerCase());
    fields.put("IS_CURVE_ASSGNMT_DONE_MW", "IS_CURVE_ASSGNMT_DONE_MW".toLowerCase());
    fields.put("IS_CURVE_ASSGNMT_DONE_AW", "IS_CURVE_ASSGNMT_DONE_AW".toLowerCase());
    fields.put("DISABLE_WORKFLOW", "DISABLE_WORKFLOW".toLowerCase());
    fields.put("SHOW_MMSD_BTN", "SHOW_MMSD_BTN".toLowerCase());
    fields.put("SHOW_CLUSTER_RATING_BTN", "SHOW_CLUSTER_RATING_BTN".toLowerCase());
    fields.put("DISABLE_AUTO_BD_CHANGE", "DISABLE_AUTO_BD_CHANGE".toLowerCase());
    
    
  }
}