package hu.ak_akademia.buddyfinder.dto;

public class Orientation {

	private final int orientationId;
	private final int orientationName;

	public Orientation(int orientationId, int orientationName) {
		this.orientationId = orientationId;
		this.orientationName = orientationName;
	}

	public int getOrientationId() {
		return orientationId;
	}

	public int getOrientationName() {
		return orientationName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orientationId;
		result = prime * result + orientationName;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orientation other = (Orientation) obj;
		if (orientationId != other.orientationId)
			return false;
		if (orientationName != other.orientationName)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Orientation [orientationId=" + orientationId + ", orientationName=" + orientationName + "]";
	}

}
