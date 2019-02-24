package hu.ak_akademia.buddyfinder.dto;

public class Orientation {

	private final Integer orientationId;
	private final String orientationName;

	public Orientation(Integer orientationId, String orientationName) {
		this.orientationId = orientationId;
		this.orientationName = orientationName;
	}

	public Integer getOrientationId() {
		return orientationId;
	}

	public String getOrientationName() {
		return orientationName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orientationId == null) ? 0 : orientationId.hashCode());
		result = prime * result + ((orientationName == null) ? 0 : orientationName.hashCode());
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
		if (orientationId == null) {
			if (other.orientationId != null)
				return false;
		} else if (!orientationId.equals(other.orientationId))
			return false;
		if (orientationName == null) {
			if (other.orientationName != null)
				return false;
		} else if (!orientationName.equals(other.orientationName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Orientation [orientationId=" + orientationId + ", orientationName=" + orientationName + "]";
	}

}
