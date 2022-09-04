import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class AdditionGuiCalculator here.
 *
 * @author SeunMatt
 * @version 16/07/2022
 */
public class AdditionGuiCalculator {
    
    private JTextField firstNumberInputField;
    private JTextField secondNumberInputField;
    private JLabel resultLabel;
    
    
    

    /**
     * Constructor for objects of class AdditionGuiCalculator
     */
    public AdditionGuiCalculator() {
        composeGUI();
    }
    
    
    
    public double addTwoNumbers(double a, double b) {
        double c = a + b;
        return c;
    }
    
    private void composeGUI() {
        
        //construct the upper row 
        firstNumberInputField = new JTextField();
        firstNumberInputField.setColumns(5);
            
        secondNumberInputField = new JTextField();
        secondNumberInputField.setColumns(5);
        
        resultLabel = new JLabel();
        JLabel plusSignLabel = new JLabel("+");
        JLabel equalsToLabel = new JLabel("=");
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        inputPanel.add(firstNumberInputField);
        inputPanel.add(plusSignLabel);
        inputPanel.add(secondNumberInputField);
        inputPanel.add(equalsToLabel);
        inputPanel.add(resultLabel);
        
        //construct the button panel
        JButton resultButton = new JButton("Result");
        ResultEventListener resultEventListener = new ResultEventListener(this);
        resultButton.addActionListener(resultEventListener);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(resultButton);
        
        
        //add the two panels to the JFrame
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Addition of two numbers");
        jFrame.setLayout(new BorderLayout());
        
        jFrame.add(inputPanel, BorderLayout.CENTER);
        jFrame.add(buttonPanel, BorderLayout.SOUTH);
        
        Dimension jFrameSize = new Dimension(300, 200);
        jFrame.setSize(jFrameSize);
        
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        
    }
    
    
    public JTextField getFirstNumberInputField() {
        return firstNumberInputField;
    }
    
    public JTextField getSecondNumberInputField() {
        return secondNumberInputField;
    }
    
    public JLabel getResultLabel() {
        return resultLabel;
    }

    
    
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AdditionGuiCalculator();
        });
    }
    
}
