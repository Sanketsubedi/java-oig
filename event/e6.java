//swing application with two input text box and a button which when clicked,
// it should write the result of two string in text box to console after converting to UPPERCASE
//2016 Fall 4a
package event;
import javax.swing.*;
import java.awt.event.*;

public class e6 extends JFrame{
    e6(){
        JTextField textField = new JTextField();
        textField.setBounds(0, 50, 170, 20);
        JTextField textField1 = new JTextField();
        textField1.setBounds(170, 50, 170, 20);
        JButton button = new JButton("Click");
        button.setBounds(90, 140, 75, 40);
        add(textField);
        add(textField1);
        add(button);
        setSize(250, 250);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                //taking text from inputs
                String getValue = textField.getText();
                String getValue1 = textField1.getText();
                //printing in console
                System.out.println(getValue.toUpperCase());
                System.out.println(getValue1.toUpperCase());
            }
        });
    }

    public static void main(String[] arg){
    new e6();
    }
}