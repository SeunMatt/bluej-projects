import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import java.util.Date;

public class Calculator extends JFrame implements ActionListener {
    
    private int score = 0;
    private JButton resetBt = new JButton();
    private JTextField firstNumber;
    private JTextField secondNumber;
    private JButton button;
    private JLabel resultLabel;
    private JLabel minusLabel;
    private JLabel equltoLabel;
       
    public Calculator(){
        frame();      
    }
    
    public Double logic(Double a, Double b){
       Double c = a - b;
        return c;
    }
    
    
    
    //main frame
    public void frame(){
           firstNumber = new JTextField();
           firstNumber.setColumns(5);
           firstNumber.setBackground(Color.GREEN);
           
           
           secondNumber = new JTextField();
           secondNumber.setColumns(5);
           secondNumber.setBackground(Color.GREEN);
            
        
        
           resultLabel = new JLabel();
           minusLabel = new JLabel("-");
           equltoLabel = new JLabel("=");
           
            
           //inputs panel
           JPanel inputspanel = new JPanel();
           inputspanel.setLayout( new FlowLayout(FlowLayout.CENTER));
           inputspanel.add(firstNumber);
           inputspanel.add(minusLabel);
           inputspanel.add(secondNumber);
           inputspanel.add(equltoLabel);
           inputspanel.add(resultLabel);
           inputspanel.setBackground(Color.GRAY);
           
           
        
        
           JButton button = new JButton("button");
           button.setBackground(Color.GREEN);
           button.addActionListener(this);
           
           JPanel buttonpanel = new JPanel();
           buttonpanel.add(button);
           buttonpanel.setBackground(Color.BLUE);
      
       
        
        
        // JFrame
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Simple Calculator");
        setSize(300,200);
        
        add(inputspanel,BorderLayout.CENTER);
        setLocationRelativeTo(null);
        add(buttonpanel,BorderLayout.SOUTH);
    
        
    }
    public void actionPerformed( ActionEvent e){
       String firstNumberString = firstNumber.getText();
        double firstNumber = Double.parseDouble(firstNumberString);

        String secondNumberString = secondNumber.getText();
        double secondNumber = Double.parseDouble(secondNumberString);

        double result = logic(firstNumber, secondNumber);
        String resultString = String.valueOf(result);

        resultLabel.setText(resultString);
      
      
    
      
      
      
      
    }
    
    
    
    // main method 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
                new Calculator();
            });
    }
}