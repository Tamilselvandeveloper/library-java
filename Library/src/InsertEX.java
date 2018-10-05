 

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.ItemSelectable;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class InsertEX extends JFrame implements ActionListener, ItemListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int Image = 0;
	String integer = null;
	String rad1;
	String rad2;
	String str;
	String value1, value2;
	String value3, value_des, value_date, value_month, value_year, value_total;
	JButton b2;
	JTextField f0,f1;
	JTextField f2;
	JTextField f3;
	JTextField f4, f5, f6;
	JButton b1;
	JButton b3;
	JComboBox cb, c4, c5, c6, c7;
	JRadioButton r1, r2;
	ButtonGroup bg;
	JLabel p1;
	JTextArea a1;
	int s1, s2;
	JCheckBox c1, c2, c3;
	String place;
	JButton b_back,b_close;
	Container c;
	JButton b_retrieve,b_update,b_delete,b_search; 
	public InsertEX() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {

		UIManager
				.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		setContentPane(new JLabel(new ImageIcon("f://img/bg.jpg")));
//		BufferedImage img = null;
//		try {
//			img = ImageIO.read(new File("d:/java/new/7.jpg"));
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		Image h=img.getScaledInstance(1500,700,Image);
//		ImageIcon i=new ImageIcon(h);
//		setContentPane(new JLabel(i));
		b2 = new JButton("EMPLOYEE DETAILS");
		 //b2 = new JButton(new ImageIcon("f://img/2.jpg"));
		c = getContentPane();
		Image icon = Toolkit.getDefaultToolkit().getImage("f://img/bg.jpg");
		setIconImage(icon);
		// TextField
		f0=new JTextField();
		f1 = new JTextField();
		f2 = new JTextField();
		f3 = new JTextField();
		f4 = new JTextField();
		f5 = new JTextField();
		f6 = new JTextField();
		// RadioButton
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		bg = new ButtonGroup();
		r1.addItemListener(this);
		r2.addItemListener(this);

		// Combo box
		String s[] = { " ", "UG", "PG", "MBA", "MCA", "BCOM" };
		cb = new JComboBox(s);
		cb.addItemListener(this);
		c4 = new JComboBox();
		c5 = new JComboBox();
		c6 = new JComboBox();
		c7 = new JComboBox();
		c4.addItem(" Date");
		c4.addItem(" 1 ");
		c4.addItem(" 2 ");
		c4.addItem(" 3 ");
		c4.addItem(" 4 ");
		c4.addItem(" 5");
		c4.addItem(" 6");
		c4.addItem(" 7");
		c4.addItem(" 8");
		c4.addItem(" 9");
		c4.addItem(" 10");
		c4.addItem(" 11");
		c4.addItem(" 12");
		c4.addItem(" 13");
		c4.addItem(" 14");
		c4.addItem(" 15");
		c4.addItem(" 16");
		c4.addItem(" 17");
		c4.addItem(" 18");
		c4.addItem(" 19");
		c4.addItem(" 20");
		c4.addItem(" 21");
		c4.addItem(" 22");
		c4.addItem(" 23");
		c4.addItem(" 24");
		c4.addItem(" 25");
		c4.addItem(" 26");
		c4.addItem(" 27");
		c4.addItem(" 28");
		c4.addItem(" 29");
		c4.addItem(" 30");
		c4.addItem(" 31");
		c5.addItem("Month");
		c5.addItem("Jan");
		c5.addItem("Feb");
		c5.addItem("Mar");
		c5.addItem("Apr");
		c5.addItem("May");
		c5.addItem("Jun");
		c5.addItem("Jul");
		c5.addItem("Aug");
		c5.addItem("Sep");
		c5.addItem("Oct");
		c5.addItem("Nov");
		c5.addItem("Dec");
		c6.addItem(" year");
		c6.addItem(" 2017");
		c6.addItem(" 2016");
		c6.addItem(" 2015");
		c6.addItem(" 2014");
		c6.addItem(" 2013");
		c6.addItem(" 2012");
		c6.addItem(" 2011");
		c6.addItem(" 2010");
		c6.addItem(" 2009");
		c6.addItem(" 2008");
		c6.addItem(" 2007");
		c6.addItem(" 2006");
		c6.addItem(" 2005");
		c7.addItem("");
		c7.addItem("IT/Software");
		c7.addItem("Infrastructure & Energy");
		c7.addItem("Production/Manufacturing");
		c7.addItem("Embedded");
		c7.addItem("Python");
		c7.setBounds(650, 370, 150, 30);
		add(c7);
		c7.addItemListener(this);
		c4.setBounds(650, 440, 70, 30);
		c5.setBounds(720, 440, 70, 30);
		c6.setBounds(790, 440, 70, 30);
		add(c4);
		add(c5);
		add(c6);
		// TextArea
		a1 = new JTextArea(20, 20);
		JButton b3 = new JButton("Submit");
		b3.setBackground(Color.white);
		// b1.setBounds(150,30,300, 40);
		b2.setBounds(400, 100, 170, 40);
		f0.setBounds(200,150,200,30);add(f0);
		f1.setBounds(200, 200, 200, 30);
		f2.setBounds(200, 250, 200, 30);
		r1.setBounds(200, 300, 100, 30);
		r2.setBounds(300, 300, 100, 30);
		cb.setBounds(200, 350, 200, 30);
		f3.setBounds(200, 400, 200, 30);
		f4.setBounds(200, 450, 200, 30);
		f5.setBounds(650, 200, 200, 30);
		f6.setBounds(650, 500, 200, 30);
		a1.setBounds(200, 500, 200, 70);
		b3.setBounds(400, 600, 150, 40);
		//b_update.addActionListener(this);
	//	b_update.setActionCommand("Open");
	

		 b_search=new JButton("Search");
	     b_search.setBounds(1000,250,150,40);
	     add(b_search);
	     b_search.setFont(new Font("Imprint MT Shadow", Font.ITALIC, 20));
	     b_search.setBackground(Color.magenta);
	     b_retrieve=new JButton("RETRIEVE");
	     b_retrieve.setBounds(1000,450,150,40);
	     b_retrieve.setFont(new Font("Imprint MT Shadow", Font.ITALIC, 20));
	     b_retrieve.setBackground(Color.CYAN);
	   
	     b_update=new JButton("Update");
	     b_update.setBounds(1000,350,150,40);
	     b_update.setFont(new Font("Imprint MT Shadow", Font.ITALIC, 20));
	     add(b_update);
	     b_update.setBackground(Color.green);
	     
	     b_close=new JButton("Logout");
	     b_close.setBounds(1100,50,100,30);
	     add(b_close);
	     b_close.setFont(new Font("Imprint MT Shadow", Font.ITALIC, 20));
	     b_close.setBackground(Color.WHITE);
	     
		JLabel p = new JLabel("Name:");
		JLabel p1 = new JLabel("Age:");
		JLabel p2 = new JLabel("Gender:");
		JLabel p3 = new JLabel(" Qualification:");
		JLabel p4 = new JLabel("E-mail id:");
		JLabel p5 = new JLabel("Mobile Number:");
		JLabel p6 = new JLabel("Address:");
		JLabel p7 = new JLabel("Language Known:");
		JLabel p8 = new JLabel("Date oF Birth:");
		JLabel p10 = new JLabel("Designation:");
		JLabel p11 = new JLabel("Date of Joining:");
		JLabel p12 = new JLabel("Salary:");
		JLabel p9 = new JLabel("REGISTRATION FORM");
		JLabel p13=new JLabel("Id_Number:");
		// checkBox
		c1 = new JCheckBox("Tamil");
		c2 = new JCheckBox("English");
		c3 = new JCheckBox("Telegu");
		c1.setBounds(650, 250, 100, 50);
		c2.setBounds(650, 280, 100, 50);
		c3.setBounds(650, 310, 100, 50);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
		c6.addItemListener(this);
		p13.setBounds(50,140,200,50);
		add(p13);
		p.setBounds(100, 190, 200, 50);
		p1.setBounds(120, 240, 200, 50);
		p2.setBounds(85, 290, 200, 50);
		p3.setBounds(30, 335, 200, 50);
		p4.setBounds(68, 390, 200, 50);
		p5.setBounds(5, 430, 200, 50);
		p6.setBounds(80, 490, 200, 50);
		p7.setBounds(450, 250, 200, 50);
		p8.setBounds(485, 190, 200, 50);
		add(p8);
		p9.setBounds(310, 30, 800, 40);
		add(p9);
		p10.setBounds(500, 365, 200, 50);
		p11.setBounds(470, 430, 200, 50);
		p12.setBounds(550, 490, 200, 50);
		b_back=new JButton("back");
		b_back.setBounds(10,50,100,30);
		add(b_back);
		b_back.setBackground(Color.yellow);
		b_back.setFont(new Font("Imprint MT Shadow", Font.ITALIC, 20));
		add(p7);
		add(p10);
		add(p11);
		add(p12);
		// change font
		p.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		p1.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		p2.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		p3.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		p4.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		p5.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		p6.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		p7.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		p8.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		p13.setFont(new Font("Imprint MT Shadow",Font.BOLD,20));
		p9.setFont(new Font("Imprint MT Shadow", Font.BOLD, 40));
		p10.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		p11.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		p12.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		p.setForeground(Color.BLUE);
		p1.setForeground(Color.BLUE);
		p2.setForeground(Color.BLUE);
		p3.setForeground(Color.BLUE);
		p4.setForeground(Color.BLUE);
		p5.setForeground(Color.BLUE);
		p6.setForeground(Color.BLUE);
		p7.setForeground(Color.BLUE);
		p8.setForeground(Color.BLUE);
		p10.setForeground(Color.BLUE);
		p11.setForeground(Color.BLUE);
		p12.setForeground(Color.BLUE);
		p13.setForeground(Color.BLUE);
		p9.setForeground(Color.BLUE);
    	add(p);
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(f1);
		add(f5);
		add(f6);
		add(f2);
		add(f3);
		add(f4);
		add(r1);
		add(r2);
		// add(b1);
		add(b2);
		add(b3);
		bg.add(r1);
		bg.add(r2);
		add(a1);
		add(cb);
		add(c1);
		add(c2);
		add(c3);
		b3.addActionListener(this);
		setTitle("Admin Registration Form");
		// setSize(800, 900);

		setSize(getToolkit().getScreenSize());
		setLayout(null);
		setVisible(true);
		// c.setBackground(Color.yellow);
		getContentPane().add(b_retrieve);
	
		getContentPane().add(b_search);
		getContentPane().add(b_update);
		b_close.addActionListener(new ActionListener() {
			//to click close button automatically frame closed
			@Override
			public void actionPerformed(ActionEvent ar) {
				// TODO Auto-generated method stub
				if(ar.getSource()==b_close)
				{
				CloseFrame();
			}
			}
			private void CloseFrame() {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		
		
	b_retrieve.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent ae1) {
			// TODO Auto-generated method stub

					dispose();
						try {
							
							new SwingJdbcRetrieveTable();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		}
	});
b_search.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		dispose();
		new AddBook();
	
	}
});
b_update.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent ae1) {
		// TODO Auto-generated method stub

				dispose();
					try {
						new UpdateEmployee();
						//new SwingJdbcRetrieveTable();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (UnsupportedLookAndFeelException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	}
});

getContentPane().add(b_back);
b_back.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg) {
		// TODO Auto-generated method stub
		dispose();
		try {
			new Login();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
});
	}
	
	public void itemStateChanged(ItemEvent ae) {
		// TODO Auto-generated method stub

		// comboBox
		if (ae.getStateChange() == 1) {
			String str = String.valueOf(cb.getSelectedItem());
			value1 = str;
			System.out.println(value1);
			String des = String.valueOf(c7.getSelectedItem());
			value_des = des;
			System.out.println(value_des);

			String date = String.valueOf(c4.getSelectedItem());
			value_date = date;
			String month = String.valueOf(c5.getSelectedItem());
			value_month = month;
			String year = String.valueOf(c6.getSelectedItem());
			value_year = year;

			value_total = value_date + value_month + value_year;
			System.out.println(value_total);
		}

		// radioButton
		if (r1.isSelected()) {
			String rad1 = String.valueOf(r1.getText());
			value3 = rad1;
		}
		if (r2.isSelected()) {
			String rad2 = String.valueOf(r2.getText());
			value3 = rad2;
		}
		System.out.println(value3);

		// checkBox
		if (c1.isSelected()) {
			value2 = String.valueOf(c1.getText());
			// value2=s;
			System.out.println(value2);
		}
		if (c2.isSelected()) {
			value2 = String.valueOf(c2.getText());
			// value2=s1;
			System.out.println(value2);
		}
		if (c3.isSelected()) {
			value2 = String.valueOf(c3.getText());
			// value2=s3;
			System.out.println(value2);
		}

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String k0	=f0.getText();
		String k 	= f1.getText();
		String k1 = f2.getText();
		// int s1 = Integer.parseInt(k1);
		String k2 = f3.getText();
		String k3 = f4.getText();
		// int s2 =Integer.parseInt(k3);
		String k4 = a1.getText();
		String k5 = f5.getText();
		String k6 = f6.getText();
		if (k0.equals("")||k.equals("") || k1.equals("") || k2.equals("") || k3.equals("")
				|| k4.equals("") || k5.equals("") || value1.equals("")
				|| value2.equals("") || value3.equals("")) {
			JOptionPane.showMessageDialog(this, "Required for all Fields",
					"Error", JOptionPane.ERROR_MESSAGE);
		} else {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try(Connection con= DriverManager.getConnection("jdbc:mysql://Localhost/yu", "root", "root")){

				java.sql.PreparedStatement ps = con.prepareStatement("insert into ga values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
				// ps=con.prepareStatement("select  * from java.raja4");
				ps.setString(1, k0);
				ps.setString(2, k);
				ps.setString(3, k1);
				ps.setString(4, value3);
				ps.setString(5, value1);
				ps.setString(6, k2);
				ps.setString(7, k3);
				ps.setString(8, k4);
				ps.setString(9, value2);
				ps.setString(10, k5);
				ps.setString(11, value_des);
				ps.setString(12, value_total);
				ps.setString(13, k6);
				ps.execute();
				ps.close();
				System.out.println("inserted");
			} catch (SQLException e2) {
				System.out.println(e2);
			}

			JOptionPane.showMessageDialog(this, "Successfully datas Inserted");
		}
			}

	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			UnsupportedLookAndFeelException {
		new InsertEX();
	}

}
