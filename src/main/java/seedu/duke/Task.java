package seedu.duke;

public class Task {
    private String description;
    private boolean isDone;
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getIsDone() {
        return this.isDone;
    }
    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }
}