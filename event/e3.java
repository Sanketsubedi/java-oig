//To make a button and when clicked application is closed
//2014 fall 4b
package event;
import javax.swing.*;
import java.awt.event.*;
public class e3 extends JFrame /*implements ActionListener*/ {
    e3(){
        JButton b = new JButton("Close");
//        b.addActionListener(this);
        b.setBounds(100,100,80,40);
        add(b);
// inner method. if you comment out it and remove comment tags in others the outer method can be used
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
        setSize(250, 250);
        setLayout(null);
        setVisible(true);
    }
//    public void actionPerformed(ActionEvent e){
//        System.exit(0);
//    }
    public static void main(String[] arg){

        new e3();
    }
}