package hu.ak_akademia.buddyfinder.dto;

public enum Gender {

    MALE('M'), FEMALE('F');

    private final char sign;

    private Gender(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

}