import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
public class Frontpage {
Frontpage(){
	JFrame j=new JFrame();
	j.setSize(500,600);
	j.setVisible(true);
	j.setLayout(null);
	
	JLabel l=new JLabel("Library Management System");
	l.setBounds(100, 30, 180, 20);
	j.add(l);

	JButton b=new JButton("ADMIN");
	b.setBounds(100,100,100,30);
	j.add(b);
	
	JButton b1=new JButton("LIBRARIAN");
	b1.setBounds(100,150,100,30);
	j.add(b1);
	setContentPane(new JLabel(new ImageIcon("E:\\img/light.jpg")));
	Object c = getContentPane();
	Image icon = Toolkit.getDefaultToolkit().getImage("E:\\img/light.jpg");
	setIconImage(icon);
	
	b.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
	
	
			try {
				Frontpage.this.dispose();
				new AdminLogin1();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
}
	});
	b1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new LibrarianLogin1();
		}
		
	});
};



private void setIconImage(Image icon) {
	// TODO Auto-generated method stub
	
}



private Object getContentPane() {
	// TODO Auto-generated method stub
	return null;
}



private void setContentPane(JLabel jLabel) {
	// TODO Auto-generated method stub
	
}



protected void dispose() {
	// TODO Auto-generated method stub
	
}



public static void main(String[] args) {
	new Frontpage();
}}
