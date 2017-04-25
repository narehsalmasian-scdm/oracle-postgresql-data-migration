package tables;

public class ExportJobSqlDev201 extends AbstractTable {

  static {
    addChildClasses(0, ExportJobSqlDev201.class);
  }

  public ExportJobSqlDev201() {
    tableNameOracle = "EXPORT_JOB_SQLDEV_201";
    tableNamePostgres = "export_job_sqldev_201";

    tableCreaterQuery = "CREATE TABLE" + "public.export_job_sqldev_201" + "(" +
        "    process_order double precision," +
        "   duplicate double precision," +
        "   dump_fileid double precision," +
        "   dump_position double precision," +
        "   dump_length double precision," +
        "   dump_orig_length double precision," +
        "    dump_allocation double precision," +
        "    completed_rows double precision," +
        "   error_count double precision," +
        "   elapsed_time double precision," +
        "  object_type_path character varying," +
        "   object_path_seqno double precision," +
        "  object_type character varying," +
        "  in_progress character(1)," +
        "  object_name character varying," +
        "  object_long_name character varying," +
        "   object_schema character varying," +
        "    original_object_schema character varying," +
        "   original_object_name character varying," +
        "     partition_name character varying," +
        "    subpartition_name character varying," +
        "    dataobj_num double precision," +
        "   flags double precision," +
        "   property double precision," +
        "  trigflag double precision," +
        "   creation_level double precision," +
        "  completion_time timestamp without time zone," +
        "   object_tablespace character varying," +
        "   size_estimate double precision," +
        "  object_row double precision," +
        "  processing_state character(1)," +
        "    processing_status character(1)," +
        "    base_process_order double precision," +
        "    base_object_type character varying," +
        "   base_object_name character varying," +
        "   base_object_schema character varying," +
        "   ancestor_process_order double precision," +
        "   domain_process_order double precision," +
        "    parallelization double precision," +
        "   unload_method double precision," +
        "    load_method double precision," +
        "  granules double precision," +
        "   scn double precision," +
        "    grantor character varying," +
        "  xml_clob text," +
        "  parent_process_order double precision," +
        "  name character varying," +
        "   value_t character varying," +
        "   value_n double precision," +
        "    is_default double precision," +
        "   file_type double precision," +
        "   user_directory character varying," +
        "    user_file_name character varying," +
        "   file_name character varying," +
        "    extend_size double precision," +
        "   file_max_size double precision," +
        "   process_name character varying," +
        "  last_update timestamp without time zone," +
        "   work_item character varying," +
        "  object_number double precision," +
        "  completed_bytes double precision," +
        "  total_bytes double precision," +
        "   metadata_io double precision," +
        "   data_io double precision," +

        "   cumulative_time double precision," +
        "    packet_number double precision," +
        "   instance_id double precision," +
        "    old_value character varying," +
        "   seed double precision," +
        "   last_file double precision," +
        "     user_name character varying," +
        "    operation character varying," +
        "   job_mode character varying," +
        "  queue_tabnum double precision," +
        "  control_queue character varying," +
        "   status_queue character varying," +
        "    remote_link character varying," +
        "    version double precision" +
        "    job_version character varying" +
        "    db_version character varying," +
        "    timezone character varying," +
        "     status character varying," +
        "    phase double precision," +
        "   guid bytea," +
        "  start_time timestamp without time zone," +
        "    block_size double precision," +
        "  metadata_buffer_size double precision," +
        "   data_buffer_size double precision," +
        "  degree double precision," +
        "   platform character varying," +
        "   abort_step double precision," +

        "  instance character varying," +
        "  cluster_ok double precision," +
        "  service_name character varying," +
        "    object_int_oid character varying" +

        ")"
        + "WITH (OIDS=FALSE);"
        + "ALTER TABLE public.export_job_sqldev_201 OWNER TO postgres;" + ";";

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
    fields.put("ORIGINAL_OBJECT_SCHEMA",
        "ORIGINAL_OBJECT_SCHEMA".toLowerCase());
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
    fields.put("ANCESTOR_PROCESS_ORDER",
        "ANCESTOR_PROCESS_ORDER".toLowerCase());
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
