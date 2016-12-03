import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Statistika extends JFrame{

	private Scanner scanner_k_negatuvnuh;
	private String s_k_negatuvnuh = "";
	private Scanner scanner_k_serednih;
	private String s_k_serednih= "";
	private Scanner scanner_k_dobre;
	private Scanner scanner_k_pozutuvnuh;
	private String s_k_pozutuvnuh= "";
	private String s_k_dobre= "";
	private Scanner scanner_seredniy_bal;
	private String s_seredniy_bal= "";
	private Scanner scanner_k_ec;
	private String s_k_ec= "";

	public Statistika() { 
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
		
		JLabel label = new JLabel("\u0421\u0442\u0430\u0442\u0438\u0441\u0442\u0438\u043A\u0430");
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.MAGENTA);
		label.setBounds(10, 11, 764, 82);
		getContentPane().add(label);
		
		
		try {
			scanner_k_negatuvnuh = new Scanner(new File("res/Statistika/kilkist_negatuvnuh.txt"));
		} catch (FileNotFoundException e1) {
		}

		while (scanner_k_negatuvnuh.hasNext()) {
			s_k_negatuvnuh = s_k_negatuvnuh + scanner_k_negatuvnuh.next();
		}
		scanner_k_negatuvnuh.close();
		
		try {
			scanner_k_serednih = new Scanner(new File("res/Statistika/kilkist_serednih.txt"));
		} catch (FileNotFoundException e1) {
		}

		while (scanner_k_serednih.hasNext()) {
			s_k_serednih = s_k_serednih + scanner_k_serednih.next();
		}
		scanner_k_serednih.close();
		
		try {
			scanner_k_dobre = new Scanner(new File("res/Statistika/kilkist_dobre.txt"));
		} catch (FileNotFoundException e1) {
		}

		while (scanner_k_dobre.hasNext()) {
			s_k_dobre = s_k_dobre + scanner_k_dobre.next();
		}
		scanner_k_dobre.close();
		
		
		try {
			scanner_k_pozutuvnuh = new Scanner(new File("res/Statistika/kilkist_pozutudnuh.txt"));
		} catch (FileNotFoundException e1) {
		}

		while (scanner_k_pozutuvnuh.hasNext()) {
			s_k_pozutuvnuh = s_k_pozutuvnuh + scanner_k_pozutuvnuh.next();
		}
		scanner_k_pozutuvnuh.close();
		
		try {
			scanner_seredniy_bal = new Scanner(new File("res/Statistika/seredniy_bal.txt"));
		} catch (FileNotFoundException e1) {
		}

		while (scanner_seredniy_bal.hasNext()) {
			s_seredniy_bal = s_seredniy_bal + scanner_seredniy_bal.next();
		}
		scanner_seredniy_bal.close();
		
		try {
			scanner_k_ec = new Scanner(new File("res/Statistika/kilkist_ec.txt"));
		} catch (FileNotFoundException e1) {
		}

		while (scanner_k_ec.hasNext()) {
			s_k_ec  = s_k_ec + scanner_k_ec.next();
		}
		scanner_k_ec.close();
		
		JLabel lblNewLabel = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C  \u0432\u0456\u0434\u043C\u0456\u043D\u043D\u0438\u0445  \u043E\u0446\u0456\u043D\u043E\u043A - " + s_k_pozutuvnuh);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 162, 764, 49);
		getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C  \u0434\u043E\u0431\u0440\u0438\u0445  \u043E\u0446\u0456\u043D\u043E\u043A - " + s_k_dobre);
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Segoe Script", Font.BOLD, 25));
		label_1.setBounds(10, 222, 764, 49);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C  \u0437\u0430\u0434\u043E\u0432\u0456\u043B\u044C\u043D\u0438\u0445  \u043E\u0446\u0456\u043D\u043E\u043A - " + s_k_serednih);
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Segoe Script", Font.BOLD, 25));
		label_2.setBounds(10, 282, 764, 49);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C  \u043D\u0435\u0437\u0430\u0434\u043E\u0432\u0456\u043B\u044C\u043D\u0438\u0445  \u043E\u0446\u0456\u043D\u043E\u043A - " + s_k_negatuvnuh);
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("Segoe Script", Font.BOLD, 25));
		label_3.setBounds(10, 342, 764, 49);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u0421\u0435\u0440\u0435\u0434\u043D\u0456\u0439 \u0431\u0430\u043B \u0432\u0441\u0456\u0445 \u0443\u0447\u043D\u0456\u0432 - " + s_seredniy_bal);
		label_4.setForeground(Color.BLUE);
		label_4.setFont(new Font("Segoe Script", Font.BOLD, 25));
		label_4.setBounds(10, 402, 764, 49);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C  \u043F\u0440\u043E\u0445\u043E\u0434\u0436\u0435\u043D\u044C  \u0440\u0435\u043A\u043E\u043C\u0435\u043D\u0434\u0430\u0446\u0456\u0457 - "  + s_k_ec);
		label_5.setForeground(Color.BLUE);
		label_5.setFont(new Font("Segoe Script", Font.BOLD, 25));
		label_5.setBounds(10, 462, 764, 49);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\Zakk\\Desktop\\fonstola.ru-55651.jpg"));
		label_6.setBounds(0, 0, 794, 572);
		getContentPane().add(label_6);
    	

    	setVisible(true);
		
	}
}
