package tables;

public class SequrityCluster extends AbstractTable {

  static {
    tableNameOracle = "SEQURITY_CLUSTER";
    tableNamePostgres = "sequrity_cluster";

    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("CLUSTER_ID", "CLUSTER_ID".toLowerCase());
    fields.put("COUNTRY_WEIGHTING", "COUNTRY_WEIGHTING".toLowerCase());
    fields.put("ISSUER_WEIGHTING", "ISSUER_WEIGHTING".toLowerCase());
    fields.put("MATURITY_WEIGHTING", "MATURITY_WEIGHTING".toLowerCase());

  }
}
