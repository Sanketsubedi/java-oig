// Create a GUI using swing which content two labels,two text fields and a button
// Label should display the text Username and Password resp.
// Set action command of the button to Verify User.
// Write a java program to verify the user if username = "Admin" and password = "PTF@112022"
// if username and password are correct display a message box "Logged in"
// else redirect to the same form
//2022 Fall 5a
package event;//package not to be written
import javax.swing.*;
import java.awt.event.*;

public class e7 extends JFrame {
    e7(){
        JLabel j1 ,j2;
        JTextField t1 ,t2;
        JButton b = new JButton("Click");
        j1 = new JLabel("Username");
        j2 = new JLabel("Password");
        t1 = new JTextField();
        t2 = new JTextField();
        j1.setBounds(40,40,60,40);
        j2.setBounds(40,100,60,40);
        t1.setBounds(100,40,300,40);
        t2.setBounds(100,100,300,40);
        b.setBounds(50,150,100,40);
        add(j1);
        add(j2);
        add(t1);
        add(t2);
        add(b);
        b.addActionListener(new ActionListener() {
            @Override//not compulsary to write
            public void actionPerformed(ActionEvent e) {
                //taking text from inputs
                String username = t1.getText();
                String password = t2.getText();
                //checking for validation
                if(username.equals("Admin") && password.equals("PTF@112022") ){
//                    System.out.print("Logged in");
                    JOptionPane.showMessageDialog(null , "Logged in");
                }
                else {
                    System.out.print("Failed to Login");
                }
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] arg){
        new e7();
    }

}

