//Button When clicked print Hello Java
//2014 Spring 5a
package event;
import java.awt.*;
import java.awt.event.*;
class e2 extends Frame implements
        ActionListener {
    TextField textField;

    e2() {
        textField = new TextField();
        textField.setBounds(60, 50, 170, 20);
        Button button = new Button("Show");
        button.setBounds(90, 140, 75, 40);
        button.addActionListener(this);
        add(button);
        add(textField);
        setSize(250, 250);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        textField.setText("Hello Java");
    }

    public static void main(String[] args) {
        new e2();
    }
}
