import java.awt.*;
import java.awt.event.*;
class P
{
    
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,plus,minus,divide,mul,equal;
    TextField display;
    String num1="", op="";
  
    P()
    {
        Frame f = new Frame();
        f.setLayout(null);
        display = new TextField("0");
        display.setBounds(200,170,100,30);
        
        b0 = new Button("0");
        b0.setBounds(50,50,30,30);

        b1 = new Button("1");
        b1.setBounds(80,50,30,30);

        b2 = new Button("2");
        b2.setBounds(110,50,30,30);

        b3 = new Button("3");
        b3.setBounds(50,80,30,30);

        b4 = new Button("4");
        b4.setBounds(80,80,30,30);

        b5 = new Button("5");
        b5.setBounds(110,80,30,30);

        b6 = new Button("6");
        b6.setBounds(50,110,30,30);

        b7 = new Button("7");
        b7.setBounds(80,110,30,30);

        b8 = new Button("8");
        b8.setBounds(110,110,30,30);


        b9 = new Button("9");
        b9.setBounds(50,140,30,30);
        
        plus = new Button("+");
        plus.setBounds(80,140,30,30);

        minus = new Button("-");
        minus.setBounds(110,140,30,30);

        mul = new Button("*");
        mul.setBounds(50,170,30,30);

        divide = new Button("/");
        divide.setBounds(80,170,30,30);

        equal = new Button("=");
        equal.setBounds(100,200,30,30);

        b0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                display.setText(display.getText()+"0");
            }
        });

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                display.setText(display.getText()+"1");
            }
        });

        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                display.setText(display.getText()+"2");
            }
        });

        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                display.setText(display.getText()+"3");
            }
        });

        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                display.setText(display.getText()+"4");
            }
        });

        b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                display.setText(display.getText()+"5");
            }
        });


        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                display.setText(display.getText()+"6");
            }
        });


        b7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                display.setText(display.getText()+"7");
            }
        });

        b8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                display.setText(display.getText()+"8");
            }
        });

        b9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                display.setText(display.getText()+"9");
            }
        });

        plus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                num1=display.getText();
                op="+";
                display.setText("");
            }
        });

        minus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                num1=display.getText();
                op="-";
                display.setText("");
            }
        });

        mul.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                num1=display.getText();
                op="*";
                display.setText("");
            }
        });

        divide.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                num1=display.getText();
                op="/";
                display.setText("");
            }
        });

        equal.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            String num2 = display.getText();
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            int result =0;
            if(op.equals("+"))
            {
                result= a+b;
            }
            if(op.equals("-"))
            {
                result = a-b;
            }
            if(op.equals("*"))
            {
                result = a*b;
            }
            if(op.equals("/"))
            {
                result = a/b;
            }
            display.setText(""+result);
            }
        });

        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(plus);
        f.add(minus);
        f.add(mul);
        f.add(divide);
        f.add(display);
        f.add(equal);
        f.setSize(700,700);
        f.setVisible(true);
        f.setTitle("Calculator");
    }
    public static void main(String args[])
    {
        new P();
    }
}
