package kkkkk;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame{
	JButton b1,b2,b3;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	int i,k;
	String a,b;
	eHandler handler = new eHandler();
	
	public Reader(String s){
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("Очистить");
		b2 = new JButton("Прибавить");
		b3 = new JButton("Умножить");
		l1 = new JLabel("Введите первое число:");
		l2 = new JLabel("Введите второе число:");
		l3 = new JLabel("");
		l4 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		add(b1);
		add(b2);
		add(b3);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(l4);
		b2.addActionListener(handler);
		b1.addActionListener(handler);
		b3.addActionListener(handler);
		}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try{
			if(e.getSource()==b2){
				i = Integer.parseInt(t1.getText());
				k = Integer.parseInt(t2.getText());
				i = i+k;
				a = "Ваше число теперь равно " + i;
				l3.setText(a);
			}
			
			if(e.getSource()==b1){
				t1.setText(null);
				t2.setText(null);
				l3.setText("");
				}
			}catch (Exception ex){ JOptionPane.showMessageDialog(null, "Введите в поле число");}
	
			if(e.getSource()==b3){
				i = Integer.parseInt(t1.getText());
				k = Integer.parseInt(t2.getText());
				i = i*k;
				a = "Ваше число теперь равно " + i;
				l3.setText(a);
			}
		}
	}
}

