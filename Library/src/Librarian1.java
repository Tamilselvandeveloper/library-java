//package library;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

import javax.swing.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
public class Librarian1 {
	Librarian1(){
	
		JFrame f1=new JFrame();
		
		
		JLabel l1=new JLabel("Librarian's Access");
		l1.setBounds(230,20,130,30);
		f1.add(l1);
		
		JButton b0=new JButton("<-Back");
		b0.setBounds(60, 30, 120, 30);
		f1.add(b0);
		
		JButton b1=new JButton("Add Books");
		b1.setBounds(200, 60, 120, 30);
		f1.add(b1);
		
		JButton b2=new JButton("View Books");
		b2.setBounds(200, 100, 120, 30);
		f1.add(b2);
		
		JButton b3=new JButton("Issued Books");
		b3.setBounds(200, 140, 120, 30);
		f1.add(b3);
		
		JButton b4=new JButton("Return Books");
		b4.setBounds(200, 180, 120, 30);
		f1.add(b4);
		
		JButton b5=new JButton("Logout");
		b5.setBounds(200, 220, 120, 30);
		f1.add(b5);
		
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setSize(800, 600);
		
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new AddBook();
			}
			
		});
		b4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new ReturnBook();
			}
			
		});
		b0.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new LibrarianLogin1();
			}
			
		});
		b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mspire","root","root");
					String query="select BookName from addbooks2 ";
					PreparedStatement ps=(PreparedStatement) con.prepareStatement(query);
					ps.execute();
					con.close();
					//JOptionPane.showMessageDialog(b1,"Book Added");
					//new Secondpage();
				}catch(Exception e){
					System.out.println(e);
				}
			}
			
		});
		b5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
	}
	protected void dispose() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
new Librarian1();
	}
}