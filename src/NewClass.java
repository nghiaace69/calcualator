import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class gui1{
    static double a=0;
    static int op=0;
    public static void main(String ar[]){
        
        JFrame f1=new JFrame("Calculator");
        f1.setLayout(null);
        final JTextField t1=new JTextField(100);
        t1.setBounds(10,10,200,30);
        JButton b0=new JButton("0");
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton b7=new JButton("7");
        JButton b8=new JButton("8");
        JButton b9=new JButton("9");
        JButton dot=new JButton(".");
        JButton add=new JButton("+");
        JButton sub=new JButton("-");
        JButton equal=new JButton("=");
        JButton div=new JButton("%");
        JButton mul=new JButton("x");
    
        JPanel buttonPanel=new JPanel();
        buttonPanel.setBounds(10,60,200,150);
        buttonPanel.setBackground(Color.gray);
        //buttonPanel.pack();
        buttonPanel.setLayout(new GridLayout(4,4,5,5));
        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(div);
        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(mul);
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(sub);
        buttonPanel.add(b0);
        buttonPanel.add(dot);
        buttonPanel.add(equal);
        buttonPanel.add(add);
        
        class MyListener1 implements ActionListener{
            public void actionPerformed(ActionEvent e){
                String cmd=e.getActionCommand();
                if(cmd.equals("+")){
                    a=Double.parseDouble(t1.getText());
                    op=1;
                    t1.setText("");
                }else if(cmd.equals("-")){
                    a=Double.parseDouble(t1.getText());
                    op=2;
                    t1.setText("");
                }else if(cmd.equals("x")){
                    a=Double.parseDouble(t1.getText());
                    op=3;
                    t1.setText("");
                }
                else if(cmd.equals("%")){
                    a=Double.parseDouble(t1.getText());
                    op=4;
                    t1.setText("");
                    
                }else if(cmd.equals("=")){
                    double b=Double.parseDouble(t1.getText());
                    double c=0; 
                    switch(op){
                        case 1:c=a+b;break;
                        case 2:c=a-b;break;
                        case 3:c=a*b;break;
                        case 4:c=a/b;break;
                        default :c=0;
                    }
                    t1.setText(""+c);
                }
                else if(cmd.equals("0")){
                    t1.setText(t1.getText().concat("0"));
                }else if(cmd.equals("1")){
                    t1.setText(t1.getText().concat("1"));
                }else if(cmd.equals("2")){
                    t1.setText(t1.getText().concat("2"));
                }else if(cmd.equals("3")){
                    t1.setText(t1.getText().concat("3"));
                }else if(cmd.equals("4")){
                    t1.setText(t1.getText().concat("4"));
                }else if(cmd.equals("5")){
                    t1.setText(t1.getText().concat("5"));
                }else if(cmd.equals("6")){
                    t1.setText(t1.getText().concat("6"));
                }else if(cmd.equals("7")){
                    t1.setText(t1.getText().concat("7"));
                }else if(cmd.equals("8")){
                    t1.setText(t1.getText().concat("8"));
                }else if(cmd.equals("9")){
                    t1.setText(t1.getText().concat("9"));
                }else if(cmd.equals(".")){
                    t1.setText(t1.getText().concat("."));
                }
                
            }
        }
        
        
        MyListener1 ml=new MyListener1();
        add.addActionListener(ml);
        sub.addActionListener(ml);
        mul.addActionListener(ml);
        div.addActionListener(ml);
        equal.addActionListener(ml);
        b0.addActionListener(ml);
        b1.addActionListener(ml);
        b2.addActionListener(ml);
        b3.addActionListener(ml);
        b4.addActionListener(ml);
        b5.addActionListener(ml);
        b6.addActionListener(ml);
        b7.addActionListener(ml);
        b8.addActionListener(ml);
        b9.addActionListener(ml);
        dot.addActionListener(ml);
        
        f1.add(t1);
        f1.add(buttonPanel);
        f1.setBounds(300,200,230,250);
        f1.setVisible(true);
    }
}
