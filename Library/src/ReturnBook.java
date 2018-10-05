//package library;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ReturnBook {
ReturnBook(){
	JFrame f1=new JFrame();
	
	JButton b0=new JButton("Back");
	b0.setBounds(60, 30, 100, 30);
	f1.add(b0);
	
	JLabel l1=new JLabel("Return Books");
	l1.setBounds(230, 20, 100, 30);
	f1.add(l1);
	
	JLabel l2=new JLabel("Book ID");
	l2.setBounds(200, 60, 100, 30);
	f1.add(l2);
	
	JTextField tf1=new JTextField();
	tf1.setBounds(280, 60, 100, 30);
	f1.add(tf1);
	
	final JButton b1=new JButton("Submit");
	b1.setBounds(220, 100, 90, 30);
	f1.add(b1);
	
	JButton b2=new JButton("Cancel");
	b2.setBounds(320, 100, 90, 30);
	f1.add(b2);
	
	f1.setLayout(null);
	f1.setVisible(true);
	f1.setSize(800, 600);
	
	b0.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new Librarian1();
		}
		
	});
	b1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(b1, "Book Returned");
			new Librarian1();
		}
		
	});
	b2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
	});
}
	public static void main(String[] args) {
		new ReturnBook();
}
}
