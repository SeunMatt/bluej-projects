import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Write a description of class TodoUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TodoUI {
    
    private JTextField newTaskTextField;
    private JButton addNewTaskBt;
    private TodoItemStore itemStore;
    private JFrame frame;
    private JPanel todoItemList;
    
    public TodoUI() {
        
        frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setTitle("Simple Calculator");
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        
        //add panels
        frame.add(composeNewTaskPanel(), BorderLayout.NORTH);
        
        //instantiante the itemStore
        itemStore = new TodoItemStore();
        
        //add items to the store
        TodoItem todoItem = new TodoItem();
        todoItem.setTask("Go to church");
        itemStore.addTodoItem(todoItem);
        
        TodoItem todoItem2 = new TodoItem();
        todoItem2.setTask("Go to school");
        itemStore.addTodoItem(todoItem2);
        
    
        
        TodoItem[] todoItems = itemStore.getAllTodoItems();
        todoItemList = composeTodoItemListView(todoItems);
        frame.add(todoItemList, BorderLayout.CENTER);
        
        
        frame.setVisible(true);
        
        
        addListeners();
    
    }
    
    
    private void addListeners() {
        addNewTaskBt.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               
               //add new item to the store
               String task = newTaskTextField.getText();
               TodoItem todoItem = new TodoItem();
               todoItem.setTask(task);
               itemStore.addTodoItem(todoItem);
               
               
               //show all the list of items
               TodoItem[] todoItems = itemStore.getAllTodoItems();
               
               todoItemList.add(composeSingleTodoItemView(todoItem));
               
               //redraw
               todoItemList.invalidate();
               todoItemList.validate();
               
               
               
           }
        });
        
    }
    
    
    private JPanel composeNewTaskPanel() {
        
        newTaskTextField = new JTextField();
        newTaskTextField.setColumns(20);
        
        addNewTaskBt = new JButton("Add Task");
        
        JPanel addNewBtPanel = new JPanel();
        addNewBtPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        addNewBtPanel.add(newTaskTextField);
        addNewBtPanel.add(addNewTaskBt);
        
        return addNewBtPanel;
    }
    
    
    private JPanel composeSingleTodoItemView(TodoItem todoItem) {
        
        JLabel todoItemLabel = new JLabel();
        todoItemLabel.setText(todoItem.getTask());
        todoItemLabel.setBackground(Color.WHITE);
        
        JButton deleteBt = new JButton("DELETE");
        deleteBt.setBackground(Color.RED);
        deleteBt.setOpaque(true);
        
        JPanel singleTodoItemPanel = new JPanel();
        singleTodoItemPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        singleTodoItemPanel.add(todoItemLabel);
        singleTodoItemPanel.add(deleteBt);
        
        
        return singleTodoItemPanel;
        
    }
    
    
    private JPanel composeTodoItemListView(TodoItem[] todoItems) {
        
        JPanel todoItemsListView = new JPanel();
        todoItemsListView.setLayout(new FlowLayout(FlowLayout.LEFT));
        todoItemsListView.setBackground(Color.GREEN);
        
        for(int i = 0; i < todoItems.length; i++) {
            JPanel singleView = composeSingleTodoItemView(todoItems[i]);
            todoItemsListView.add(singleView);
        }
        
        return todoItemsListView;
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
                new TodoUI();
            });
    }

}
