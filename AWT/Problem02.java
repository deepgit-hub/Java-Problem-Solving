import java.awt.*;
class Problem02 extends Frame
{
    Problem02()
    {
        Button b1 = new Button("Click Here");
        Button b2 = new Button("Click Me");
        add(b1);
        add(b2);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(100,100);
    }
    public static void main(String args[])
    {
        new Problem02();
    }
}
