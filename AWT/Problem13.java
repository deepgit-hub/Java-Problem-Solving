import java.awt.*;
import java.awt.event.*;
class P
{
    P()
    {
        Frame f = new Frame("Mouse Event Analyzer");
        f.setLayout(null);
        Label msg = new Label("Mouse not Entered");
        msg.setBounds(100,400,200,30);
        f.addMouseListener(new MouseAdapter()
        {
            public void mouseEntered(MouseEvent e)
            {
                msg.setText("Mouse Entered");
            }
            public void mouseClicked(MouseEvent e)
            {
                msg.setText("Mouse Clicked");
            }
            public void mousePressed(MouseEvent e)
            {
                msg.setText("Mouse Pressed");
            }
            public void mouseReleased(MouseEvent e)
            {
                msg.setText("Mouse Released");
            }
            public void mouseExited(MouseEvent e)
            {
                msg.setText("Mouse Exited");
            }
        });
        f.setVisible(true);
        f.setSize(500,500);
        f.add(msg);
        }
        public static void main(String args[])
        {
            new P();
        }
        
    
}
