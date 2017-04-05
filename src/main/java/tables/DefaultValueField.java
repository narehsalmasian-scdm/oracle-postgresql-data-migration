package tables;

public class DefaultValueField extends  AbstractTable {

  static {
    addChildClasses(0, DefaultValueField.class);
  }

  public DefaultValueField() {
    tableNameOracle = "DEFAULT_VALUE_FIELD";
    tableNamePostgres = "default_value_field";

    fields.put("ID", "ID".toLowerCase());
    fields.put("ISIN", "ISIN".toLowerCase());
    fields.put("FIELD_NAME", "FIELD_NAME".toLowerCase());
    fields.put("ELEMENT_ID", "ELEMENT_ID".toLowerCase());

  }
}