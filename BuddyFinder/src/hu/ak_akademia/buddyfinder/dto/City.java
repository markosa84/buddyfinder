package hu.ak_akademia.buddyfinder.dto;

public class City {

    private final Integer cityId;
    private final String cityName;

    public City(Integer cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

	public Integer getCityId() {
		return cityId;
	}

    public String getCityName() {
        return cityName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cityId == null) ? 0 : cityId.hashCode());
        result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof City)) {
            return false;
        }
        City other = (City) obj;
        if (cityId == null) {
            if (other.cityId != null) {
                return false;
            }
        } else if (!cityId.equals(other.cityId)) {
            return false;
        }
        if (cityName == null) {
            if (other.cityName != null) {
                return false;
            }
        } else if (!cityName.equals(other.cityName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("City [cityId=");
        builder.append(cityId);
        builder.append(", cityName=");
        builder.append(cityName);
        builder.append("]");
        return builder.toString();
    }

}