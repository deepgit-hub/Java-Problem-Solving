import java.awt.*;
import java.awt.event.*;
class P implements ItemListener
{
    Frame f;
    Label msg;
    CheckboxGroup group;
    Checkbox red,green,yellow;
    P()
    {
        f = new Frame();
        f.setLayout(null);
        msg = new Label("");
        msg.setBounds(100,100,70,30);
        group = new CheckboxGroup();
        green = new Checkbox("Green",group,false);
        green.setBounds(30,200,70,30);
        yellow = new Checkbox("Yellow",group,false);
        yellow.setBounds(110,200,70,30);
        red = new Checkbox("Red",group,false);
        red.setBounds(190,200,70,30);

        green.addItemListener(this);
        red.addItemListener(this);
        yellow.addItemListener(this);
        f.add(msg);
        f.add(red);
        f.add(yellow);
        f.add(green);
        f.setSize(400,400);
        f.setVisible(true);
    }
        public void itemStateChanged(ItemEvent e)
        {
            if(red.getState())
            {
                msg.setText("STOP!!!");
                msg.setForeground(Color.red);
            }
            if(yellow.getState())
            {
                msg.setText("READY!!!");
                msg.setForeground(Color.yellow);
            }
            if(green.getState())
            {
                msg.setText("GOO!!!");
                msg.setForeground(Color.green);
            }
        }
       
    
    public static void main(String args[])
        {
            new P();
        }
}
