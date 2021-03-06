package hu.ak_akademia.buddyfinder.dto;

public enum Status {

    ACTIVE('A'), DELETED('D');

    private final char sign;

    private Status(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

}