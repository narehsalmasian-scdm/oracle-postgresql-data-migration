package tables;

public class RealSecurityToCluster extends AbstractTable {
  static {
    addChildClasses(0, RealSecurityToCluster.class);

  }

  public RealSecurityToCluster() {
    tableNameOracle = "REAL_SECURITY_TO_CLUSTER";
    tableNamePostgres = "REAL_SECURITY_TO_CLUSTER".toLowerCase();
    fields.put("CLUSTER_NAME", "CLUSTER_NAME".toLowerCase());
    fields.put("SECURITY_ID", "SECURITY_ID".toLowerCase());
    fields.put("COUNTRY_WEIGHTING", "COUNTRY_WEIGHTING".toLowerCase());
    
  }
}

