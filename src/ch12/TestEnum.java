package ch12;

public enum TestEnum {
    First("family"), Second("dobi");

    String value;

    TestEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
