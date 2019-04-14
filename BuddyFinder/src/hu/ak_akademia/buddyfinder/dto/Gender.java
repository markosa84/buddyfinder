package hu.ak_akademia.buddyfinder.dto;

public enum Gender {

    MALE("M"), FEMALE("F");

    private final String sign;

    private Gender(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public static Gender fromSign(String sign) {
        for (Gender gender : values()) {
            if (gender.getSign()
                    .equals(sign)) {
                return gender;
            }
        }
        throw new IllegalArgumentException("Érvénytelen nem azonosító.");
    }

}