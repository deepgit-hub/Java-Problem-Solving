import java.awt.*;
class Problem01 extends Frame
{
    Problem01()
    {
        Button b = new Button("Click Here");
        add(b);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(100,100);
    }
    public static void main(String args[])
    {
        new Problem01();
    }
}
