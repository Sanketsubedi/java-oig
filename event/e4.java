//to change background color when a button is clicked. getContentPane() is being used.
//2015 fall 5a
package event;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class e4 extends JFrame /*implements ActionListener*/ {
// it is declared outside the constructor to access it in the event function.
    JFrame frame;
    JButton orange;
    e4() {
        frame = new JFrame();
        Color c = new Color(255, 255, 255);
        orange = new JButton("ORANGE");
        orange.setBounds(20, 20, 100, 40);
        orange.setBackground(c);
        // adding to frame
        frame.add(orange);
        //setting a action Listener
//        orange.addActionListener(this);
        orange.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                frame.getContentPane().setBackground(Color.ORANGE);
            }
        });
        // frame shit everyone knows..
        frame.setLayout(null);
        frame.setSize(650, 600);
        frame.setVisible(true);
        // tyo cross garda banda hune yesle garda ho must write
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
        frame.getContentPane().setBackground(Color.ORANGE);
    }

    public static void main(String[] args) {
        new e4();

    }

}
//orange.addActionListener(new ActionListener(){
//    public void actionPerformed(ActionEvent ae){
//        getContentPane().setBackground(Color.ORANGE);
//        }
//        });