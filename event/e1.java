import java.awt.*;
public class e1 extends Frame {
    e1() {
        Label l =new Label("Emp Id");
        Button b = new Button("Click Me");
        TextField t = new TextField();
        l.setBounds(30, 100, 80, 30);
        t.setBounds(30, 200, 80, 30);
        b.setBounds(30, 300, 80, 30);
        add(l);
        add(t);
        add(b);
        setSize(300, 300);
        setTitle("1st example");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        e1 e = new e1();
    }
}