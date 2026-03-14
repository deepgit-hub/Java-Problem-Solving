import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Problem10
{
    Problem10()
    {
        JFrame f = new JFrame("Font Change");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(null);
        JLabel text = new JLabel("Enter Your Text : ");
        text.setBounds(100,50,300,30);

        JTextField entertext = new JTextField();
        entertext.setBounds(250,50,300,30);
       
        JLabel font = new JLabel("Font : ");
        font.setBounds(100,80,300,30);
       
        String fonts[] = {"Serif","Sansserif","monospaced"};
        JComboBox fontbox = new JComboBox(fonts);
        fontbox.setBounds(250,80,300,30);
       
        JLabel size = new JLabel("Size : ");
        size.setBounds(100,110,300,30);

        String sizes[] = {"12","24","36","48"};
        JComboBox sizebox = new JComboBox(sizes);
        sizebox.setBounds(250,110,300,30);

        JCheckBox italic = new JCheckBox("Italic");
        italic.setBounds(100,140,70,30);
        
        JCheckBox bold = new JCheckBox("Bold");
        bold.setBounds(180,140,70,30);

        JButton apply = new JButton("Apply");
        apply.setBounds(250,190,70,50);

        apply.addActionListener(new ActionListener()
        {
            String text = textinput.getText();
            String fontname = (String)fontbox.getSelectedItem();
            int size = Integer.parseInt((String)sizebox.getSelectedItem());
        });

        f.add(text);
        f.add(entertext);
        f.add(font);
        f.add(fontbox);
        f.add(size);
        f.add(sizebox);
        f.add(italic);
        f.add(bold);
        f.add(apply);


    }
    public static void main(String args[])
    {
        new Problem10();
    }
}
