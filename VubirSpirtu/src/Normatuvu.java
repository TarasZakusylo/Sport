import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class Normatuvu extends JFrame{

	private JLabel lblNewLabel_1;

	public Normatuvu() { 
	  	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(800,600);
    	setResizable(false);
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
		
		JLabel lblNewLabel = new JLabel("\u041E\u0431\u0435\u0440\u0456\u0442\u044C \u043A\u043B\u0430\u0441:");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(10, 4, 764, 14);
		getContentPane().add(lblNewLabel);
		
		JRadioButton radioButton = new JRadioButton("5");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				lblNewLabel_1.setIcon(new ImageIcon("res/Norma/Norm5.png"));
			}
		});
		radioButton.setBounds(10, 25, 109, 23);
		getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("6");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("res/Norma/Norm6.png"));
			}
		});
		radioButton_1.setBounds(121, 25, 109, 23);
		getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("7");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("res/Norma/Norm7.png"));
			}
		});
		radioButton_2.setBounds(232, 25, 109, 23);
		getContentPane().add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("8");
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("res/Norma/Norm8.png"));
			}
		});
		radioButton_3.setBounds(345, 25, 109, 23);
		getContentPane().add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("9");
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("res/Norma/Norm9.png"));
			}
		});
		radioButton_4.setBounds(460, 25, 109, 23);
		getContentPane().add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("10");
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("res/Norma/Norm10.png"));
			}
		});
		radioButton_5.setBounds(572, 25, 109, 23);
		getContentPane().add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("11");
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("res/Norma/Norm11.png"));
			}
		});
		radioButton_6.setBounds(685, 25, 89, 23);
		getContentPane().add(radioButton_6);
    	
		ButtonGroup group1 = new ButtonGroup();
		group1.add(radioButton);
		group1.add(radioButton_1);
		group1.add(radioButton_2);
		group1.add(radioButton_3);
		group1.add(radioButton_4);
		group1.add(radioButton_5);
		group1.add(radioButton_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 55, 784, 507);
		getContentPane().add(scrollPane);
		
		lblNewLabel_1 = new JLabel("");
		scrollPane.setViewportView(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

    	setVisible(true);
		
	}
}
