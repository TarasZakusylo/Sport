import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Menu extends JFrame {
 
	private static final long serialVersionUID = 1L;

	Menu(String s){
		super(s);
	 
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(800,600);
    	setResizable(false);
    	setLocationRelativeTo(null);
    	getContentPane().setLayout(null);   
        	
    	JLabel l_nazva = new JLabel("\u0424\u0456\u0437\u0438\u0447\u043D\u0430 \u043A\u0443\u043B\u044C\u0442\u0443\u0440\u0430 \u0443 \u0448\u043A\u043E\u043B\u0456");
    	l_nazva.setHorizontalAlignment(SwingConstants.CENTER);
    	l_nazva.setBounds(10, 11, 763  , 57 );
    	getContentPane().add(l_nazva);
    	l_nazva.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 40));
    	l_nazva.setForeground(Color.GREEN);
    	
    	JButton b_EC = new JButton("\u042F\u043A\u0438\u0439 \u0432\u0438\u0434 \u0441\u043F\u043E\u0440\u0442\u0443 \u0412\u0430\u043C \u043F\u0456\u0434\u0445\u043E\u0434\u0438\u0442\u044C ?");
    	b_EC.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			new EC ("EC",3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3);
    			setVisible(false);
    		}
    	});
    	b_EC.setForeground(Color.MAGENTA);
    	b_EC.setBounds(30, 93, 721, 37);
    	b_EC.setToolTipText("Експертна система, що рекомендує Вам вид спорту.");
    	getContentPane().add(b_EC);
    	
    	JButton b_Vpravu = new JButton("\u0417\u0430\u0433\u0430\u043B\u044C\u043D\u0456 \u0432\u043F\u0440\u0430\u0432\u0438 \u043D\u0430 \u0440\u043E\u0437\u0432\u0438\u0442\u043E\u043A");
    	b_Vpravu.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			new Vpravu ("Вправи на розвиток");
    			setVisible(false);
    		}
    	});
    	b_Vpravu.setForeground(Color.MAGENTA);
    	b_Vpravu.setToolTipText("Як себе розвивати?");
    	b_Vpravu.setBounds(30, 137, 721, 37);
    	getContentPane().add(b_Vpravu);
    	
    	JButton b_Pravula = new JButton("\u041F\u0440\u0430\u0432\u0438\u043B\u0430 \u0442\u0430 \u0442\u0430\u043A\u0442\u0438\u043A\u0430 \u0433\u0440\u0438 \u0432 \u043E\u0441\u043D\u043E\u0432\u043D\u0456 \u0432\u0438\u0434\u0438");
    	b_Pravula.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			new PravulaMenu ();
    			setVisible(false);
    		}
    	});
    	b_Pravula.setForeground(Color.MAGENTA);
    	b_Pravula.setBounds(30, 182, 721, 37);
    	b_Pravula.setToolTipText("Інструкції щодо повних видів спорту.");
    	getContentPane().add(b_Pravula);
    	
    	JButton b_Normu = new JButton("\u041D\u043E\u0440\u043C\u0430\u0442\u0438\u0432\u0438");
    	b_Normu.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			new Normatuvu (); 
    			setVisible(false);
    		}
    	});
    	b_Normu.setForeground(Color.MAGENTA);
    	b_Normu.setBounds(30, 271, 721, 37);
    	b_Normu.setToolTipText("Нормативи із основних видів спорту, які викладаються у школі.");
    	getContentPane().add(b_Normu);
    	
    	JButton b_Test = new JButton("\u0422\u0435\u0441\u0442\u0443\u0432\u0430\u043D\u043D\u044F");
    	b_Test.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			new Test (); 
    			setVisible(false);
    		}
    	});
    	b_Test.setForeground(Color.MAGENTA);
    	b_Test.setBounds(30, 227, 721, 37);
    	b_Test.setToolTipText("Тестування учнів та перегляд результатів (для учителя).");
    	getContentPane().add(b_Test);
    	
    	JButton b_Rozklad = new JButton("\u0420\u043E\u0437\u043A\u043B\u0430\u0434 \u0443\u0440\u043E\u043A\u0456\u0432");
    	b_Rozklad.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			new Rozklad ();
    			setVisible(false);
    		}
    	});
    	b_Rozklad.setForeground(Color.MAGENTA);
    	b_Rozklad.setBounds(30, 316, 721, 37);
    	b_Rozklad.setToolTipText("Перегляд розкладу занять із фізичної культури");
    	getContentPane().add(b_Rozklad);
    	
    	JButton b_Statustuka = new JButton("\u0417\u0432\u0456\u0442 / \u0421\u0442\u0430\u0442\u0438\u0441\u0442\u0438\u043A\u0430");
    	b_Statustuka.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			new Statistika (); 
    			setVisible(false);
    		}
    	});
    	b_Statustuka.setForeground(Color.MAGENTA);
    	b_Statustuka.setBounds(30, 364, 721, 37);
    	b_Statustuka.setToolTipText("Загальна статистична інформації по роботі із системою");
    	getContentPane().add(b_Statustuka);
    	
    	JLabel lblNewLabel = new JLabel("");
    	lblNewLabel.setIcon(new ImageIcon("res/fon/menu.png"));
    	lblNewLabel.setBounds(0, 0, 794, 572);
    	getContentPane().add(lblNewLabel);
    
    	setVisible(true);
    	
	}
}
