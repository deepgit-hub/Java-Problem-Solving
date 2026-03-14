import java.awt.*;
class Problem08
{
    P()
    {
        Frame f = new Frame();
        f.setLayout(null);
        Label l = new Label("These are two buttons");
        l.setBounds(100,100,200,100);
        Button b1 = new Button("Click me");
        Button b2 = new Button("Click here");
        b1.setBounds(100,55,100,40);
        b2.setBounds(100,100,100,40);
        f.add(b1);
        f.add(b2);
        f.add(l);
        f.setVisible(true);
        f.setSize(400,500);
        
    
    }
    public static void main(String args[])
    {
        new Problem08();
    }
}
