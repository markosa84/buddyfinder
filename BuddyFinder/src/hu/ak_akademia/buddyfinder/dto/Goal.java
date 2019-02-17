package hu.ak_akademia.buddyfinder.dto;

public class Goal {
	
	private final int goalId;
	private final String name;

	public Goal(int goalId, String name) {
		this.goalId = goalId;
		this.name = name;
	}

	public int getGoalId() {
		return goalId;
	}

	public String getName() {
		return name;
	}

}
