import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class P
{
    P()
    {
        JFrame f = new JFrame("Registration Form");
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel name = new JLabel("Name : ");
        name.setBounds(50,30,100,30);
        JTextField nameinput = new JTextField("Enter Your Name");
        nameinput.setBounds(180,30,270,30);

        JLabel registration_number = new JLabel("Register Number : ");
        registration_number.setBounds(50,60,110,30);
        JTextField registration_numberinput = new JTextField("Enter your Registration Number");
        registration_numberinput.setBounds(180,60,270,30);

        JLabel gender = new JLabel("Gender : ");
        gender.setBounds(50,90,100,30);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("FeMale");
        male.setBounds(180,90,100,30);
        female.setBounds(290,90,100,30);

        ButtonGroup g = new ButtonGroup();
        g.add(male);
        g.add(female);

        JLabel department = new JLabel("Department : ");
        department.setBounds(50,120,100,30);
        
        String d[] ={"CS","BCA","MCA"};
        JComboBox choosedepartment = new JComboBox(d);
        choosedepartment.setBounds(180,120,270,30);

        JLabel course = new JLabel("Course : ");
        course.setBounds(50,150,100,30);
        
        String c[]={"UG","PG"};
        JComboBox choosecourse = new JComboBox(c);
        choosecourse.setBounds(180,150,270,30);

        JLabel dob= new JLabel("Date of Birth : ");
        dob.setBounds(50,180,100,30);
        JTextField dateofbirth = new JTextField("Enter Your Date of Birth");
        dateofbirth.setBounds(180,180,270,30);

        JLabel age = new JLabel("Age : ");
        age.setBounds(50,210,100,30);
        JTextField enterage = new JTextField("Enter Your Age");
        enterage.setBounds(180,210,270,30);
        
        JLabel language = new JLabel("Languages Known : ");
        language.setBounds(50,240,100,30);
        JCheckBox language1 = new JCheckBox("C");
        JCheckBox language2 = new JCheckBox("C++");
        JCheckBox language3 = new JCheckBox("JAVA");
        JCheckBox language4 = new JCheckBox("Python");
        language1.setBounds(180,240,50,30);
        language2.setBounds(240,240,50,30);
        language3.setBounds(300,240,70,30);
        language4.setBounds(380,240,70,30);

        JButton exit = new JButton("Exit");
        exit.setBounds(100,280,70,30);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(180,280,70,30);

        JButton ok = new JButton("OK");
        ok.setBounds(260,280,70,30);

        JButton reset = new JButton("Reset");
        reset.setBounds(360,280,70,30);

        
        f.add(name);
        f.add(registration_number);
        f.add(gender);
        f.add(male);
        f.add(female);
        f.add(department);
        f.add(course);
        f.add(dob);
        f.add(age);
        f.add(language);
        f.add(nameinput);
        f.add(registration_numberinput);
        f.add(choosedepartment);
        f.add(choosecourse);
        f.add(dateofbirth);
        f.add(enterage);
        f.add(language1);
        f.add(language2);
        f.add(language3);
        f.add(language4);
        f.add(ok);
        f.add(reset);
        f.add(cancel);
        f.add(exit);
        f.setVisible(true);
        f.setSize(500,500);
    }
    public static void main(String args[])
    {
        new P();
    }
}
