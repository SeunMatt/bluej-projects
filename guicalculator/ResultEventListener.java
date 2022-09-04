import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

/**
 * Write a description of class ResultEventListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResultEventListener implements ActionListener {
    
    private AdditionGuiCalculator additionGuiCalculator;
    
    /**
     * Constructor for objects of class ResultEventListener
     */
    public ResultEventListener(AdditionGuiCalculator additionGuiCalculator) { 
        this.additionGuiCalculator = additionGuiCalculator;
    }
    
    
    public void actionPerformed(ActionEvent e) {
        
         JTextField firstNumberInputField = additionGuiCalculator.getFirstNumberInputField();
         String firstNumberString = firstNumberInputField.getText();
         double firstNumber = Double.parseDouble(firstNumberString);
         
         JTextField secondNumberInputField = additionGuiCalculator.getSecondNumberInputField();
         String secondNumberString = secondNumberInputField.getText();
         double secondNumber = Double.parseDouble(secondNumberString);
         
         
         double result = additionGuiCalculator.addTwoNumbers(firstNumber, secondNumber);
         String resultString = String.valueOf(result);
         
         JLabel resultLabel = additionGuiCalculator.getResultLabel();   
         resultLabel.setText(resultString);
         
    }

    
}
