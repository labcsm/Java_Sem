//Java KeyListener Example
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
class KeyListenerDemo extends JFrame implements KeyListener
{  
	JLabel l;  
	JTextArea area;  
      KeyListenerDemo()
      {  

	l=new JLabel();  
	l.setBounds(240,100,120,40);  
	area = new JTextArea();  
	area.setBounds(20,80,200, 200);  
	area.addKeyListener(this);  

	add(l);add(area);  
	setSize(600,600);  
	setLayout(null);  
	setVisible(true);  
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }  
	public void keyPressed(KeyEvent e)
	{  
	l.setText("Key Pressed");  
	}  
	public void keyReleased(KeyEvent e)
	{  
	l.setText("Key Released");  
	}  
	public void keyTyped(KeyEvent e) 
	{  
	l.setText("Key Typed");  
	}  

	public static void main(String[] args) 
	{  
	new KeyListenerDemo();  
	}  
 }  
