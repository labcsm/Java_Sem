import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class Calculator extends JFrame implements ActionListener
{
	String msg=" "; 
	int v1,v2,result; 
	JTextField t1;
	JButton b[]=new JButton[10];
	JButton add,sub,mul,div,clear,mod,EQ;
	char OP;
	Calculator()
	{
	//Color k=new Color(10,89,90); setBackground(k);
	t1=new JTextField(50);
	GridLayout gl=new GridLayout(8,4); 
	setLayout(gl);
	setSize(1000,1200);
    	setVisible(true);//making the frame visible
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
	for(int i=0;i<10;i++)
	{
		b[i]=new JButton(""+i);
	}
	add=new JButton("+"); 
	sub=new JButton("-"); 
	mul=new JButton("*"); 
	div=new JButton("/");
	mod=new JButton("%"); 
	clear=new JButton("Clear"); 
	EQ=new JButton("="); 
	t1.addActionListener(this); 
	add(t1);
	for(int i=0;i<10;i++)
	{
	add(b[i]);
	}
	add(add);
	add(sub);
	add(mul);
	add(div);
	add(mod); add(clear); add(EQ);
	for(int i=0;i<10;i++)
	{
	b[i].addActionListener(this);
	}
	add.addActionListener(this); sub.addActionListener(this); 
	mul.addActionListener(this); div.addActionListener(this);
 
	mod.addActionListener(this); clear.addActionListener(this); EQ.addActionListener(this);
    }
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
char ch=str.charAt(0);

if ( Character.isDigit(ch))
    t1.setText(t1.getText()+str);
else if(str.equals("+"))
	{
 
	v1=Integer.parseInt(t1.getText()); OP='+';t1.setText("");
	}
else if(str.equals("-"))
{
v1=Integer.parseInt(t1.getText()); OP='-'; t1.setText("");
}
else if(str.equals("*"))
{
v1=Integer.parseInt(t1.getText()); OP='*';t1.setText("");
}
else if(str.equals("/"))
{
v1=Integer.parseInt(t1.getText()); OP='/';t1.setText("");
}
else if(str.equals("%")){ v1=Integer.parseInt(t1.getText()); OP='%';
t1.setText("");
}

if(str.equals("="))
{
	v2=Integer.parseInt(t1.getText());
	if(OP=='+')
	result=v1+v2;
	else if(OP=='-')
	result=v1-v2;
	else if(OP=='*')
	result=v1*v2;
	else if(OP=='/')
	result=v1/v2;
	else if(OP=='%')
	result=v1%v2; t1.setText(""+result);
}
if(str.equals("Clear"))
{
t1.setText("");
}

}


public static void main(String args[])
{
  new Calculator();
}
}
