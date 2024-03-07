package lovie.task;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String toString() {
        return this.description + " | " + (isDone ? "1" : "0");
    }

    public String getDescription() {
        return description;
    }

    public String getStatusIcon() {
        return (isDone ? "✓" : " ");
    }

    public void markAsDone() {

        this.isDone = true;
    }

    public void markAsUndone() {
        this.isDone = false;
    }

    public String getTaskIcon() {
        return "";
    }

    public String getTimespan() {
        return "";
    }
}
