package hu.ak_akademia.buddyfinder.dto;

public class Goal2Person {

    private final int goal2personId;
    private final int goalId;
    private final int personId;

    public Goal2Person(int goal2personId, int goalId, int personId) {
        this.goal2personId = goal2personId;
        this.goalId = goalId;
        this.personId = personId;
    }

    public int getGoal2personId() {
        return goal2personId;
    }

    public int getGoalId() {
        return goalId;
    }

    public int getPersonId() {
        return personId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + goal2personId;
        result = prime * result + goalId;
        result = prime * result + personId;
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
        if (!(obj instanceof Goal2Person)) {
            return false;
        }
        Goal2Person other = (Goal2Person) obj;
        if (goal2personId != other.goal2personId) {
            return false;
        }
        if (goalId != other.goalId) {
            return false;
        }
        if (personId != other.personId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Goal2Person [goal2personId=");
        builder.append(goal2personId);
        builder.append(", goalId=");
        builder.append(goalId);
        builder.append(", personId=");
        builder.append(personId);
        builder.append("]");
        return builder.toString();
    }

}