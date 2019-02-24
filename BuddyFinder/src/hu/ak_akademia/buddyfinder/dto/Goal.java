package hu.ak_akademia.buddyfinder.dto;

public class Goal {

    private final Integer goalId;
    private final String goalName;

    public Goal(Integer goalId, String goalName) {
        this.goalId = goalId;
        this.goalName = goalName;
    }

    public Integer getGoalId() {
        return goalId;
    }

    public String getGoalName() {
        return goalName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((goalId == null) ? 0 : goalId.hashCode());
        result = prime * result + ((goalName == null) ? 0 : goalName.hashCode());
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
        if (!(obj instanceof Goal)) {
            return false;
        }
        Goal other = (Goal) obj;
        if (goalId == null) {
            if (other.goalId != null) {
                return false;
            }
        } else if (!goalId.equals(other.goalId)) {
            return false;
        }
        if (goalName == null) {
            if (other.goalName != null) {
                return false;
            }
        } else if (!goalName.equals(other.goalName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Goal [goalId=");
        builder.append(goalId);
        builder.append(", goalName=");
        builder.append(goalName);
        builder.append("]");
        return builder.toString();
    }

}