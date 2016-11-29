import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Statistika extends JFrame{

	public Statistika() { 
	  	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(800,600);
//    	setResizable(false);
    	setLocationRelativeTo(null);
    	getContentPane().setLayout(null);  
    	
    	JButton b_Menu = new JButton("\u041C\u0435\u043D\u044E");
		b_Menu.setForeground(Color.BLACK);
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Menu("Фізична культура в школі");
				setVisible(false);
			}
		});
		b_Menu.setBounds(705, 0, 89, 23);
		getContentPane().add(b_Menu);
    	

    	setVisible(true);
		
	}

}
