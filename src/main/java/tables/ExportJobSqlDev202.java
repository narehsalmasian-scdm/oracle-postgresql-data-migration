package tables;

public class ExportJobSqlDev202 extends  AbstractTable {

  static {
    addChildClasses(0, ExportJobSqlDev202.class);
  }

  public ExportJobSqlDev202() {
    tableNameOracle = "EXPORT_JOB_SQLDEV_202";
    tableNamePostgres = "export_job_sqldev_202";
    
    
  fields.put("PROCESS_ORDER", "PROCESS_ORDER".toLowerCase());
  fields.put("DUPLICATE", "DUPLICATE".toLowerCase());
  fields.put("DUMP_FILEID", "DUMP_FILEID".toLowerCase());
  fields.put("DUMP_POSITION", "DUMP_POSITION".toLowerCase());
  fields.put("DUMP_LENGTH", "DUMP_LENGTH".toLowerCase());
  fields.put("DUMP_ORIG_LENGTH", "DUMP_ORIG_LENGTH".toLowerCase());
  fields.put("DUMP_ALLOCATION", "DUMP_ALLOCATION".toLowerCase());
  fields.put("COMPLETED_ROWS", "COMPLETED_ROWS".toLowerCase());
  fields.put("ERROR_COUNT", "ERROR_COUNT".toLowerCase());
  fields.put("ELAPSED_TIME", "ELAPSED_TIME".toLowerCase());
  fields.put("OBJECT_TYPE_PATH", "OBJECT_TYPE_PATH".toLowerCase());
  fields.put("OBJECT_PATH_SEQNO", "OBJECT_PATH_SEQNO".toLowerCase());
  fields.put("OBJECT_TYPE", "OBJECT_TYPE".toLowerCase());
  fields.put("IN_PROGRESS", "IN_PROGRESS".toLowerCase());
  fields.put("OBJECT_NAME", "OBJECT_NAME".toLowerCase());
  fields.put("OBJECT_LONG_NAME", "OBJECT_LONG_NAME".toLowerCase());
  fields.put("OBJECT_SCHEMA", "OBJECT_SCHEMA".toLowerCase());
  fields.put("ORIGINAL_OBJECT_SCHEMA", "ORIGINAL_OBJECT_SCHEMA".toLowerCase());
  fields.put("ORIGINAL_OBJECT_NAME", "ORIGINAL_OBJECT_NAME".toLowerCase());
  fields.put("PARTITION_NAME", "PARTITION_NAME".toLowerCase());
  fields.put("SUBPARTITION_NAME", "SUBPARTITION_NAME".toLowerCase());
  fields.put("DATAOBJ_NUM", "DATAOBJ_NUM".toLowerCase());
  fields.put("FLAGS", "FLAGS".toLowerCase());
  
  fields.put("PROPERTY", "PROPERTY".toLowerCase());
  fields.put("TRIGFLAG", "TRIGFLAG".toLowerCase());
  fields.put("CREATION_LEVEL", "CREATION_LEVEL".toLowerCase());
  fields.put("COMPLETION_TIME", "COMPLETION_TIME".toLowerCase());
  fields.put("OBJECT_TABLESPACE", "OBJECT_TABLESPACE".toLowerCase());
  fields.put("SIZE_ESTIMATE", "SIZE_ESTIMATE".toLowerCase());
  fields.put("OBJECT_ROW", "OBJECT_ROW".toLowerCase());
  fields.put("PROCESSING_STATE", "PROCESSING_STATE".toLowerCase());
  fields.put("PROCESSING_STATUS", "PROCESSING_STATUS".toLowerCase());
  fields.put("BASE_PROCESS_ORDER", "BASE_PROCESS_ORDER".toLowerCase());
  fields.put("BASE_OBJECT_TYPE", "BASE_OBJECT_TYPE".toLowerCase());
  fields.put("BASE_OBJECT_NAME", "BASE_OBJECT_NAME".toLowerCase());
  fields.put("BASE_OBJECT_SCHEMA", "BASE_OBJECT_SCHEMA".toLowerCase());
  fields.put("ANCESTOR_PROCESS_ORDER", "ANCESTOR_PROCESS_ORDER".toLowerCase());
  fields.put("DOMAIN_PROCESS_ORDER", "DOMAIN_PROCESS_ORDER".toLowerCase());
  fields.put("PARALLELIZATION", "PARALLELIZATION".toLowerCase());
  fields.put("UNLOAD_METHOD", "UNLOAD_METHOD".toLowerCase());
  fields.put("LOAD_METHOD", "LOAD_METHOD".toLowerCase());
  fields.put("GRANULES", "GRANULES".toLowerCase());
  fields.put("SCN", "SCN".toLowerCase());
  fields.put("GRANTOR", "GRANTOR".toLowerCase());
  fields.put("XML_CLOB", "XML_CLOB".toLowerCase());
  fields.put("PARENT_PROCESS_ORDER", "PARENT_PROCESS_ORDER".toLowerCase());
  fields.put("NAME", "NAME".toLowerCase());
  fields.put("VALUE_T", "VALUE_T".toLowerCase());
  fields.put("VALUE_N", "VALUE_N".toLowerCase());
  fields.put("IS_DEFAULT", "IS_DEFAULT".toLowerCase());
  fields.put("FILE_TYPE", "FILE_TYPE".toLowerCase());
  fields.put("USER_DIRECTORY", "USER_DIRECTORY".toLowerCase());
  fields.put("USER_FILE_NAME", "USER_FILE_NAME".toLowerCase());
  fields.put("FILE_NAME", "FILE_NAME".toLowerCase());
  fields.put("EXTEND_SIZE", "EXTEND_SIZE".toLowerCase());
  fields.put("FILE_MAX_SIZE", "FILE_MAX_SIZE".toLowerCase());
  fields.put("PROCESS_NAME", "PROCESS_NAME".toLowerCase());
  fields.put("LAST_UPDATE", "LAST_UPDATE".toLowerCase());
  fields.put("WORK_ITEM", "WORK_ITEM".toLowerCase());
  fields.put("OBJECT_NUMBER", "OBJECT_NUMBER".toLowerCase());
  fields.put("COMPLETED_BYTES", "COMPLETED_BYTES".toLowerCase());
  fields.put("TOTAL_BYTES", "TOTAL_BYTES".toLowerCase());
  fields.put("METADATA_IO", "METADATA_IO".toLowerCase());
  fields.put("DATA_IO", "DATA_IO".toLowerCase());
  fields.put("CUMULATIVE_TIME", "CUMULATIVE_TIME".toLowerCase());
  fields.put("PACKET_NUMBER", "PACKET_NUMBER".toLowerCase());
  fields.put("INSTANCE_ID", "INSTANCE_ID".toLowerCase());
  fields.put("OLD_VALUE", "OLD_VALUE".toLowerCase());
  fields.put("SEED", "SEED".toLowerCase());
  fields.put("LAST_FILE", "LAST_FILE".toLowerCase());
  fields.put("USER_NAME", "USER_NAME".toLowerCase());
  fields.put("OPERATION", "OPERATION".toLowerCase());
  fields.put("JOB_MODE", "JOB_MODE".toLowerCase());
  fields.put("QUEUE_TABNUM", "QUEUE_TABNUM".toLowerCase());
  fields.put("CONTROL_QUEUE", "CONTROL_QUEUE".toLowerCase());
  fields.put("STATUS_QUEUE", "STATUS_QUEUE".toLowerCase());
  fields.put("REMOTE_LINK", "REMOTE_LINK".toLowerCase());
  fields.put("VERSION", "VERSION".toLowerCase());
  fields.put("JOB_VERSION", "JOB_VERSION".toLowerCase());
  fields.put("DB_VERSION", "DB_VERSION".toLowerCase());
  fields.put("TIMEZONE", "TIMEZONE".toLowerCase());
  fields.put("STATE", "STATE".toLowerCase());
  fields.put("PHASE", "PHASE".toLowerCase());
  fields.put("GUID", "GUID".toLowerCase());
  fields.put("START_TIME", "START_TIME".toLowerCase());
  fields.put("BLOCK_SIZE", "BLOCK_SIZE".toLowerCase());
  fields.put("METADATA_BUFFER_SIZE", "METADATA_BUFFER_SIZE".toLowerCase());
  fields.put("DATA_BUFFER_SIZE", "DATA_BUFFER_SIZE".toLowerCase());
  fields.put("DEGREE", "DEGREE".toLowerCase());
  fields.put("PLATFORM", "PLATFORM".toLowerCase());
  fields.put("ABORT_STEP", "ABORT_STEP".toLowerCase());
  fields.put("INSTANCE", "INSTANCE".toLowerCase());
  fields.put("CLUSTER_OK", "CLUSTER_OK".toLowerCase());
  fields.put("SERVICE_NAME", "SERVICE_NAME".toLowerCase());
  fields.put("OBJECT_INT_OID", "OBJECT_INT_OID".toLowerCase());
}
}
