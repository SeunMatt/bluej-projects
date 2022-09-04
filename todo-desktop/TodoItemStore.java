import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 * This class will store TodoItems in memory
 *
 * @author SeunMatt
 * @version 03/09/2022
 */
public class TodoItemStore {
    
    TodoItem [] itemStore = new TodoItem[0];

    /**
     * Constructor for objects of class TodoItemStore
     */
    public TodoItemStore() {}
    
    
    public TodoItem []  getAllTodoItems() {
         return itemStore;
    }
    
    public TodoItem getTodoItem(int index) {
        return itemStore[index];
    }
    
    public void updateTodoItem(TodoItem todoItem) {
        
        for(int i = 0; i < itemStore.length; i++) {
            TodoItem oldItem = itemStore[i];
            if(oldItem.getId().equals(todoItem.getId())) {
                itemStore[i] = todoItem;
                break;
            }
        }
        
    }
    
    
    public void deleteTodoItem(TodoItem todoItem) {
        //copy ALL the todoItems in the oldStore into the new Store
        //except the one that's to be deleted
        TodoItem [] newItemStore = new TodoItem[itemStore.length - 1];
        
        for(int i = 0; i < newItemStore.length; i++) {
            
            TodoItem itemToDelete = itemStore[i];
            if(itemToDelete.getId().equals(todoItem.getId())) {
                continue;
            }
            else {
                newItemStore[i] = itemStore[i];
            }
            
        }
        
        //switch reference
        itemStore = newItemStore;
        
    }
    
    
    public void addTodoItem(TodoItem todoItem) {
        
        int currentSize = itemStore.length;
        int MAX_SIZE = 10;
        
        if(currentSize == MAX_SIZE) {
            System.out.println("Store is full already!");
            return;
        }
        
        //copy ALL the todoItems in the oldStore into the new Store
        //except the one that's to be deleted
        TodoItem [] newItemStore = new TodoItem[itemStore.length + 1];
        
        for(int i = 0; i < itemStore.length; i++) {
            newItemStore[i] = itemStore[i];
        }
        
        //switch reference
        newItemStore[newItemStore.length - 1] = todoItem;
        itemStore = newItemStore;
        
    }

    
}
