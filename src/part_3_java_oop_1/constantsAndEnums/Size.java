package part_3_java_oop_1.constantsAndEnums;

public enum Size {

    VERY_SMALL("XS"),
    SMALL("S"),
    AVERAGE("M"),
    BIG("L"),
    VERY_BIG("XL");

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }
}
