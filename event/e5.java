//wap for mouse event delegation model with your own example
// euta matra function lekhey hunxa
// Santosh sir ko qn ho yo pdf mai xa
// 2015 spring 5b
package event;
import java.awt.*;
import java.awt.event.*;
class e5 extends Frame implements MouseListener
{
    String msg="";
    e5()
{
    addMouseListener(this);
}
    public void mouseClicked(MouseEvent me)
    {
        msg="mouse clicked";
        repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
        msg="mouse entered";
        repaint();
    }
    public void mouseExited(MouseEvent me)
    {
        msg="mouse exited";
        repaint();
    }
    public void mousePressed(MouseEvent me)
    { msg="mouse pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
        msg="mouse released";
        repaint();
    }
    public void paint(Graphics g)
    {

        g.drawString(msg,200,200);
    }
}
class MouseEventsExample
{
    public static void main(String[] arg)
    {
        e5 d=new e5();
        d.setSize(400,400);
        d.setVisible(true);
        d.setTitle("Mouse Events Demo Program");
//        d.addWindowListener(new WindowAdapter())
//        {
//            public void windowClosing(WindowEvent we)
//            {
//                System.exit(0);
//            }
//        }
    }
}