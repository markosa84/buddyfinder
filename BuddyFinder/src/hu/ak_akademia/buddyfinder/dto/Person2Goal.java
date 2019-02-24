package hu.ak_akademia.buddyfinder.dto;

public class Person2Goal {

	private final Integer person2goalId;
	private final Integer goalId;
	private final Integer personId;

	public Person2Goal(Integer goal2personId, Integer goalId, Integer personId) {
		this.person2goalId = goal2personId;
		this.goalId = goalId;
		this.personId = personId;
	}

	public Integer getGoal2personId() {
		return person2goalId;
	}

	public Integer getGoalId() {
		return goalId;
	}

	public Integer getPersonId() {
		return personId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((person2goalId == null) ? 0 : person2goalId.hashCode());
		result = prime * result + ((goalId == null) ? 0 : goalId.hashCode());
		result = prime * result + ((personId == null) ? 0 : personId.hashCode());
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
		Person2Goal other = (Person2Goal) obj;
		if (person2goalId == null) {
			if (other.person2goalId != null)
				return false;
		} else if (!person2goalId.equals(other.person2goalId))
			return false;
		if (goalId == null) {
			if (other.goalId != null)
				return false;
		} else if (!goalId.equals(other.goalId))
			return false;
		if (personId == null) {
			if (other.personId != null)
				return false;
		} else if (!personId.equals(other.personId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Goal2Person [goal2personId=");
		builder.append(person2goalId);
		builder.append(", goalId=");
		builder.append(goalId);
		builder.append(", personId=");
		builder.append(personId);
		builder.append("]");
		return builder.toString();
	}
 
}