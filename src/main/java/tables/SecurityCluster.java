package tables;

public class SecurityCluster extends AbstractTable {

  static {
    addChildClasses(0, SecurityCluster.class);
  }

  public SecurityCluster() {
    tableNameOracle = "SECURITY_CLUSTER";
    tableNamePostgres = "security_cluster";

    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("CLUSTER_ID", "CLUSTER_ID".toLowerCase());
    fields.put("COUNTRY_WEIGHTING", "COUNTRY_WEIGHTING".toLowerCase());
    fields.put("ISSUER_WEIGHTING", "ISSUER_WEIGHTING".toLowerCase());
    fields.put("MATURITY_WEIGHTING", "MATURITY_WEIGHTING".toLowerCase());

  }
}
