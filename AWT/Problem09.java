import java.awt.*;
import java.awt.event.*;
class P
{
    P()
    {
        JFrame f = new Frame("Registration Form");
        f.setLayout(null);

        JLabel name = new JLabel("Name : ");
        name.setBounds(50,30,100,30);
        JTextField nameinput = new JTextField("Enter your Name");
        nameinput.setBounds(180,30,270,30);

        JLabel registration_number = new JLabel("Register Number : ");
        registration_number.setBounds(50,60,110,30);
        JTextField registration_numberinput = new JTextField("Enter your Registration Number");
        registration_numberinput.setBounds(180,60,270,30);

        JLabel gender = new Label("Gender : ");
        gender.setBounds(50,90,100,30);
        JChoice choosegender = new Choice();
        choosegender.add("Male");
        choosegender.add("Female");
        choosegender.setBounds(180,90,270,30);

        JLabel department = new Label("Department : ");
        department.setBounds(50,120,100,30);
        JChoice choosedepartment = new Choice();
        choosedepartment.add("CS");
        choosedepartment.add("BCA");
        choosedepartment.add("MCA");
        choosedepartment.setBounds(180,120,270,30);

        JLabel course = new Label("Course : ");
        course.setBounds(50,150,100,30);
        JChoice choosecourse = new Choice();
        choosecourse.add("UG");
        choosecourse.add("PG");
        choosecourse.setBounds(180,150,270,30);

        Label dob= new Label("Date of Birth : ");
        dob.setBounds(50,180,100,30);
        TextField dateofbirth = new TextField("Enter Your Date of Birth");
        dateofbirth.setBounds(180,180,270,30);

        Label age = new Label("Age : ");
        age.setBounds(50,210,100,30);
        TextField enterage = new TextField("Enter Your Age");
        enterage.setBounds(180,210,270,30);
        
        Label language = new Label("Languages Known : ");
        language.setBounds(50,240,100,30);
        Checkbox language1 = new Checkbox("C");
        Checkbox language2 = new Checkbox("C++");
        Checkbox language3 = new Checkbox("JAVA");
        Checkbox language4 = new Checkbox("Python");
        language1.setBounds(180,240,50,30);
        language2.setBounds(240,240,50,30);
        language3.setBounds(300,240,50,30);
        language4.setBounds(360,240,70,30);
        
        Button summit = new Button("Summit");
        summit.setBounds(200,300,70,30);
        ActionListener summitlistener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println(nameinput.getText());
                System.out.println(registration_numberinput.getText());
                System.out.println(dateofbirth.getText());
                System.out.println(enterage.getText());
            }
        };
        summit.addActionListener(summitlistener);
        f.add(name);
        f.add(registration_number);
        f.add(gender);
        f.add(department);
        f.add(course);
        f.add(dob);
        f.add(age);
        f.add(language);
        f.add(nameinput);
        f.add(registration_numberinput);
        f.add(choosegender);
        f.add(choosedepartment);
        f.add(choosecourse);
        f.add(dateofbirth);
        f.add(enterage);
        f.add(language1);
        f.add(language2);
        f.add(language3);
        f.add(language4);
        f.add(summit);
        f.setVisible(true);
        f.setSize(500,500);


    }
    public static void main(String args[])
    {
        new P();
    }
}
