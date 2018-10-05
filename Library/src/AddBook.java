//package library;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

import javax.swing.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
public class AddBook {
	AddBook(){

	JFrame f1=new JFrame();
	
	JLabel l1=new JLabel("Add New Books");
	l1.setBounds(200, 20, 100, 30);
	f1.add(l1);
	
	JButton b0=new JButton("<-Back");
	b0.setBounds(60, 30, 120, 30);
	f1.add(b0);
	
	JLabel l2=new JLabel("Book Name");
	l2.setBounds(200, 60, 100, 30);
	f1.add(l2);
	
	JLabel l3=new JLabel("Author");
	l3.setBounds(200, 90, 100, 30);
	f1.add(l3);
	
	JLabel l4=new JLabel("Publications");
	l4.setBounds(200, 120, 100, 30);
	f1.add(l4);
	
	JLabel l6=new JLabel("Book ID");
	l6.setBounds(200, 150, 100, 30);
	f1.add(l6);
	
	JLabel l5=new JLabel("Books Count");
	l5.setBounds(200, 180, 100, 30);
	f1.add(l5);
	
	final JButton b1=new JButton("Submit");
	b1.setBounds(200, 220, 100, 30);
	f1.add(b1);
	
	JButton b2=new JButton("Cancel");
	b2.setBounds(300, 220, 100, 30);
	f1.add(b2);
	
	final JTextField tf1=new JTextField();
	tf1.setBounds(280, 60, 100, 30);
	f1.add(tf1);
	
	final JTextField tf2=new JTextField();
	tf2.setBounds(280, 90, 100, 30);
	f1.add(tf2);
	
	final JTextField tf3=new JTextField();
	tf3.setBounds(280, 120, 100, 30);
	f1.add(tf3);
	
	final JTextField tf4=new JTextField();
	tf4.setBounds(280, 150, 100, 30);
	f1.add(tf4);
	
	final JTextField tf5=new JTextField();
	tf5.setBounds(280, 180, 100, 30);
	f1.add(tf5);
	
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
		
	//});
	b2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
	});
	b1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mspire","root","root");
				String query="insert into addbooks2(BookName,Author,publications,BookID,BookCount)values(?,?,?,?,?)";
				PreparedStatement ps=(PreparedStatement) con.prepareStatement(query);
				ps.setString(1, tf1.getText());
				ps.setString(2, tf2.getText());
				ps.setString(3, tf3.getText());
				ps.setString(4, tf4.getText());
				ps.setString(5, tf5.getText());
				ps.execute();
				con.close();
				JOptionPane.showMessageDialog(b1,"Book Added");
				new Secondpage();
			}catch(Exception e){
				System.out.println(e);
			}
			}
	});
	}
	public static void main(String[] args) {
		new AddBook();
	}

}
