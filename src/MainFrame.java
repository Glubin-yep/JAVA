import Labs.Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField aValueField;
    private JTextField xStartField;
    private JTextField xEndField;
    private JTextField stepField;
    private JTextArea resultArea;

    public MainFrame() {
        setTitle("Lab4");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("a value:"));
        aValueField = new JTextField();
        add(aValueField);

        add(new JLabel("x Start:"));
        xStartField = new JTextField();
        add(xStartField);

        add(new JLabel("x End:"));
        xEndField = new JTextField();
        add(xEndField);

        add(new JLabel("Step:"));
        stepField = new JTextField();
        add(stepField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        add(calculateButton);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane);
    }

    private void calculate() {
        double a = Double.parseDouble(aValueField.getText());
        double xStart = Double.parseDouble(xStartField.getText());
        double xEnd = Double.parseDouble(xEndField.getText());
        double step = Double.parseDouble(stepField.getText());

        Lab4 function = new Lab4(a);
        function.createArrays(xStart, xEnd, step);

        int maxIndex = function.findMaxIndex();
        int minIndex = function.findMinIndex();

        double maxElement = function.getXfromIndex(maxIndex);
        double minElement = function.getXfromIndex(minIndex);


        StringBuilder result = new StringBuilder();
        result.append(findX(maxElement, minElement)).append("\n");
        result.append("Сума: ").append(function.getSum()).append("\n");
        result.append("Середнє арифметичне: ").append(function.getAverage()).append("\n");
        result.append("Кількість додатніх елементів, які мають номери більші за найменший елемент масиву: ").append(function.getTask4(function.findMinIndex())).append("\n");

        resultArea.setText(result.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setVisible(true);
            }
        });
    }

    public static String findX(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                // Рівняння має безліч розв'язків
                return ("Рівняння має безліч розв'язків");
            } else {
                // Рівняння не має розв'язків
                return ("Рівняння не має розв'язків");
            }
        } else {
            // Рівняння має один розв'язок
            double result = -b / a;
            return "ax + b = 0, де х = " + result;
        }
    }



}
