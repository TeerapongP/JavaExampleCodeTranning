package Inheritance;

// ParentPlayer class with common properties
public class ParentPlayer {
    private String code;
    private String food;
    private String tasks;

    // Getters for common properties
    public String getCode() {
        return code;
    }

    public String getFood() {
        return food;
    }

    public String getTasks() {
        return tasks;
    }

    // Setters for common properties
    public void setCode(String code) {
        this.code = code;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public void playStrategy() {
    }
}