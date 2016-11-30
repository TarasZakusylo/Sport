import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class PravulaMenu extends JFrame{

	String і_emblema_voleybol = "res/emblema_voleybol.png";	
	ImageIcon logo_emblema_voleybol = new ImageIcon(і_emblema_voleybol);
	JLabel l_logo_emblema_voleybol = new JLabel(logo_emblema_voleybol);
	
	String і_emblema_futbol = "res/emblema_futbol.png";	
	ImageIcon logo_emblema_futbol = new ImageIcon(і_emblema_futbol);
	JLabel l_logo_emblema_futbol = new JLabel(logo_emblema_futbol);
	
	String і_emblema_basketbol = "res/emblema_basketbol.png";	
	ImageIcon logo_emblema_basketbol = new ImageIcon(і_emblema_basketbol);
	JLabel l_logo_emblema_basketbol = new JLabel(logo_emblema_basketbol);
	
	String і_emblema_tenis = "res/emblema_tenis.png";	
	ImageIcon logo_emblema_tenis = new ImageIcon(і_emblema_tenis);
	JLabel l_logo_emblema_tenis = new JLabel(logo_emblema_tenis);
	
	String і_emblema_atletik = "res/emblema_atletik.png";	
	ImageIcon logo_emblema_atletik = new ImageIcon(і_emblema_atletik);
	JLabel l_logo_emblema_atletik = new JLabel(logo_emblema_atletik);
	
	String і_fon = "res/fon_pravulaMenu.png";	
	ImageIcon logo_fon = new ImageIcon(і_fon);
	JLabel l_logo_fon = new JLabel(logo_fon);
	
	
	private VpravuSpusok vpravuSpusok ;
	private JList list ; 
	
	String s_nazva = "DodattoviVuddSportu/";
	String s_k_vuvestuProfil = "";
 	JTextArea textArea;
 	File folder = new File(s_nazva);
	File[] listOfFiles = folder.listFiles();
	
	
	PravulaMenu() {
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	setSize(800,600);
	    	setLocationRelativeTo(null);
	    	getContentPane().setLayout(null);
	    	
	    	JButton button = new JButton("\u041C\u0435\u043D\u044E");
	    	button.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent arg0) {
	    			Menu menu = new Menu("Фізична культура в школі");
					setVisible(false);
	    		}
	    	});
	    	button.setBounds(695, 0, 89, 23);
	    	getContentPane().add(button);
	    	
	    	JButton btnNewButton = new JButton("\u0412\u043E\u043B\u0435\u0439\u0431\u043E\u043B");
	    	btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    	btnNewButton.setForeground(Color.BLUE);
	    	btnNewButton.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
 	    			 PravulaVolevbol pravulaVolevbol  = new PravulaVolevbol () ;
 	    			setVisible(false);
	    		}
	    	});
	    	btnNewButton.setBounds(-1, 30, 153, 50);
	    	getContentPane().add(btnNewButton);
	    	
	    	JButton button_1 = new JButton("\u0424\u0443\u0442\u0431\u043E\u043B");
	    	button_1.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent arg0) {
	    			 PravulaFootbol pravulaFootbol  = new PravulaFootbol () ;
	 	    			setVisible(false);
	    		}
	    	});
	    	button_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    	button_1.setForeground(Color.BLUE);
	    	button_1.setBounds(146, 30, 160, 50);
	    	getContentPane().add(button_1);
	    	
	    	JButton button_2 = new JButton("\u0411\u0430\u0441\u043A\u0435\u0442\u0431\u043E\u043B");
	    	button_2.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    			 PravulaBasketbol pravulaBasketbol  = new PravulaBasketbol () ;
	 	    			setVisible(false);
	    		}
	    	});
	    	button_2.setForeground(Color.BLUE);
	    	button_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    	button_2.setBounds(303, 30, 160, 50);
	    	getContentPane().add(button_2);
	    	
	    	JButton button_3 = new JButton("\u041B\u0435\u0433\u043A\u0430 \u0430\u0442\u043B\u0435\u0442\u0438\u043A\u0430");
	    	button_3.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent arg0) {

	    			Atletik atletik  = new Atletik () ;
 	    			setVisible(false);
	    		}
	    	});
	    	button_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    	button_3.setForeground(Color.BLUE);
	    	button_3.setBounds(615, 30, 169, 50);
	    	getContentPane().add(button_3);
	    	
	    	JButton button_4 = new JButton("\u0422\u0435\u043D\u0456\u0441");
	    	button_4.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent arg0) {
	    			PravulaTenis pravulaTenis  = new PravulaTenis () ;
 	    			setVisible(false);
	    		}
	    	});
	    	button_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    	button_4.setForeground(Color.BLUE);
	    	button_4.setBounds(460, 30, 160, 50);
	    	getContentPane().add(button_4);
	    	
	    	setVisible(true);
	    	
	    	JScrollPane scrollPane = new JScrollPane();
	    	scrollPane.setBounds(0, 0, 0, 0);
	    	getContentPane().add(scrollPane);
	    	
	    	JButton btnNewButton_1 = new JButton("\u0414\u043E\u0434\u0430\u0442\u0432\u043E\u0432\u0456 \u0432\u0438\u0434\u0438");
	    	btnNewButton_1.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    			
	    	    	l_logo_emblema_atletik.setBounds(0, 0, 0, 0);
	    	    	l_logo_emblema_tenis.setBounds(0, 0, 0, 0);
	    	    	l_logo_emblema_basketbol.setBounds(0, 0, 0, 0);
	    	    	l_logo_emblema_futbol.setBounds(0, 0, 0, 0);
	    	    	l_logo_emblema_voleybol.setBounds(0, 0, 0, 0);
	    	        	    	
	    	    	scrollPane.setBounds(41, 91, 243, 425);
	    	
	    	    	vpravuSpusok = new VpravuSpusok();
	    	    	
	    	    	list = new JList<String>(vpravuSpusok);
	    	    	list.addMouseListener(new MouseAdapter() {
	    	    		@Override
	    	    		public void mouseClicked(MouseEvent arg0) {
	     
	    	    			JOptionPane.showMessageDialog(null, "Дана методологія розробляється.\nВибачте за тимчасові незручності.");   	 			
	     
	    	    		}
	    	    	});
	    	    	 
	    	     
	    	    	for (int i = 0; i < listOfFiles.length; i++) {
	    				addElement(listOfFiles[i].getName());
	    			}
	    	    	
	    	      	scrollPane.setViewportView(list);
	    	    	
	    		}
	    	});
	    	btnNewButton_1.setForeground(Color.MAGENTA);
	    	btnNewButton_1.setFont(new Font("Verdana", Font.ITALIC, 15));
	    	btnNewButton_1.setBounds(127, 539, 527, 23);
	    	getContentPane().add(btnNewButton_1);
	    	
	    	JLabel label = new JLabel("\u041E\u0441\u043D\u043E\u0432\u043D\u0456 \u0432\u0438\u0434\u0438:");
	    	label.setForeground(Color.MAGENTA);
	    	label.setHorizontalAlignment(SwingConstants.CENTER);
	    	label.setFont(new Font("Verdana", Font.ITALIC, 20));
	    	label.setBounds(104, 4, 581, 29);
	    	getContentPane().add(label);
	    	
	    	l_logo_emblema_atletik.setBounds(624, 79, 160, 483);
	    	getContentPane().add(l_logo_emblema_atletik);	     	
	    	l_logo_emblema_tenis.setBounds(471, 79, 160, 483);
	    	getContentPane().add(l_logo_emblema_tenis);	    	
	    	l_logo_emblema_basketbol.setBounds(314, 79, 160, 483);
	    	getContentPane().add(l_logo_emblema_basketbol);
	    	l_logo_emblema_futbol.setBounds(157, 79, 160, 483);
	    	getContentPane().add(l_logo_emblema_futbol);	    	
	    	l_logo_emblema_voleybol.setBounds(-1, 79, 160, 483);
	    	getContentPane().add(l_logo_emblema_voleybol);	  
	    	l_logo_fon.setBounds(-1, 0, 785, 562);
	    	getContentPane().add(l_logo_fon);	  
	    	
	    	
	}
	public void addElement (String s) {
		vpravuSpusok.addElements(s);
	}
}
