package hu.ak_akademia.buddyfinder.dto;

public class goal {
	
	private final int goalId;
	private final String name;

	public goal(int goalId, String name) {
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
