import java.awt.*;
class Poblem05
{
    Problem05()
    {
        Frame f = new Frame();
        Button b1 = new Button("Click Here");
        Button b2 = new Button("Click Me");
        Label l = new Label("This is Label");
        TextField t = new TextField("Enter Your Name");
        f.add(b1);
        f.add(b2);
        f.add(l);
        f.add(t);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(100,100);
        f.setTitle("Deepak's GUI");
    }
    public static void main(String args[])
    {
        new Problem05();
    }
}
