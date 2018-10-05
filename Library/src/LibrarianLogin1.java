//package library;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class LibrarianLogin1 {
	LibrarianLogin1(){

	JFrame f1=new JFrame();

	JLabel l1=new JLabel("Librarian's Login");
	l1.setBounds(230,30,130,30);
	f1.add(l1);
	
	JLabel l2=new JLabel("UserName :");
	l2.setBounds(200,70,100,30);
	f1.add(l2);
	
	JLabel l3=new JLabel("Password :");
	l3.setBounds(200,100,100,30);
	f1.add(l3);
	
	final JTextField tf=new JTextField("");
	tf.setBounds(280, 70, 100, 30);
	f1.add(tf);
	
	final JPasswordField tf1=new JPasswordField("");
	tf1.setBounds(280, 100, 100, 30);
	f1.add(tf1);
	
	final JButton b1=new JButton("Submit");
	b1.setBounds(240, 160, 100, 30);
	f1.add(b1);
	
	JButton b2=new JButton("Cancel");
	b2.setBounds(340, 160, 100, 30);
	f1.add(b2);
	
	JButton b3=new JButton("Back");
	b3.setBounds(160, 160, 80, 30);
	f1.add(b3);
	
	f1.setLayout(null);
	f1.setVisible(true);
	f1.setSize(800, 600);
	
	b1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(arg0.getSource()==b1){
				String name=tf.getText();
				String password=tf1.getText();
				if(name.equals("user")&&password.equals("user")){
					//JOptionPane.showMessageDialog(b1,"Login Success");
					new Librarian1();
				}
				else{
					JOptionPane.showMessageDialog(b1, "Invalid");
				}
			}
		}
		
	});
	b2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(0);		}
		
	});
	b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			new Frontpage();
		}
	});
}
	public static void main(String[] args) {
	new LibrarianLogin1();
	}
	}
