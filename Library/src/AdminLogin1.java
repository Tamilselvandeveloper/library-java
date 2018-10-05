//package library;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
public class AdminLogin1 {
	AdminLogin1() throws SQLException{
	
	JFrame f1=new JFrame();

	
	JLabel l1=new JLabel("Admin's Login");
	l1.setBounds(230,30,100,30);
	f1.add(l1);
	
	JLabel l2=new JLabel("UserName :");
	l2.setBounds(200,70,100,30);
	f1.add(l2);
	
	JLabel l3=new JLabel("Password :");
	l3.setBounds(200,100,100,30);
	f1.add(l3);
	
	final JTextField tf=new JTextField();
	tf.setBounds(280, 70, 100, 30);
	f1.add(tf);
	
	 final JPasswordField tf1=new JPasswordField();
	tf1.setBounds(280, 100, 100, 30);
	f1.add(tf1);
	
	final JButton b1=new JButton("Submit");
	b1.setBounds(240, 160, 80, 30);
	f1.add(b1);
	
	JButton b2=new JButton("Cancel");
	b2.setBounds(320, 160, 100, 30);
	f1.add(b2);
	
	
	f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	f1.getContentPane().add(b2);
	
	f1.setLayout(null);
	f1.setVisible(true);
	f1.setSize(800, 600);
	
	b2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
	});
	
	
	b1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg1){
		if(arg1.getSource()==b1){
			String name=tf.getText();
			String password=tf1.getText();
			if(name.equals("tamil")&&password.equals("123"))
			{
				// ssJOptionPane.showMessageDialog(b1,"Successfully loged In");
				dispose();
				new Secondpage();
			}else{
				JOptionPane.showMessageDialog(b1, "invalid");
			}
		}}
	
	});
	}
	protected void close() {
		// TODO Auto-generated method stub
		
	}
	protected void dispose() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) throws SQLException {
		new AdminLogin1();
}
	
}
