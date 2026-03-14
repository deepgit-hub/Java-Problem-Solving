import java.awt.*;
class P
{
    P()
    {
        Frame f = new Frame("Registration Form");
        f.setLayout(null);
        Label name = new Label("Name : ");
        name.setBounds(50,30,100,30);
        TextField nameinput = new TextField("Enter your Name");
        nameinput.setBounds(180,30,270,30);
        Label registration_number = new Label("Register Number : ");
        registration_number.setBounds(50,60,110,30);
        TextField registration_numberinput = new TextField("Enter your Registration Number");
        registration_numberinput.setBounds(180,60,270,30);
        Label gender = new Label("Gender : ");
        gender.setBounds(50,90,100,30);
        Choice choosegender = new Choice();
        choosegender.add("Male");
        choosegender.add("Female");
        choosegender.setBounds(180,90,150,30);
        Label department = new Label("Department : ");
        department.setBounds(50,120,100,30);
        Label course = new Label("Course : ");
        course.setBounds(50,150,100,30);
        Label dob= new Label("Date of Birth : ");
        dob.setBounds(50,180,100,30);
        Label age = new Label("Age : ");
        age.setBounds(50,210,100,30);
        Label language = new Label("Languages Known : ");
        language.setBounds(50,240,100,30);
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
        f.setVisible(true);
        f.setSize(200,200);


    }
    public static void main(String args[])
    {
        new P();
    }
}
