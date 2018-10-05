import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Secondpage {
	Secondpage(){
	JFrame f=new JFrame();
	
	
	JLabel j=new JLabel("ADMIN ACCESS ONLY");
	j.setBounds(100,30, 180, 60);
	f.add(j);
	
	JButton b=new JButton("ADD LIBRARIAN");
	b.setBounds(100,100,150,30);
	f.add(b);
	
	JButton b1=new JButton("VIEW");
	b1.setBounds(100,140,150,30);
	f.add(b1);
	
	JButton b2=new JButton("Logout");
	b2.setBounds(100,180,150,30);
	f.add(b2);
	
	JButton b3=new JButton("UPDATE");
	b3.setBounds(100,220,150,30);
	f.add(b3);

b.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
 
		// TODO Auto-generated method stub
		dispose();
		new AddLibrarian1();
	}

});
b2.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	
});

f.setSize(800, 600);
f.setLayout(null);
f.setVisible(true);
	}
protected void dispose() {
		// TODO Auto-generated method stub
	//new secondpage();
		
	}
public static void main(String[] args) {
	new Secondpage();
}
}
