import java.util.Date;

/**
 * The TodoItem object
 *
 * @author SeunMatt
 * @version 03/09/2022
 */
public class TodoItem {
    
    private String status;
    private Date dueDate;
    private String id;
    private String task;

    /**
     * Constructor for objects of class TodoItem
     */
    public TodoItem() {
    }

    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    
    public Date getDueDate() {
        return this.dueDate;
    }
    
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setTask(String task) {
        this.task = task;
    }
    
    public String getTask() {
        return this.task;
    }
    
}
