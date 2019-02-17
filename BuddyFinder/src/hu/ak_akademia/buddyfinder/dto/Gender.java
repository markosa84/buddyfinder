package hu.ak_akademia.buddyfinder.dto;

public enum Gender {
	MALE('M'),FEMALE('F');
	private char sign;

	public char getSign() {
		return sign;
	}

	private Gender(char sign) {
		this.sign = sign;
	}
	
}
