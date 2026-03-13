import java.awt.*;
class Problem07
{
    Problem07()
    {
        Frame f = new Frame();
        Button b1 = new Button("Click Here");
        Button b2 = new Button("Click Me");
        Checkbox c1 = new Checkbox("Male");
        Checkbox c2 = new Checkbox("Iron Male");
        Choice c = new Choice();
        c.add("tamil");
        c.add("english");
        c.add("telugu");
        f.add(b1);
        f.add(b2);
        f.add(c1);
        f.add(c2);
        f.add(c);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(100,100);
        f.setTitle("Deepak's GUI");
    }
    public static void main(String args[])
    {
        new Problem07();
    }
}
