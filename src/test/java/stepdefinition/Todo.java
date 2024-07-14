package stepdefinition;

public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;

    // Constructor with all fields
    public Todo(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    // Getters and Setters for all fields

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

//    // toString method (optional, for debugging purposes)
//    @Override
//    public String toString() {
//        return "Todo{" +
//                "userId=" + userId +
//                ", id=" + id +
//                ", title='" + title + '\'' +
//                ", completed=" + completed +
//                '}';
//    }
    
    
}


