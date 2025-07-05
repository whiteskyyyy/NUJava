package activity7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField textField1, textField2, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton, moduloButton, clearButton;

    public CalculatorGUI() {
        setTitle("Swing Arithmetic");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add text fields
        JPanel panel1 = new JPanel(new GridLayout(2, 2));
        JLabel label1 = new JLabel("First Number:");
        panel1.add(label1);
        textField1 = new JTextField(10);
        panel1.add(textField1);
        JLabel label2 = new JLabel("Second Number:");
        panel1.add(label2);
        textField2 = new JTextField(10);
        panel1.add(textField2);

        // Create and add result field
        JPanel resultPanel = new JPanel(new GridLayout(2, 2));
        JLabel resultLabel = new JLabel("Result:");
        resultPanel.add(resultLabel);
        resultField = new JTextField(10);
        resultPanel.add(resultField);
        resultField.setEditable(false);
        // Create and add buttons
        JPanel buttonPanel = new JPanel(new GridLayout(2, 3));
        addButton = new JButton("+");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);
        subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        buttonPanel.add(subtractButton);
        multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        buttonPanel.add(multiplyButton);
        divideButton = new JButton("/");
        divideButton.addActionListener(this);
        buttonPanel.add(divideButton);
        moduloButton = new JButton("%");
        moduloButton.addActionListener(this);
        buttonPanel.add(moduloButton);
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        // Add text fields and result field to a single panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 1));
        inputPanel.add(panel1);
        inputPanel.add(resultPanel);
        inputPanel.add(Box.createVerticalGlue()); // Aligns inputPanel to the top of the mainPanel

        // Add text fields and buttons to a single panel
        JPanel operationPanel = new JPanel(new BorderLayout());
        operationPanel.add(inputPanel, BorderLayout.NORTH);
        operationPanel.add(buttonPanel, BorderLayout.CENTER);

        // Add panels to frame
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(operationPanel, BorderLayout.CENTER);
        add(mainPanel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get values from text fields
        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());
        double result = 0;

        // Perform operation and display result
        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2;
        } else if (e.getSource() == divideButton) {
            result = num1 / num2;
        } else if (e.getSource() == moduloButton) {
            result = num1 % num2;
        } else if (e.getSource() == clearButton) {
            textField1.setText("");
            textField2.setText("");
            resultField.setText("");
        }
        resultField.setText(Double.toString(result));
    }

    public static void main(String[] args) {
        CalculatorGUI calculator = new CalculatorGUI();
    }
}
