//package library;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

import javax.swing.*;  

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;



public class AddLibrarian1 implements ActionListener {
	AddLibrarian1(){
//String valuee3;
JFrame f=new JFrame(); 

 

//JBackground bd=new JBackground();
JLabel l=new JLabel("Librarian's Register Form");
l.setBounds(120, 20, 200, 30);
l.setForeground(Color.MAGENTA);
f.add(l);

JLabel l1=new JLabel("Name :");
l1.setBounds(100, 60, 90, 30);
l1.setForeground(Color.GRAY);
f.add(l1);

JLabel l2=new JLabel("UserName :");
l2.setBounds(100, 100, 90, 30);
l2.setForeground(Color.BLUE);
f.add(l2);

JLabel l3=new JLabel("Password :");
l3.setBounds(100, 140, 90,30);
l3.setForeground(Color.RED);
f.add(l3);

JLabel l4=new JLabel("Retype Password :");
l4.setBounds(100, 180, 100,30);
l4.setForeground(Color.RED);
f.add(l4);

JLabel l5=new JLabel("Email :");
l5.setBounds(100, 220, 90,30);
l5.setForeground(Color.GREEN);
f.add(l5);

//JLabel l6=new JLabel("Gender");
//l6.setBounds(100, 260, 90,30);
//l6.setForeground(Color.MAGENTA);
//f.add(l6);
//
//JRadioButton r=new JRadioButton("Male");
//JRadioButton r1=new JRadioButton("Female");
//r.setBounds(160, 260,70,30);
//r1.setBounds(250, 260, 80, 30);
//ButtonGroup bg=new ButtonGroup();
//bg.add(r);
//bg.add(r1);
//f.add(r);
//f.add(r1);

final JTextField t=new JTextField();
t.setBounds(200, 60, 90, 30);
t.setBackground(Color.GREEN);
f.add(t);

final JTextField t1=new JTextField();
t1.setBounds(200,100,90,30);
t1.setBackground(Color.YELLOW);
f.add(t1);

final JTextField t2=new JTextField();
t2.setBounds(200, 140, 90, 30);
t2.setBackground(Color.CYAN);
f.add(t2);

final JTextField t3=new JTextField();
t3.setBounds(200, 180, 90, 30);
t3.setBackground(Color.CYAN);
f.add(t3);

final JTextField t4=new JTextField();
t4.setBounds(200, 220, 90, 30);
t4.setBackground(Color.RED);
f.add(t4);

final JButton b=new JButton("Submit");
b.setBounds(100,320,100, 40);     
b.setBackground(Color.white);
f.add(b); 

JButton b1=new JButton("Cancel");
b1.setBounds(200,320,100, 40);       
b1.setBackground(Color.white);
f.add(b1); 

f.setLayout(null);
f.setVisible(true);
f.setSize(800,600);

//			String value3 = null;
//			if (r.isSelected()) {
//				String rad1 = String.valueOf(r.getText());
//				value3 = rad1;
//			}
//			if (r1.isSelected()) {
//				String rad2 = String.valueOf(r1.getText());
//				value3 = rad2;
//			}
//			System.out.println(value3);

b.addActionListener(new ActionListener(){

@SuppressWarnings("unused")
public void actionPerformed1(ActionEvent arg0) {
	// TODO Auto-generated method stub
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mspire","root","root");
		String query="insert into library (Name,UserName,Password,RetypePassword,Email) values(?,?,?,?,?)";
		PreparedStatement ps=(PreparedStatement) con.prepareStatement(query);
		ps.setString(1, t.getText());
		ps.setString(2, t1.getText());
		ps.setString(3, t2.getText());
		ps.setString(4, t3.getText());
		ps.setString(5, t4.getText());
	//	ps.setString(6, value3());
		ps.execute();
		con.close();
		JOptionPane.showMessageDialog(b, "Data added Successfully");
		new Secondpage();
	}catch(Exception e){
		System.out.println(e);
	}
	
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}


});


b1.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	
});
	
	}
	protected String value3() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {  
		new AddLibrarian1();
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}